package leetCode;

import java.util.LinkedList;
public class reversedLinkedList {

	public static void main(String[] args) {

		LinkedList<String> lst = new LinkedList<>();
		LinkedList<String> lst2 = new LinkedList<>();

		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		System.out.println(lst);
		
		for(int i = lst.size()-1; i>=0;i--)
		{
			lst2.add(lst.get(i));
		}
		System.out.println(lst2);

	}

}
