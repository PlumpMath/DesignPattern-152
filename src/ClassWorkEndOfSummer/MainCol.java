package ClassWorkEndOfSummer;

import java.util.*;


public class MainCol {
	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.print(elem + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(new Integer(1));
		int i = arl.get(0);
		List <Integer> li = Arrays.asList(1, 2, 3);
		List <String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);

		Set set1 = new HashSet();
		set1.add("one");
		set1.add("second");
		set1.add("3rd");
		set1.add(new Integer(4));
		set1.add(new Float(5.0F));
		set1.add("second");
		set1.add(new Integer(4));
		System.out.println(set1);

		Set set2 = new HashSet();
		set2.add("one");
		set2.add("second");
		set2.add("7rd");
		set2.add(new Integer(4));
		set2.add(new Float(5.0F));
		set2.add("second");
		set2.add(new Integer(4));
		System.out.println(set2);
		System.out.println(set1.addAll(set2));
		System.out.println(set1);
		System.out.println( set1.retainAll(set2) );
		System.out.println(set1);
		System.out.println( set1.removeAll(set2)  );
		System.out.println(set1);
	}
}
