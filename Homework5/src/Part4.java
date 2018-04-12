import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part4 {
	
public static int[] interleavetArrays(int[] array1, int[] array2, int stride , int maxElements){

	int[] answer = new int[array1.length + array2.length];
    int i = 0, j = 0, k = 0;

    while (i < array1.length && j < array2.length)
    {
        if (array1[i] < array2[j])       
            answer[k++] = array1[i++];
        do {
        	
       
        }

        else        
            answer[k++] = array1[j++];               
    }

    while (i < array1.length)  
        answer[k++] = array1[i++];


    while (j < array1.length)    
        answer[k++] = array2[j++];

    if (answer.length > maxElements)
    	System.out.println("null");
    if (stride <= 0)
    	System.out.println("null");
    
    return answer;
}
}
