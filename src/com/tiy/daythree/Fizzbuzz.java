package com.tiy.daythree;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		for (int i = 115; i > 0; i -= 1) {
			
			if(((i % 3) == 0) & ((i % 5) == 0) & ((i % 7) == 0))
			{
				System.out.println("FizzBuzzBang");
			}
			else if (((i % 3) == 0) & ((i % 5) == 0))
			{
				System.out.println("FizzBuzz");
			}
			else if (((i % 3) == 0) & ((i % 7) == 0))
			{
				System.out.println("FizzBang");
			}
			else if (((i % 5) == 0) & ((i % 7) == 0))
			{
				System.out.println("Bang Buzz");
			}
			else if (((i % 7) == 0))
			{
				System.out.println("Bang");
			}
			else if (((i % 5) == 0))
			{
				System.out.println("Buzz");
			}
			else if (((i % 3) == 0))
			{
				System.out.println("Fizz");
			}
			System.out.println(i);
	}
	}
}
