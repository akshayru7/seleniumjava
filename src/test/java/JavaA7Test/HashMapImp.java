package JavaA7Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapImp {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("MH12AD1234", "Akash");
		hashMap.put("MH45AD4321", "Pratik");
		hashMap.put("", "");
		hashMap.put(null, null);
		hashMap.put("MH13AS7365","Sumit");
		hashMap.put("MH12AD1234", "Pratik");
		
		Set<Entry<String, String>> set = hashMap.entrySet();
		
		for (Entry<String, String> e : set) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
		
		System.out.println("    ");
		//hashMap.clear();
		
		//for (Entry<String, String> ee : set) {
			//System.out.println(ee.getKey()+" : " + ee.getValue());			
		//}
		
		System.out.println(hashMap.isEmpty());
		
		//hashMap.clear();
		
		//System.out.println(hashMap.isEmpty());
		
		System.out.println("    ");
		
		System.out.println("Size of hashMap = " + hashMap.size());
		
		System.out.println("    ");
		
		hashMap.remove("MH45AD4321");
		
		Set<Entry<String, String>> sets = hashMap.entrySet();
		
		for (Entry<String, String> er : sets) {
			System.out.println(er.getKey() + " : " + er.getValue());
			
		System.out.println("   ");
		
		System.out.println(hashMap.containsKey("MH45AD4321"));
		System.out.println(hashMap.containsKey("MH13AS7365"));
		System.out.println(hashMap.containsValue("Sumt"));
		System.out.println(hashMap.containsValue("Pratik"));
		
		System.out.println("     ");
		
		hashMap.replace("MH13AS7365", "Vaibhav");
		
		Set<Entry<String, String>> rep = hashMap.entrySet();
		
		Iterator<Entry<String, String>> it = rep.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("     ");
		
		for (Entry<String, String> re : rep ) {
			System.out.println(re.getKey() + " : " + re.getValue());
		}
		
		System.out.println("     ");
		
		System.out.println("get Value : " + hashMap.get("MH12AD1234"));
		
		System.out.println("     ");
		
		Collection<String> cl = hashMap.values();
		
		for (String s : cl) {
			System.out.println(s);
		}	
		System.out.println("    ");
		
		Set<String> key = hashMap.keySet();
		
		for(String k : key) {
			System.out.println(k);
		}
		System.out.println("Size of LinkedhashMap = " + hashMap.size());
		}
	}
}