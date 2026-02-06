package javapkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

		/* 
		Common Regex Symbols
		Symbol	Meaning	Example
		.	Any character	a.c
		*	0 or more	ab*
		+	1 or more	ab+
		?	0 or 1	ab?
		^	Start of string	^Hello
		$	End of string	World$
		|	OR	java|python
		
		
		Character Classes
		Regex	Meaning
		[abc]	a or b or c
		[^abc]	Not a, b, c
		[a-z]	lowercase letters
		[0-9]	digits
		
		
		Predefined Character Classes
		Regex	Meaning
		\d	Digit
		\D	Non-digit
		\w	Word character
		\W	Non-word
		\s	Whitespace
		\S	Non-whitespace


 */

public class regexTest1 {

	public static void main(String[] args) {

		
		Pattern p = Pattern.compile(".m");
		Matcher m = p.matcher(".am");
		Boolean a = m.matches();
		System.out.println("a--->" + a);
		
		Boolean b = m.find();
		System.out.println("m.find()--->" + m.find());
		
		System.out.println("b--->" + b);
		
		Boolean c = Pattern.matches(".m", "am");
		
		System.out.println("c--->" + c);

		
		System.out.println("-----------------------");

		System.out.println("amn and acd");
		System.out.println(Pattern.matches("[amn]", "acd"));
		System.out.println();
		
		
		System.out.println("amn and c");
		System.out.println(Pattern.matches("[^amn]", "c"));
		System.out.println();
		
		System.out.println("a-zA-Z and T");
		System.out.println(Pattern.matches("[a-zA-S]", "T"));
		System.out.println();
		
		System.out.println("MS a-z 5 ");
		System.out.println(Pattern.matches("[MS][a-z]{6}", "Manasvi"));
		System.out.println();
		
		System.out.println("xyz? and x");
		System.out.println(Pattern.matches("[xyz]?", "x")); //	?	0 or 1	ab?
		System.out.println();
		
		System.out.println("xyz+ and x");
		System.out.println(Pattern.matches("[xyz]+", "x")); //+	1 or more	ab+
		System.out.println();
		
		System.out.println("xyz* and xyyza");
		System.out.println(Pattern.matches("[xyz]*", "xyyza")); //	*	0 or more	ab*
		System.out.println();
		
		
		System.out.println("\\d and 1");
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println();
		
		System.out.println("\\D and 1");
		System.out.println(Pattern.matches("\\D","1"));
		System.out.println();	


	}

}
