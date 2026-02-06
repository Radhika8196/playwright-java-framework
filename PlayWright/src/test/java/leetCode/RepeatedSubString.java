package leetCode;

public class RepeatedSubString {

	public static void main(String[] args) {

		String s = "abab";
		if(repeatedSubstringPattern(s))
			System.out.println("Yes the given string is having repeated pattern.");
		else
			System.out.println("No the given string is having not having any repeated pattern.");

	}
    public static boolean repeatedSubstringPattern(String s) {
    	
    	String repeated = s.substring(0,1);
		System.out.println("repeated pattern-->" + repeated);
		System.out.println(s.indexOf(repeated));
		
    	while(s.indexOf(repeated) == 0)
    	{
    		repeated = repeated.substring(0, repeated.length() + 1);
    		System.out.println("repeated pattern:" + repeated);

    		if(repeated.equals(s))
    			return false;
    	}
		System.out.println("last repeated pattern:" + repeated);

		return true;
    	}
    	
    }
