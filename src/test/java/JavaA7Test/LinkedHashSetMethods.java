package JavaA7Test;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {
	
	public static void main(String[] args) {
				
	   LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
				
		// Appended the Specified Element to the end of this linkedhashset
		linkedhashset.add(null);
		linkedhashset.add("as");
		linkedhashset.add("..?#");
		linkedhashset.add("Number");
		linkedhashset.add("of");
		linkedhashset.add("0");
				
		System.out.println(linkedhashset);
				
		//Remove method is used to remove specific element
		linkedhashset.remove("of");
				
		System.out.println("Size of linkedhashset = " + linkedhashset.size());
				
		//Clear method is used for clear all present element
		//linkedhashset.clear();
			
		System.out.println("Size of linkedhashset = " + linkedhashset.size());
				
		//System.out.println("Remove all Element is in linkedhashset = " + linkedhashset.removeAll(linkedhashset));
				
		System.out.println("LinkedHashSet is Empty = "+ linkedhashset.isEmpty());
				
		System.out.println("Object is Available in linkedhashset = " + linkedhashset.contains("Number"));
				
		//for (int i = 0; i<linkedhashset.size(); i++) {
			//System.out.println(linkedhashset.g);
				
		System.out.println("    ");
				
		Iterator<String> it = linkedhashset.iterator();
			
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();;
		}
		System.out.println("Size of linkedhashset = " + linkedhashset.size());
	}
}