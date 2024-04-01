package JavaA7Test;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		
		treemap.put("", null);
		treemap.put("", null);
		treemap.put("ak", 17);
		treemap.put("PS", 15);
		treemap.put("VG", 9);
		
		Set<Entry<String, Integer>> set = treemap.entrySet();
		
		//treemap.clear();
		
		for (Entry<String, Integer> e : set)  {
			System.out.println(e.getKey()+ " = " + e.getValue());
		}
		
		System.out.println("Get Values of key ak : " + treemap.get("ak"));
		
		System.out.println("PS Key is stored = "+ treemap.containsKey("PS"));
		
		System.out.println("0 Value is Present = " + treemap.containsValue(0));
		
		System.out.println("highest value of Key = " + treemap.higherKey("PS"));
		
		System.out.println("highest value of Key = " + treemap.lowerKey("VG"));
		
		System.out.println("Size Of treemap = " + treemap.size());
		
		System.out.println("Treeset is Empty = " + treemap.isEmpty());
		
		Set<String> tree = treemap.keySet();
		
		for (String s : tree) {
			System.out.println(s);
		}
		
		Collection<Integer> vl = treemap.values();
		
		System.out.println("     ");
		
		for ( Integer i : vl) {
			System.out.println(i);
		}
		
		System.out.println("     ");
		treemap.remove("VG");
		
		Set<Entry<String, Integer>> set1 = treemap.entrySet();
		
		for (Entry<String, Integer> ee : set1) {
			System.out.println(ee.getKey()+ " = " + ee.getValue());
		}
		
		System.out.println("   ");
		treemap.replace("PS", 1);
		
		Set<Entry<String, Integer>> set2 = treemap.entrySet();
		
		for (Entry<String, Integer> eee : set2) {
			System.out.println(eee.getKey()+" = " + eee.getValue());
		}
	}
}