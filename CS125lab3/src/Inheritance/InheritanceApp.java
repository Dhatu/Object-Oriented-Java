package Inheritance;

import java.util.Scanner;

public class InheritanceApp {

    public static void main(String[] args)
    { // main method
    	// string objects for references later
        String name; String n;
        String number; String num;
        String hireDate; String hd;
        int shift;
        double payRate; double rate;
         
        Scanner s = new Scanner(System.in);
         
        System.out.println("Enter your name: ");
        name = s.nextLine(); //input name
         
        System.out.println("Enter your employee number: ");
        System.out.println("(Format: NNN-L)");
        number = s.nextLine(); // input employee information
                 
        System.out.println("Enter your hire date: ");
        hireDate = s.nextLine(); // input date
         
        System.out.println("Enter your payrate: ");
        payRate = s.nextDouble(); // input payrate
         
        System.out.println("Enter your shift (day=1, night=2): ");
        shift = s.nextInt(); 
         
         
         
        //Production worker object
        ProductionWorker myWorker = new ProductionWorker(name, number,
                             hireDate, shift, payRate);
        //Employee Info 
        System.out.println("--- ------- Employee Info -----------");
        System.out.println("Name: " + myWorker.getName()); //name via get method
        System.out.println("Employee Number: " + myWorker.getNumber()); //employee # via get method
        System.out.println("Hire Date: " + myWorker.getHireDate()); //hire date via get method
        System.out.println("Pay Rate: " +myWorker.getPayRate()); //pay rate via get method
        System.out.println("Shift: " +myWorker.getShift()); //shift via get method
    }
     
     
}
	
