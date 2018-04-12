package Inheritance;

import java.text.DecimalFormat;

public class ProductionWorker extends Employee 
	{
	   
	   public static int dayShift =1;
	   public static int nightShift=2;
	   private int shift;
	    
	   private double payRate;
	   private boolean rightShift =false;
	    
	   // get shift set by input number
	   public String getShift() 
	   {
	       String shiftTime;
	        
	       if (shift==1)
	            shiftTime = "Day";
	       else if (shift==2) 
	            shiftTime = "Night";
	       else if (shift==3)
	            shiftTime = "Alternating";
	       else
	            shiftTime = "On Call";
	                    
	       return shiftTime;
	    }
	 
	    
	   public void setShift(int s)
	    {
	        shift = s; //set method for shift
	    }
	     
	   public double getPayRate()
	   {
	       return payRate; //get method for main
	    }
	     
	   public void setPayRate(double rate)
	   {
	        payRate = rate;  // set rate to rate
	   }
	    
	        
	        
	   /**
	    * Constructor initializes a name, number and hire date
	    */
	    
	   public ProductionWorker(//String name, String number, String hireDate, 
	    String n, String num, String hd, int sh, double rate)
	   {
	       
	       super(n, num, hd);
	       shift = sh;
	       payRate = rate;
	    }
	    
	   // Constructor for PW shift 
	    public ProductionWorker(String n, String num, String hd)
	    {
	        super(n, num, hd); // employee info
	        shift = dayShift; // select shift
	        payRate = 0.0; //set #
	    }
	   
	    
	    public String toString()
	    {
	        DecimalFormat dollar = new DecimalFormat("#,##0.00"); //proper display
	         
	        String str = super.toString(); //string converted w/ conditions
	         
	        str+= "\nShift: ";
	        if(shift==dayShift) //output regard shift type
	            str+="Day";
	        else if (shift ==nightShift) //output regard shift type
	            str+="Nights";
	        else
	            str+= "Invalid Shift Number";  //output regard shift type
	             
	        str+= ("\n Hourly Pay Rate: $" + 
	            dollar.format(payRate));
	        // change string with proper format    
	        return str;
	    }	
	}

