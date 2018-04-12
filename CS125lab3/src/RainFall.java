import java.util.Arrays;

public class RainFall {
	private double[] rain; // create a new empty array

	public RainFall(double rf[]) {

	   
	    rain = new double[rf.length]; // Create rain array to equal length of r array

	    for (int i = 0; i < rf.length; i++) { //loop to input array values
	        rain[i] = rf[i]; // have loop over all values of rf to rain
	    }
	}

	public double getTotalRainFall() {
	    return Arrays.stream(rain).sum(); //java function that gets total of array values
	}

	public double getAverageRainFall() {
	    return Arrays.stream(rain).average().getAsDouble(); //java function that gets avg of array values
	}

	public int getHighestMonth() {

	    int highest = 0; 

	    // Find the element with the highest value.
	    for (int i = 1; i < rain.length; i++) { // loop over entire array length
	        if (rain[i] > rain[highest]) // sort higher over the previous highest number
	            highest = i; //replace with new num
	    }

	    // Return the element number.
	    return highest;
	}

	public int getLowestMonth() {
	    int lowest = 0;

	    // Find the element with the lowest value.
	    for (int i = 1; i < rain.length; i++) { // loop over entire array length
	        if (rain[i] < rain[lowest]) // sort lower over the previous lowest number
	            lowest = i; //replace with new number
	    }
	    // Return the element number.
	    return lowest;
	}

	public double getRainAt(int e) {
	    return rain[e]; // return specific array value 0-rain.length
	}
}
