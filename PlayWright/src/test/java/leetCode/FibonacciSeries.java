package leetCode;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int till = sc.nextInt();
		
//		for(int i=0;i<till;i++)   // for recursive
//		System.out.print(Fibonacci(i) + " ");
		
		Fibonacci(till);
		sc.close();
		
	}

	/* static void Fibonacci(int num) {
		
		int first = 0, second = 1, count = 2, current = 0;;
		
		System.out.print(first + " "); // 0
		System.out.print(next + " "); // 1
		
		while(count<num)
		{	
			current = first + second; // 0+1 =1
			first =  second; // 1
			second = current; // 1
			System.out.print(current + " "); // 1
			count++;
			
		}
		
	}
	*/
	
	static void Fibonacci(int num) {
    int firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series up to " + num + " terms:");

    for (int i = 1; i <= num; ++i) {
        System.out.print(firstTerm + " ");
        
        // Compute the next term
        int nextTerm = firstTerm + secondTerm;
        
        // Update the terms for the next iteration
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
	}
	/*
	// Recursive
	private static int Fibonacci(int num) {
		
		if(num <= 1)
			return num;
		
		 return Fibonacci(num-1)+Fibonacci(num-2);
		
	}
	*/
	
	
}
