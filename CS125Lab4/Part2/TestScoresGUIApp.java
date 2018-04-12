import java.util.Scanner;

public class TestScoresGUIApp  {
 public static void main(String args[]){
//Create 3 variables 
	 	    int firsttest = 0; 
	 	    int secondtest = 0;
	 	    int thirdtest = 0;

	 	   

	 	    TestScoresGUI classProgram = new TestScoresGUI(); // make object
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
 
