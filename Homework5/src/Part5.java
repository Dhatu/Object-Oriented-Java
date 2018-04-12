import java.util.Scanner;

public class Part5 {
	   public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	System.out.println("eNTER INTERGER: ");
	int numCols = stdin.nextInt();
	 int[][] matrix = 
	        {
	            { 1, 2, 3, 4, 5, 6, 7 },
	            { 1, 2, 3, 4, 5, 6, 7 },
	            { 1, 2, 3, 4, 5, 6, 7 },
	            { 1, 2, 3, 4, 5, 6, 7 }
	        };
	   }
	 public static void rotateRight(int[][] matrix , int numCols){
	    if(matrix.length != 0 && matrix[0].length != 0){

	        int temp = matrix[numCols][matrix[numCols].length - 1];

	        for(int col = 1; col < matrix[numCols].length; col++){
	        	matrix[numCols][col] = matrix[numCols][col - 1]; 
	        }

	        matrix[numCols][0] = temp;
	        	    }
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	}        
	}
