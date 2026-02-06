package leetCode;

public class longestCommonPrefix {
	
	
	public static void main(String args[])
	{
//		String[] strs = {"flower","flow","flight"};
		String[] strs = {"dog","racecar","car"};
		
		if(longestComm(strs).isEmpty())
			System.out.println("there is no common longest prefix string present.");
			else
			   System.out.println(longestComm(strs));
		
	}
		 public static String longestComm(String[] strs) {
			 
			 if (strs == null || strs.length == 0) {
		            return ""; // Handle empty or null input array
		        }

		        // Take the first string as the initial prefix
		        String prefix = strs[0];

		        // Iterate through the rest of the strings
		        for (int i = 1; i < strs.length; i++) {
		            // While the current string does not start with the prefix,
		            // shorten the prefix by removing its last character
		            while (strs[i].indexOf(prefix) != 0) {
		                prefix = prefix.substring(0, prefix.length() - 1);
		                if (prefix.isEmpty()) {
		                    return ""; // If prefix becomes empty, no common prefix exists
		                }
		            }
		        }
		        return prefix; // Return the final common prefix
		    }
}	 
			 
		/*	 
		    char[] prefixStr = new char[10];
			 int strLen = strs[0].length();
			
			 for(int i=0;i<strs.length;i++)
			 {
				 if(strLen > strs[i].length())
					{
						strLen = strs[i].length();
						 System.out.println(strLen);
					}
			 }
			 
			 for(int i=0;i<strs.length;i++)
			 {
				 for(int j=0;j<strLen;j++)
				 {
					 if((i+1)<strs.length && (i+2)<strs.length && (strs[i].charAt(j)==strs[i+1].charAt(j))
							 && (strs[i].charAt(j)==strs[i+2].charAt(j)))
					 {
						 prefixStr[j] = strs[i].charAt(j);
					 }
					
					 else
					 {
						 break;
					 }
				 }
			 }
			 
			 if(!prefixStr.toString().isEmpty())
			 { 
				 System.out.print("Longest common prefix--> ");
			 	 System.out.println(prefixStr);
			 }
			 
			 else
				 if(prefixStr.toString().isEmpty())
					 System.out.println("There is no common prefix" + prefixStr.toString()); 		        
		 }
		 */


