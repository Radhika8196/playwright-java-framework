package pyramidPatterns;

import java.util.Scanner;

/*
 
 	1
   1 1
  1 2 1
 1 2 2 1
1 2 3 2 1

*/ // not working

public class numberPyramid1 {
	public static void main(String[] args)
	{
	
	System.out.println("Enter the number of layers as input:");
	
	Scanner sc = new Scanner(System.in);
	
	int rows = sc.nextInt();
	
	basicStarPyramid2(rows);
}

	private static void basicStarPyramid2(int rows) {

		for(int i = 1; i<= rows;i++)
		{
			
			for(int j = rows; j>i;j--)

			{
				System.out.print("  ");
	
			}
				for(int k=1;k<=(2*i)-1;k++)
				System.out.print(k + " ");
				
				System.out.println();

			}
		
				
		}
		
	
}
