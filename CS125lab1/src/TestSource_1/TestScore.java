package TestSource_1;

import java.util.Scanner;

/*******************************************************************************************
Name: Sudhin Domala
Course: CS125-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (6/28)
Brief Description: The driver code to run TestScore, create its object, call the methods
to assign and display the average of 3 inputed test scores.
*********************************************************************************************/


public class TestScore { 
	// Create Test score fields
	private int testscore1;
	private int testscore2;
	private int testscore3;
	// constructor for the input of 3 scores in methods
	public TestScore( int score1, int score2, int score3){
		this.testscore1 = score1;
		this.testscore2 = score2;
		this.testscore3 = score3;
	}
	// constructor to make a object to refer to
	public TestScore() {
		
	}
	// 3 access methods
    public double getScore1() {
        return testscore1;
    }

    public double getScore2() {
        return testscore2;
    }

    public double getScore3() {
        return testscore3;
    }
    
    //3 mutator methods 
    public void setScore1(int score) {
		testscore1 = score;
    }

    public void setScore2(int score) {
    	testscore2 = score;
    }

    public void setScore3(int score) {
    	testscore3 = score;
    }
    
    
    // access method for average of the 3 scores
    public double getAvgScore() {
        return (testscore1 + testscore2 + testscore3) / 3;
    }
 	
}