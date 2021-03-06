package TestScore_2;

/*******************************************************************************************
Name: Sudhin Domala
Course: CS125-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (6/28)
Brief Description: The driver code to run TestScore, create its object, call the methods
to assign and display the average of 3 inputed test scores.
*********************************************************************************************/

import java.util.Scanner;

public class TestScoreApp2 { //Driver class
	public static void main(String[] args) { //main method

		//Create 3 variables 
	    int firsttest; 
	    int secondtest;
	    int thirdtest;

	    //Create a scanner for keyboard input.
	    Scanner scan = new Scanner(System.in);

	    //Ask for the input of test scores
	    System.out.print("Enter test score: ");
	    firsttest = scan.nextInt();

	    System.out.print("Enter test score: ");
	    secondtest = scan.nextInt();

	    System.out.print("Enter test score:");
	    thirdtest = scan.nextInt();

	    scan.close(); // close scanner

	    TestScore2 classProgram = new TestScore2(); // make object
	    classProgram.setScore1(firsttest); //set input to one in TestScore2
	    classProgram.setScore2(secondtest);//set input to one in TestScore2
	    classProgram.setScore3(thirdtest); //set input to one in TestScore2
	    double avg = classProgram.getAvgScore(); // call method for average
	    // Display average
	    System.out.println("The average test score: "
	            + avg);
	    // Display Letter grade
	    System.out.println("The Letter grade is : " + classProgram.getGrade(avg));
	    
	} //end of the driver class
}
