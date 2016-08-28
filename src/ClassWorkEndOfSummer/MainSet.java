package ClassWorkEndOfSummer;

import java.util.*;


public class MainSet {
	public static <T> T[] arrWithoutDublicate(T []mas){
	    HashSet <T> myset= new HashSet<T>();
        for(T o: mas) myset.add(o);

        T []mas1= (T[])myset.toArray();
		return mas1;
	}
	public static void main(String[] args) {
	    String []   mas   = {"a","b","a","c"};
        Integer [] masInt = {1,2,3,1,2};
     // List <String> arL= Arrays.asList(mas);
      System.out.println(Arrays.toString(arrWithoutDublicate (mas)));
      System.out.println(Arrays.toString(arrWithoutDublicate (masInt)));
	}

}
