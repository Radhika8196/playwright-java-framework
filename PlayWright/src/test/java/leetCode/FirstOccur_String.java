package leetCode;

public class FirstOccur_String {

	public static void main(String[] args) {

		
		System.out.println(strStr("sadbutsad", "sad"));
		
	}
    public static int strStr(String haystack, String needle) {
    	
    	int idx = haystack.indexOf(needle);
    	
    	if(idx >= 0)
    	{
    		System.out.println("First occcurence of given substring is: " + idx);
    		return idx;
    	}
    	return -1;

    }

}
