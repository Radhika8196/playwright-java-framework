package leetCode;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		sc.close();

		if(isPalindrome(str))
			System.out.println("Entered string, " + str + " is a palindrome.");
		else	
			System.out.println("Entered string, " + str + " is not a palindrome.");

	}


	private static boolean isPalindrome(String str) {

		char[] strArr = str.toCharArray();

		System.out.println(strArr.length);

		int i = 0, j = strArr.length-1;
		
		while(j>i)
			{
				if(strArr[i]!= strArr[j])
					return false;
			
				else
				{
					i++;
					j--;
				
				}
				
			}
		
		return true;
}
}

//
//for(int i=0;i<strArr.length;)
//{
//	for(int j=strArr.length-1;j>=i;j--)
//}