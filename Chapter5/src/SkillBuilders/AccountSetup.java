package SkillBuilders;


import java.text.*;
import java.lang.*;
import java.util.Scanner;
public class AccountSetup 
{
	public static void main(String[] args) 
	{
		//Declaration
		String userName, password;
		
		//Allows you to format any decimal number
		DecimalFormat dc = new DecimalFormat("0.0");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a username: ");
		userName = input.nextLine();
		userName = userName.toLowerCase();
	}
}
