package javapkg;

/*
 * import java.util.HashMap;
 * 
 * public class RemoveDuplicates_StrList {
 * 
 * public static void main(String[] args) {
 * 
 * int[] numList = {21,76,98,34,21,98,876,241,76,34};
 * 
 * HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
 * 
 * 
 * for(int n : numList) { if(!numbers.containsKey(n)) numbers.put(n, 1); else
 * numbers.put(n, numbers.get(n)+1);
 * 
 * }
 * 
 * System.out.println(numbers);
 * 
 * System.out.println(numbers.keySet());
 * 
 * }
 * 
 * }
 */
/*

import java.util.ArrayList;


// Using Streams
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_NumList {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Apple");
        originalList.add("Orange");
        originalList.add("Banana");

        List<String> listWithoutDuplicates = originalList.stream()
                                                     .distinct()
                                                     .collect(Collectors.toList());

        System.out.println("Original List: " + originalList);
        System.out.println("List without duplicates (using streams): " + listWithoutDuplicates);
    }
}

// Using ArrayList and HashSet

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates_StrList {

	public static void main(String[] args) {
		
	
		List<String> dupList = new ArrayList<>();
		
		dupList.add("pooja");
		dupList.add("abc");
		dupList.add("radhi");
		dupList.add("abc");
		dupList.add("etc");
		dupList.add("xyz");
		dupList.add("etc");
		dupList.add("abc");
		
		HashSet<String> uniqueList = new HashSet<>(dupList);
		
		System.out.println(uniqueList);

		List<String> finalList = new ArrayList<>(uniqueList);
		

		System.out.println(finalList);

    	
	}
}

*/

// Using Linked hashSet

import java.util.*;

public class RemoveDuplicates_StrList {

	public static void main(String[] args) {
		
	
		List<String> dupList = new ArrayList<>();
		
		dupList.add("pooja");
		dupList.add("abc");
		dupList.add("radhi");
		dupList.add("abc");
		dupList.add("etc");
		dupList.add("xyz");
		dupList.add("etc");
		dupList.add("abc");
		
		System.out.println(dupList);
		
		HashSet<String> temp = new HashSet<>(dupList);
		System.out.println(temp);

		
		LinkedHashSet<String> uniqueList = new LinkedHashSet<>(dupList);
		
		System.out.println(uniqueList);

		List<String> finalList = new ArrayList<>(uniqueList);
		

		System.out.println(finalList);

    	
	}
}
