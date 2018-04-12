
import java.util.Scanner;

public class Part1 {
public static void main(String[] args) {

	String s = "alsjfioanoiagiooa;sdno";
	String newString = removeduplicates(s);
	System.out.println(newString);

}
public static String  removeduplicates (String input){
   //  String output = new String();

     for (int i = 0; i < input.length(); i++) {
         for (int j = i+1 ; j < input.length(); j++) {
             if (input.charAt(i) == input.charAt(j)) {
            	 input = input.substring(0,j) + input.substring(j+1);
             }
         } 
     }
     return input;
     
}
}

