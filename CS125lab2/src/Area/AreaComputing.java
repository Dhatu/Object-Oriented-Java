package Area;

public class AreaComputing {
	public static class Area {// class for methods 

		//Method should calculate the area of a circle
	     
	    public static double getArea(double radius) {
	        return Math.PI * radius * radius;
	        //return area of a circle to end method
	    }

	    //Method should calculate the area of a rectangle
	    
	    public static double getArea(int length, int width) {
	        return length * width;
	        // return area of a rectangle to end method
	    }

	    
	     // Method should calculate the area of a cylinder
	    public static double getArea(double radius, double height) {
	        return Math.PI * radius * radius * height;
	     // return area of a cylinder to end method
	    }
	}
	}

