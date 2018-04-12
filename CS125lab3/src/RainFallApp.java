import java.util.Arrays;
import java.util.Scanner;

public class RainFallApp {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

        System.out.println ("How many rainfall figures you want to put in the array for this year?");
        double num = input.nextDouble(); // get array length input
        double thisYear[] = new double[(int) num]; //use array length to make a year array

        for (int i = 0; i < num; i++) {
            System.out.println ("number " + i + ":"); //loop over for each figure 
            thisYear[(int) i] = input.nextDouble(); //place in sequential array input
        }

        for (double temp : thisYear){
            System.out.print (temp + "\t");
        }
	    // Array representing rainfall figures
	    // position correlates to the month

	    RainFall rf = new RainFall(thisYear); 

	    // Display the statistics.
	    System.out.println("The total rainfall for this year is "
	           + rf.getTotalRainFall()); //printout for total
	    System.out.println("The average rainfall for this year is "
	            + rf.getAverageRainFall()); //printout for average

	    int high = rf.getHighestMonth(); // use get method for highest
	    System.out.println("The month with the highest amount of rain " + "is "
	            + (high + 1) + " with " + rf.getRainAt(high) + " inches.");
	    int low = rf.getLowestMonth(); // use get method for lowest
	    System.out.println("The month with the lowest amount of rain " + "is "
	            + (low + 1) + " with " + rf.getRainAt(low) + " inches.");
	}

	@SuppressWarnings("null")
	public double getRainAt(int e) {
		double[] rain = null;
		return rain[e];
	}
}
