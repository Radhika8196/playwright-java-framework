package leetCode;

import java.util.ArrayList;

public class removeDuplicates {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicatesFromArray(nums));
	}

	public static int removeDuplicatesFromArray(int[] nums) {
		
		// Actual solutions--Same array
//---------------------------------------------------------------------------------------
		
		  int k = 1;
		  
		  for (int i = 1; i < nums.length; i++) { 
		  if (nums[i] != nums[i - 1]) 
		  	nums[k++] = nums[i];
		  
		  }
		  
		  for (int i = 0; i < k; i++) 
		  System.out.println("unique array is: " + nums[i]);
		  
//		  return k;
		  
//---------------------------------------------------------------------------------------
		 
		
		// using a new array
		int[] arr = new int[nums.length];
		int k1 = 1;
		arr[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] == nums[i]) {
				continue;
			}

			else
				arr[k1++] = nums[i];
		}
		
		for (int i = 0; i < k1; i++) 
			System.out.print(arr[i] + " ");
			
		return k;
	}
}
