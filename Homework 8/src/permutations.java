import java.util.ArrayList;
public class permutations  {
	public static void main (String[] args){
		int[] nums =  {4, 7, 1, 2};
		System.out.println("\nPart 3:");
		ArrayList<int[]> perms = permutations.permuteArray(nums);
		System.out.println("permuteArray({4, 7, 1, 2}):");
		// uncomment the following code once you have implemented permuteArray()		
		for (int[] array: perms) {
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + " ");
			System.out.println();
		}
}
	public static ArrayList<int[]> permuteArray(int[] array){
	ArrayList<int[]> result = new ArrayList<int[]>();
	Permutations(array ,new int[]{},result);
	return result;
	}
	public static void Permutations(int[] array, int[] arrayy, ArrayList<int[]> result){
		if(array.length == 0){
			result.add(arrayy);
			return;
		}
		for(int i=0; i<array.length; i++){
		int[] array2 = new int[array.length-1];
		if (i > 0){
			System.arraycopy(array, 0, array2, 0, i);
		}
		if(i < array.length - 1){
			System.arraycopy(array, i+1 , array2, i, array.length-i-1);
		}
		int[] arrayy2 = new int[arrayy.length+1];
				System.arraycopy(arrayy, 0, arrayy2, 0, arrayy.length);
				arrayy2[arrayy.length] = array[i];
				Permutations(array2,arrayy2,result);
		}
		}
	
	}


