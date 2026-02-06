package javapkg;

public class strReverse {
	
	// using Char Array
	
	/*public static void main(String[] args) {
		String s1 = "radhika";
		int strLen = s1.length();

		char[] chArr1 = s1.toCharArray();

		char[] chArr2 = new char[strLen];
		int i = 0;

		for (int j = strLen - 1; j >= 0; j--) {
			chArr2[i] = chArr1[j];
			i++;

		}

		System.out.println(new String(chArr2));

		System.out.println(s1);

	}
	
	
	// Using for loops
	public static void main(String[] args) {
	String s1 = "radhika";
	
	int len= s1.length();
	
	char[] chArr = s1.toCharArray();
	char tempCh;
	
	
		for(int j=len-1,i=0;i<len && j>i;i++,j--)
		{
			tempCh = chArr[i];
			chArr[i] = chArr[j];
			chArr[j] = tempCh;
	}
	
	System.out.println(new String(chArr));
		
}
*/
	
	// str concatination
	
	public static void main(String[] args) {
		String s1 = "radhika";
		
		int len= s1.length();

		  String reversedStr = "";
	      for (int i = 0; i < s1.length(); i++) {
	          reversedStr = s1.charAt(i) + reversedStr;
	      }

	      System.out.println(reversedStr);
	}	
	
}
