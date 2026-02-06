package leetCode;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 6, 5, 2, 8, 9, 4 };

		bubbleSorting(a);
		
		System.out.println();

		System.out.println("After sorting");

		for (int num : a) 
			System.out.print(num + " ");
	}

	private static int[] bubbleSorting(int[] a) {
		int temp = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length-i-1; j++) {
					if (a[j] > a[j+1]) {
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
				System.out.println();

				for (int num : a) 
					System.out.print(num + " ");
			}
	
		return a;
	}
}
