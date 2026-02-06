
package javapkg;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "listenM"; // "cinema";

		String s2 = "silentm";// "iceman";

		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		/*
		 * if(s1.length() == s2.length()) {
		 * 
		 * char[] ch1 = s1.toLowerCase().toCharArray(); char[] ch2 =
		 * s2.toLowerCase().toCharArray();
		 * 
		 * HashMap<Character, Integer> hm1 = new HashMap<>();
		 * 
		 * HashMap<Character, Integer> hm2 = new HashMap<>();
		 * 
		 * 
		 * HashMap<Character, Integer> hm3 = new HashMap<>();
		 * 
		 * HashMap<Character, Integer> hm4 = new HashMap<>();
		 * 
		 * 
		 * try { hm3 = charToHashMap(ch1, hm1); } catch (Exception e) {
		 * e.printStackTrace(); } try { hm4 = charToHashMap(ch2, hm2); } catch
		 * (Exception e) { e.printStackTrace(); }
		 * 
		 * if(hm3.equals(hm4)) System.out.println("Anagram");
		 * 
		 * 
		 * 
		 * } else System.out.println("not anagram"); }
		 * 
		 * private static HashMap<Character, Integer> charToHashMap(char[] ch,
		 * HashMap<Character, Integer> hm) {
		 * 
		 * for(char c : ch) {
		 * 
		 * if(!hm.containsKey(c)) hm.put(c, 1); else hm.put(c, hm.get(c)+1);
		 * 
		 * }
		 * 
		 * return hm;
		 */

		// with only one hashMap

		HashMap<Character, Integer> hm1 = new HashMap<>();

		for (int i = 0; i < ch1.length; i++) {

			hm1.put(ch1[i], hm1.getOrDefault(ch1[i], 0) + 1);

		}
		System.out.println(hm1);

		for (int i = 0; i < ch2.length; i++) {
			if (hm1.containsKey(ch2[i])) {
				hm1.remove(ch1[i]);
			}
			
		


		}
		System.out.println(hm1);

	}

}
