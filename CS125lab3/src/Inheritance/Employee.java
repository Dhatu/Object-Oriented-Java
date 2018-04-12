package Inheritance;

public class Employee {

	    //private fields
	    public String name;
	    public String number;
	    public String hireDate;
	    private boolean validNumber= false;
	     
	    //constructor method
	    public Employee(String n, String num, String hd)
	    {
	        name = n;
	        number = num;
	        hireDate = hd;
	    }
	     
	    public String getName()
	    {
	        return name; //get method for name from object ref.
	    }
	     
	    public String getNumber()
	    {       
	        while (validNumber = false) // conditions to when number is invalid
	        {
	            if (number.length()!=5) //higher or lower then 5
	               {
	                System.out.println("Invalid employee number.");
	                
	            }
	            else if // checks if the character requirements are met are met or not
	                  (((!Character.isDigit(number.charAt(0))) || ((!Character.isDigit(number.charAt(1)))) ||
	                  ((!Character.isDigit(number.charAt(2)))) || (number.charAt(3) !='-') ||
	                  ((!Character.isDigit(number.charAt(4)))) || 
	                  (!(number.charAt(4)>= 'A' && number.charAt(4)<='M'))))
	                   
	                  {
	                    System.out.println("Invalid employee number.");
	                    System.out.println("Enter your employee number: ");
	                  }
	                 
	             else
	                validNumber = true; // continue the program
	            }
	        return number; // end get method
	    }
	     
	    public String getHireDate()
	    {
	        return hireDate; //get method for name from object reference
	    }
	     
	    public String toString() //change to String for script
	    {
	        String str = "Name: " +name+ "\nEmployee Number: ";//str to listing
	         
	        if(number =="") //conditions for the string
	        {
	            str+="Invalid Employee Number"; 
	        }
	        else
	        {
	            str+=number; 
	        }
	        str +=("\nHire Date: " +hireDate); // add date
	        return str;
	    }
	}

