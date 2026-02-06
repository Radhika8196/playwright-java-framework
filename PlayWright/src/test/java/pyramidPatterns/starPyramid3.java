package pyramidPatterns;

import java.util.Scanner;

/*
* 
* * 
* * * 
* * * * 
* * * * * 

*/

public class starPyramid3{
	public static void main(String[] args)
	{
	
	System.out.println("Enter the number of layers as input:");
	
	Scanner sc = new Scanner(System.in);
	
	int layers = sc.nextInt();
	
	basicStarPyramid1(layers);
}

	private static void basicStarPyramid1(int layers) {
		
		for(int i = 1; i<= layers;i++)
		{
			for(int j = 1; j<= i;j++)
			{
				
				System.out.print("*" + " ");

			}
			System.out.println();
				
		}
		
	}
}
