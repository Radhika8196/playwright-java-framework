package leetCode;

import java.util.LinkedHashMap;

public class nonRepeatingChar {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		char[] ch = s.toCharArray();

		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();

		for(int i = 0;i<ch.length; i++)
		{
				if(lhm.containsKey(ch[i]))
				{
					
					lhm.put(ch[i], lhm.get(ch[i])+1);
				}
				else
					lhm.put(ch[i], 1);
		}
		
		
		for(int j = 0;j<lhm.size(); j++)
		{
			if(lhm.get(ch[j])==1)
			{
				System.out.println(ch[j]);
				break;
			}
				
		}

}}
