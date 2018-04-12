//Sudhin Domala
//110475495
//CSE 114
// Homework 7 Part 2

import java.util.Scanner;
import java.util.regex.Pattern;
public class HexBinDec {
	public static void main (String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a binary #: ");
		String bin = stdin.nextLine();
		try{
			int bin2Dec = binaryToDecimal(bin);
			System.out.println("The decimal value is " + bin2Dec);
		}
		catch (NumberFormatException e){
			System.out.println("Input string is not in a binary format.");
		}
		System.out.println("Enter a hexadecimal #: ");
		String hex = stdin.nextLine();
		try{
			int hex2Dec = hecadecimalToDecimal(hex);
			System.out.println("The decimal value is " + hex2Dec);
		}
		catch (NumberFormatException e){
			System.out.println("Input string is not in a hexadecimal format.");
		}
	}
	public static int hecadecimalToDecimal(String hexString){
		String hex = "0123456789ABCDEF";
		hexString = hexString.toUpperCase();
		int total=0;
		for( int i=0; i<hexString.length();i++){
			if (hexString.charAt(i) == 'G' || hexString.charAt(i) == 'H' || hexString.charAt(i) == 'I' || hexString.charAt(i) == 'J' || hexString.charAt(i) == 'K' || hexString.charAt(i) == 'L' || hexString.charAt(i) == 'M' || hexString.charAt(i) == 'N' || hexString.charAt(i) == 'O' || hexString.charAt(i) == 'P' || hexString.charAt(i) == 'Q' || hexString.charAt(i) == 'R' || hexString.charAt(i) == 'S' || hexString.charAt(i) == 'T' || hexString.charAt(i) == 'V' || hexString.charAt(i) == 'W' || hexString.charAt(i) == 'X' || hexString.charAt(i) == 'Y' || hexString.charAt(i) == 'Z' || hexString.charAt(i) == 'U' ){
				throw new NumberFormatException("Not a valid Format for a hexadecimal number");
		}
		char a = hexString.charAt(i);
		int b = hex.indexOf(a);
		total = (16*total)+b;
	}
		return total;
		
		}
	public static int binaryToDecimal(String binString){
		String pattern = "[0-1]";
		boolean right = Pattern.matches(pattern, binString);
		int decimalValue = 0;
		if (right){
			for(int j =0; j < binString.length(); j++ ){
				Character binary = binString.charAt(j);
				String temp = binary.toString();
				int tempinteger = Integer.parseInt(temp);
				decimalValue = decimalValue * 2 + tempinteger;
				}
			return decimalValue;
			}
		else{
			throw new NumberFormatException("Not a valid format for a binary number");
		}
		}
}

