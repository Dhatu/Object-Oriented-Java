/*******************************************************************************************
Name: Sudhin Domala
Course: CS125-05
Lab #: Lab Two
Submission Date: 10:00 pm, Wed (7/5)
Brief Description: The driver code to run AreaComputing, create its object, call the methods
to assign and display the Area of desired shape with formula methods.
*********************************************************************************************/




package Area;

import Area.AreaComputing.Area;
import java.util.Scanner;
public class AreaComputingApp {
	public static void main(String[] args) { // main method
		System.out.printf("Pick which shape you looking to find the area for (all lowercase):");
		Scanner scanner = new Scanner(System.in);
		String shapeinput = null ; 
		shapeinput = scanner.nextLine(); // field for user shape input
		
	    if (shapeinput.equals("circle")){ // picked circle 
		// Area of a circle
	    System.out.println("Enter the radius: "); // ask for radius 
	    	double radiusinput = scanner.nextInt();
	    System.out.println("The area of the circle is " + Area.getArea(radiusinput));
	    }
	    if (shapeinput.equals("rectangle")){ // picked rectangle
	    // Area of a rectangle
	    System.out.println("Enter the length and width: "); // ask for rectangle parameters
	    	int rlengthinput = scanner.nextInt(); // fields for parameters
	    	int rwidthinput = scanner.nextInt();

	    System.out.println("The area of a rectangle is " +
	            Area.getArea(rlengthinput, rwidthinput));
	    }
	    if (shapeinput.equals("cylinder")){ // picked cylinder 
	    // Area of cylinder
	    System.out.println("Enter the radius and height: "); // ask for cylinder parameters
	    	double cradiusinput = scanner.nextDouble(); // fields for parameters
		    double cheightinput = scanner.nextDouble();
	    System.out.println("The area of the cylinder is " +
	            Area.getArea(cradiusinput, cheightinput)); 
	    }
	}
}// end of driver class
