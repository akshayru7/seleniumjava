package JavaA7Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> linkedhashMap = new LinkedHashMap<String, String>();
		
		linkedhashMap.put("MH12AD1234", "Akash");
		linkedhashMap.put("MH45AD4321", "Pratik");
		linkedhashMap.put("", "");
		linkedhashMap.put(null, null);
		linkedhashMap.put("MH13AS7365","Sumit");
		linkedhashMap.put("MH12AD1234", "Pratik");
		
		Set<Entry<String, String>> set = linkedhashMap.entrySet();
		
		for (Entry<String, String> e : set) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
		
		System.out.println("    ");
		//linkedhashMap.clear();
		
		//for (Entry<String, String> ee : set) {
			//System.out.println(ee.getKey()+" : " + ee.getValue());			
		//}
		
		System.out.println(linkedhashMap.isEmpty());
		
		//linkedhashMap.clear();
		
		//System.out.println(linkedhashMap.isEmpty());
		
		System.out.println("    ");
		
		System.out.println("Size of linkedhashMap = " + linkedhashMap.size());
		
		System.out.println("    ");
		
		linkedhashMap.remove("MH45AD4321");
		
		Set<Entry<String, String>> sets = linkedhashMap.entrySet();
		
		for (Entry<String, String> er : sets) {
			System.out.println(er.getKey() + " : " + er.getValue());
			
		System.out.println("   ");
		
		System.out.println(linkedhashMap.containsKey("MH45AD4321"));
		System.out.println(linkedhashMap.containsKey("MH13AS7365"));
		System.out.println(linkedhashMap.containsValue("Sumt"));
		System.out.println(linkedhashMap.containsValue("Pratik"));
		
		System.out.println("     ");
		
		linkedhashMap.replace("MH13AS7365", "Vaibhav");
		
		Set<Entry<String, String>> rep = linkedhashMap.entrySet();
		
		Iterator<Entry<String, String>> it = rep.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("     ");
		
		for (Entry<String, String> re : rep ) {
			System.out.println(re.getKey() + " : " + re.getValue());
		}
		
		System.out.println("     ");
		
		System.out.println("get Value : " + linkedhashMap.get("MH12AD1234"));
		
		System.out.println("     ");
		
		Collection<String> cl = linkedhashMap.values();
		
		for (String s : cl) {
			System.out.println(s);
		}	
		System.out.println("    ");
		
		Set<String> key = linkedhashMap.keySet();
		
		for(String k : key) {
			System.out.println(k);
		}
		System.out.println("Size of LinkedhashMap = " + linkedhashMap.size());
		}
	}
}