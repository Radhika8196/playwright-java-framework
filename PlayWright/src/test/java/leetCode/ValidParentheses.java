package leetCode;

import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		
		if(isValid("[{()}]"))
			System.out.println("The string has valid parenthesis");
		else
			System.out.println("The string doesnot have valid parenthesis");

	}

	public static boolean isValid(String s) { // "()"

		HashMap<Character, Character> hm = new HashMap<>();
		Stack<Character> stacks = new Stack<>();
		char c;

		hm.put(')','(');
		hm.put('}','{');
		hm.put(']','[');


		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			System.out.println(c);

//    	for(char c : s.toCharArray())

			if (c == '(' || c == '{' || c == '[') {
				stacks.push(c);
				System.out.println(stacks);
				continue;
			}

//			if (c == ')' || c == '}' || c == ']')
			
				
				if (stacks.isEmpty() || hm.get(c)!=stacks.pop()) 
					return false;
			
			
		}
			if (stacks.isEmpty())
				return true;
			else
				return false;
		
	}
}
