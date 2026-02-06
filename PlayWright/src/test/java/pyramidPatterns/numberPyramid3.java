package pyramidPatterns;

import java.util.Scanner;

/*
 1
 1 2
 1 2 3
 1 2 3 4	
 1 2 3 4 5
 */

public class numberPyramid3{
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
//			for(int k = layers-i ; k>0;k--)
//				System.out.print(" ");

			for(int j = 1; j<= i;j++)
			{	
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}
}
