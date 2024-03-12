package JavaA7Test;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Float> treeset = new TreeSet<Float>();
		
		treeset.add(12.0f);
		treeset.add(4.0f);
		treeset.add(49.99f);
		treeset.add(112.2f);
		treeset.add(99.1f);
		
		for (float f : treeset) {
			System.out.println(f);
		}
		
		System.out.println("    ");
		
		Iterator<Float> it = treeset.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		NavigableSet<Float> desset = treeset.descendingSet();
		
		for (float d : desset) {
			System.out.println(d);
		}
	}
}