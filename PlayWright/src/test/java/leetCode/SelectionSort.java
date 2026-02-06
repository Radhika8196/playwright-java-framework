package leetCode;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = {6,5,2,8,9,4};

		System.out.println();

		System.out.println("Before sorting");

		for (int num : a )
			System.out.print(num + " ");
		selectionSort(a);
	}

	private static int[] selectionSort(int[] a) {
		int temp = 0, k = -1;
		for (int i = 0; i < a.length-1; i++) {
			k = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[k] > a[j]) {
					k = j;
					System.out.println("k is: " +k);

				}
			}

				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
		
			System.out.println("---------");
			for (int num : a)
				System.out.print(num + " ");
			System.out.println();

		}

		System.out.println("---------");
		System.out.println("After sorting");

		for (int num : a)
			System.out.print(num + " ");
		
		return a;
	}
}
