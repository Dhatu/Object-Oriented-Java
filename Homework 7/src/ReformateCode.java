//Sudhin Domala
//110475495
//CSE 114
// Homework 7 Part 3



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ReformateCode{
	      public static void main(String[] args) throws Exception{
	        File f1 = new File (args[0]);
	        File f2 = new File(args[1]);

	        Scanner scr1 = new Scanner(f1);
	        StringBuffer sb1 = new StringBuffer();
	        PrintWriter pw1 = new PrintWriter(f2);
	        while(scr1.hasNext()){
	            sb1.append(scr1.nextLine() + System.lineSeparator());
	        }
	        scr1.close();

	        String output = format(sb1.toString());
	        System.out.println(output);
	        pw1.print(output);
	        pw1.close();
	    }

	public static String format(String s){
	        String result ="";  
	        result = s.replaceAll("\\\r\\n\\s\\{","\\{");
	        return result;
	    }

	}
