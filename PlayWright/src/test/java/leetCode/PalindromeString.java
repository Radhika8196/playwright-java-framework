package leetCode;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	     int num = sc.nextInt();
	     
		sc.close();
	    if(isPalindrome(num))
	    	System.out.println("Enter number " + num + " is a palindrome.");
	    else
	    	System.out.println("Enter number " + num + " is not a palindrome.");

	    
	}


    private static boolean isPalindrome(int num) {
    	
    	int n = 0, rev = 0, temp = num;
    	
    	while(temp > 0)
    	{
    	n = temp % 10;
    	rev = rev*10 + n;
    	temp = temp / 10;
    	}
    	
		return num == rev;
        
    }
    }