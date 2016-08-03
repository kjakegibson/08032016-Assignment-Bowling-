package com.tiy.daythree;

public class TwelveDaysofXmas {
	
	public static void main(String[] args)
	{
		for (int day = 1; day < 13; day += 1)
		{
			System.out.print("On the " + day);

			switch(day)
			{
			case 1:
				System.out.print("st");
				break;
			case 2:
				System.out.print("nd");
				break;
			case 3:
				System.out.print("rd");
				break;
				default:
					System.out.print("th");
					break;
			}
			System.out.print(" day of Xmas my true love gave to me\n");
			
			switch (day)
			{
			case 12:
				System.out.println(" twelve twelve drummers drumming");
				break;
			case 11:
				System.out.println(" eleven pipers piping");
				break;
			case 10:
				System.out.println(" ten lords-a-leaping");
				break;
			case 9:
				System.out.println(" nine ladies dancing");
				break;
			case 8:
				System.out.println(" eight maids-a-milking");
				break;
			case 7:
				System.out.println(" seven swans-a-swimming");
				break;
			case 6:
				System.out.println(" six geese a laying");
				break;
			case 5:
				System.out.println(" five golden rings");
				break;
			case 4:
				System.out.println(" four calling birds");
				break;
			case 3:
				System.out.println(" three french hens");
				break;
			case 2:
				System.out.println(" two turtle doves");
				break;
			case 1:
				System.out.println(" and a partridge in a pear tree");
				break;
			}
			
		}
			

	}

}
