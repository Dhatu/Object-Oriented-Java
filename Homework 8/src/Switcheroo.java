import java.util.Arrays;

public class Switcheroo {
	public static void main(String[] args){
		int[] nums =  {5,3,-5,50,2,4,6,-60};
		replaceMult5(nums, 99);
		System.out.println(Arrays.toString(nums));
		
	}
	public static void replaceMult5(int[] nums, int newVal){
		replaceMult5(nums, newVal, nums.length - 1);
	}
	public static int[] replaceMult5(int[] nums ,int newVal ,int i){
		if (i == -1){
			return nums;
		}
		else if (nums[i] % 5 == 0){
			nums[i] = newVal;
			return replaceMult5(nums,newVal, i - 1);
		}
		else if (nums[i] % 5 != 0){
			 return replaceMult5(nums,newVal, i - 1);	 
		}
		return nums;
		
		
		}
		
	}


