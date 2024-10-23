package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare 
{
	
	public static void main(String[] args)
	{
	
		int num, squared;
		double squareRoot;
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter an Integer:");
	
		num = input.nextInt();
	
		squareRoot = Math.sqrt(num);
	
		squared = (int)Math.pow((int)squareRoot, 2);
		
		if(num == squared)
		{
			System.out.println("The number is a perfect square.");
			
		}
		else
		{
			System.out.println("The number is NOT a perfect square");
		}
	
	}

}
	
  