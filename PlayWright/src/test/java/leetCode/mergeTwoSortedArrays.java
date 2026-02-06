package leetCode;

public class mergeTwoSortedArrays {

	public static void main(String[] args) {

		
		int arr1[] = {1, 3, 4, 5};
		int arr2[] = {2, 4, 6, 8};
		
		mergeArrays(arr1,arr2);
	}
	public  static void mergeArrays(int[] first, int[] second)
	{
		int[] finalArray = new int[first.length+second.length];
		int k=0;
		for(int i = 0;i<first.length;i++)	
		{
			for(int j = 0;j<second.length;j++)	
			{

			if(first[i]<=second[j])
			{
				finalArray[k] = first[i];
				k++;
			}
			else
				if(first[i]>second[j])
				{
					finalArray[k] = second[j];
					k++;
				}
			
		
		}
		}
		for(int i = 0;i<finalArray.length;i++)	
		System.out.println(finalArray[i]);
		
	}
	
	

}
