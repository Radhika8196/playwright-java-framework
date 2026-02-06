package pyramidPatterns;

import java.util.Scanner;

/*
     1
   2   2
  3  3  3
4  4   4  4 	

 */

public class numberPyramid2{
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
			for(int k = layers-i ; k>0;k--)
				System.out.print(" ");

			for(int j = 1; j<= i;j++)
			{	
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}
}
