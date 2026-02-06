package javapkg;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates_NumList {

	public static void main(String[] args) {
		
		String[] stringList = {"abc","radhi","pooja","abc","etc","xyz","etc","abc"};

		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		
		
	for(String s : stringList)
	{
		if(!strMap.containsKey(s))	
			strMap.put(s, 1);
		else
			strMap.put(s, strMap.get(s)+1);
		
	}
	
	System.out.println(strMap);

	System.out.println(strMap.keySet());
	
	for(Map.Entry<String, Integer> m : strMap.entrySet())
	{
		System.out.println(m.getKey() + " is repeated :" +m.getValue() + " times");
	}
	

	strMap.forEach((key, value) -> 
        System.out.println(key + " -> " + value));
    	
	}
}



