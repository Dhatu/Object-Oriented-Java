/*******************************************************************************************
Name: Sudhin Domala
Course: CS125-01
Lab #: Lab 5
Submission Date: 10:00 pm, Wed (8/2)
Brief Description: This is a JOptionpane version of finding miles per gallon with input of miles and gallons in the GUI
*********************************************************************************************/

import javax.swing.JOptionPane;


//import java.util.Scanner;
public class MPGCalculatorApp {
	public static void main (String [] args){ //main class
		//Scanner scanner = new Scanner(System.in);
		
		//Declare variables
		double userMiles; 
		double userGallons;
		double milesPerGallon;
		String userStringOutput;
		
		userStringOutput = 	JOptionPane.showInputDialog("Please enter the miles: ");//display desired miles value
		userMiles = Double.parseDouble( userStringOutput );// input of user's info as a double
		
		
		
		
		userStringOutput = 	JOptionPane.showInputDialog("Please enter the gallons of gas used: "); //display desired gallons value
		userGallons = Double.parseDouble( userStringOutput ); // input of user's info as a double
		
		try
	       {
	           MPGCalculator t1 = new MPGCalculator(userMiles,userGallons); //parameters of exception
	       }
	       catch (Invalidentry e) //catch exception if passed try
	       {
	           System.out.println(e.getMessage()); //display message
	           System.exit(0); //exit program due to error
		
		milesPerGallon = userMiles / userGallons; //calculation of inputs
		
		JOptionPane.showMessageDialog(null, "Miles per gallons is: " + milesPerGallon); //display result
		
		
		/*
		System.out.println("Please enter the miles: ");
		userMiles = scanner.nextDouble();
		
		System.out.println("Please enter the gallons of gas used: ");
		userGallons = scanner.nextDouble();
		
		milesPerGallon = userMiles / userGallons;
		
		System.out.println("Miles per gallon is " + milesPerGallon );
		*/
		
	}
}
}
