package leetCode;

public class RemoveAnElement {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int ele = 2;
		
		
		System.out.println("Length of the updated array: " + removeEle(arr, ele));


	}

	public static int removeEle(int[] arr, int e) {

		int k =0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] != e)
			{
				arr[k++] = arr[i];
				//System.out.println("aelement added is" + arr[k]);
				//k = k + 1;
			
			}		
		}
		  for (int i = 0; i < k; i++) 
			  System.out.println("unique array is: " + arr[i]);
		return k;
	}

}
