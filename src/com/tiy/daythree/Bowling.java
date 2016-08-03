package com.tiy.daythree;

import java.util.stream.IntStream;

public class Bowling {
	
	 public static void main(String[] args) {
	        
		        
		        int pinsKnockedDown = 0;
		        int pinsRemaining = 10;
		        int totalScore = 0;
		        int[] totalThrow = new int[21];
		        int[] totalFrame = new int[10];
		        
		        //generates 10 frames of throws
		        for (int frame = 1; frame <=10; frame++) {
		            //special logic for frame 10 because frame 10 breaks all the rules
		            if (frame == 10) {
		                pinsKnockedDown = (int) (Math.random() * 11);
		                totalThrow[18] = pinsKnockedDown;
		                //System.out.println("Frame 10 throw 1 = " + totalThrow[18]);
		                //handles strikes
		                if (pinsKnockedDown == 10) {
		                    pinsKnockedDown = (int) (Math.random() * 11);
		                    totalThrow[19] = pinsKnockedDown;
		                    //System.out.println("Frame 10 throw 2 = " + totalThrow[19]);
		                    pinsRemaining = 10 - pinsKnockedDown;
		                    pinsKnockedDown = (int) (Math.random() * (pinsRemaining + 1));
		                    totalThrow[20] = pinsKnockedDown;
		                    //System.out.println("Frame 10 throw 3 = " + totalThrow[20]);
		                } else {
		                    pinsRemaining = 10 - pinsKnockedDown;
		                    pinsKnockedDown = (int) (Math.random() * (pinsRemaining + 1));
		                    totalThrow[19] = pinsKnockedDown;
		                    //System.out.println("Frame 10 throw 2 = " + totalThrow[19]);
		                    //handles spares
		                    if (totalThrow[18] + totalThrow[19] == 10) {
		                        totalThrow[20] = (int) (Math.random() * 11);
		                        //System.out.println("Frame 10 throw 3 = " + totalThrow[20]);
		                    } else {
		                        totalThrow[20] = 0;
		                        //System.out.println("Frame 10 throw 3 = " + totalThrow[20]);
		                    }
		                }
		            //logic for frames 1-9    
		            } else {
		                pinsKnockedDown = (int) (Math.random() * 11);
		                totalThrow[frame * 2 - 2] = pinsKnockedDown;
		                //System.out.println("Frame " + frame + " throw 1 = " + totalThrow[frame * 2 - 2]);
		                pinsRemaining = 10 - pinsKnockedDown;
		                pinsKnockedDown = (int) (Math.random() * (pinsRemaining + 1));
		                totalThrow[frame * 2 - 1] = pinsKnockedDown;
		                //System.out.println("Frame " + frame + " throw 2 = " + totalThrow[frame * 2 - 1]);
		            }
		            
		        }
		    
		        for (int framex = 1; framex <= 10; framex++) {
		            //special logic for frame 10
		            if (framex == 10) {
		                if ((totalThrow[18] == 10) || (totalThrow[18] + totalThrow[19] == 10)) {
		                    totalFrame[9] = totalThrow[18] + totalThrow[19] + totalThrow[20];
		                    //System.out.println("Frame 10 score was " + totalFrame[9]);
		                } else {
		                    totalFrame[9] = totalThrow[18] + totalThrow[19];
		                    //System.out.println("Frame 10 score was " + totalFrame[9]);
		                }
		            } else {
		                //checks for strikes
		                if (totalThrow[framex * 2 - 2] == 10) {
		                    //checks for double strikes
		                    if (totalThrow[framex * 2] == 10) {
		                        totalFrame[framex] = totalThrow[framex * 2 - 2] + totalThrow[framex * 2] + totalThrow[framex * 2 + 2];
		                        System.out.println("Frame " + framex + " score was " + totalFrame[framex]);
		                    //handles strike then non-strike
		                    } else {
		                        totalFrame[framex] = totalThrow[framex * 2 - 2] + totalThrow[framex * 2] + totalThrow[framex * 2 + 1];
		                        System.out.println("Frame " + framex + " score was " + totalFrame[framex]);
		                    }
		                //checks for spares
		                } else if (totalThrow[framex * 2 - 2] + totalThrow[framex * 2 - 1] == 10) {
		                    totalFrame[framex] = totalThrow[framex * 2 - 2] + totalThrow[framex * 2 - 1] + totalThrow[framex * 2];
		                    System.out.println("Frame " + framex + " score was " + totalFrame[framex]);
		                //handles all non-strikes/spares
		                } else {
		                    totalFrame[framex] = totalThrow[framex * 2 - 2] + totalThrow[framex * 2 - 1];
		                    System.out.println("Frame " + framex + " score was " + totalFrame[framex]);
		                }
		            }
		        }
		        totalScore = IntStream.of(totalFrame).sum();        
		        System.out.println("Your score is " + totalScore);
		    }
		    
		}