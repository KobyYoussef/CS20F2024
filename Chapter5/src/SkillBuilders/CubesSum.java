package SkillBuilders;

import java.util.Scanner;

public class CubesSum 
{
	
	public static void main(String[] args)
	{
		
		int number;
		int digit = 0;
		int sumOfCubes = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		number = input.nextInt();
		
		do
		{
			digit = number % 10;
			sumOfCubes = sumOfCubes + digit * digit * digit;
			number = number / 10;
			
		
	}while(number != 0);
		
	System.out.println("the sum of the cubes of the digits is: " + sumOfCubes);
	}
}
