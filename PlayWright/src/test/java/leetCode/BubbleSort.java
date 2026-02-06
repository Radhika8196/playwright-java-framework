package leetCode;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 6, 5, 2, 8, 9, 4 };


		System.out.println("Before sorting");

		for (int num : a)
			System.out.print(num + " ");
		
		insertionSort(a);

		System.out.println();
	}

	private static int[] insertionSort(int[] a) {
		int temp = 0, num = 0, k = 0, j = 0;
		for (int i = 0; i < a.length; i++) {
			num = a[i];
			j = i-1;
				while(j>=0 && a[j] > num)
				{
					a[j+1] = a[j];
					j = j-1;
				}
				a[j+1] = num;

		}
		System.out.println();
		System.out.println("After sorting");

		for (int num1 : a)
			System.out.print(num1 + " ");

		return a;
	}
}
