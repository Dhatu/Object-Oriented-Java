/*******************************************************************************************
Name: Jon Smith
Course: CS125-05
Lab #: Lab Two
Submission Date: 10:00 pm, Wed (7/5)
Brief Description: The driver code to run SumofNumber, create its object, call the methods
to assign and display the sumofNumber from 1 to input...
*********************************************************************************************/



package SumofNumber;

import java.util.Scanner;

public class SumofNumberApp {
	public static void main(String [] args){// main method
		// variables and input sequence to check and calculate
		Scanner scanner = new Scanner(System.in);
		int input = -1; 
		int sum = 0;
		
	//Make sure input is positive and nonzero
	while (input < 1){
		System.out.println("Enter a positive non-zero integer: ");
		input = scanner.nextInt();
	}
	sum = SumofNumber.getSum(sum,input);// use method to get sum from 1 to input
	
	// printout the result
	System.out.println("The sum of numbers from 1 to " + input + " is " + sum);
	
	
	}// end main
}// end of driver class
