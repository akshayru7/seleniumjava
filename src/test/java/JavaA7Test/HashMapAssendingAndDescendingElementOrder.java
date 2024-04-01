package JavaA7Test;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapAssendingAndDescendingElementOrder {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(45, "RS");
		hashmap.put(7, "MSD");
		hashmap.put(15, "BK");
		hashmap.put(99, "RA");
		
		Set<Entry<Integer, String>> set = hashmap.entrySet();
		
		for (Entry<Integer, String> j : set ) {
			System.out.println(j);
		}
		
		System.out.println("     ");
//		Set<Entry<Integer, String>> set1 = hashmap.entrySet();
//		
//		Iterator<Entry<Integer, String>> it = set1.iterator();
//		
//		while(it.) {
//			System.out.println(it.next());
//		}
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(hashmap);
		
		Set<Entry<Integer, String>> asc = treemap.entrySet();
		
		for (Entry<Integer, String> g : asc)  {
			System.out.println(g.getKey() + " = " + g.getValue());
		}
		
		System.out.println("     ");
		NavigableMap<Integer, String> tree = treemap.descendingMap();
		
		Set<Entry<Integer, String>> desc = tree.entrySet();
		
		for (Entry<Integer, String> g : desc)  {
			System.out.println(g.getKey() + " = " + g.getValue());
		}
		
//		NavigableMap<Integer, String> asc = treemap.descendingMap();
//		
//		for (Integer i : asc) {
//			System.out.println(i);
//		}
	}
}