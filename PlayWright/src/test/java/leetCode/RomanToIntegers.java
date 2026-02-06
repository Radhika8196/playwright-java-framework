package leetCode;
import java.util.*;

public class RomanToIntegers {

	public static void main(String[] args) {

		String romanNumber = "MCMXCIV";
		
		System.out.println("Interger of entered roman number is " + romanToInt(romanNumber));
	}
	
	static int romanToInt(String romanNumber)
	{
		int result = 0, curr = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		hm.put('I',1);
		hm.put('V',5);
		hm.put('X',10);
		hm.put('L',50);
		hm.put('C',100);
		hm.put('D',500);
		hm.put('M',1000);
		
		System.out.println(hm);

	    
		char[] strArr = romanNumber.toCharArray();
		
		for(int i=0; i<strArr.length;i++)
		{
			curr = hm.get(strArr[i]);
			
			if((i+1)<strArr.length && (hm.get(strArr[i]) < hm.get(strArr[i+1])))
					{
						result = result - curr;

					}
					else
					{
						result = result + curr;

						}
				
				}
		
		return result;
		
	}
	


}
