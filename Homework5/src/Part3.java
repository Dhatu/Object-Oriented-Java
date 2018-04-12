import java.util.Scanner;

public class Part3 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("eNTER INTERGER: ");
		int num = stdin.nextInt();	
	}
	public static int lowestBasePalindrome(int num){
	    String s ="";
	    int base = 0;
	    for(; base<=num-1;base++){
	        int num1 = num;
	        while(num1>0){

	            int rem = num%base;
	            num1 = num1/base;
	            if(rem<=base){
	                s=rem+s;
	            }
	        }int result = Integer.valueOf(s);
	        int result1 = result;
	        int reverse = 0;
	        while(result1>0){

	            int dig = result1%10;

	            reverse = reverse*10+dig;
	            result1 = result1/10;
	        }if(reverse == result){
	            System.out.print(base);
	            break;
	        }
	    }return base;
	}
}
