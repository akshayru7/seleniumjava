package JavaA7Test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterface {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add("String");
		l.add('c');
		l.add(1.2f);
		
		for (int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("    ");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(null);
		arrayList.add(12);
		arrayList.add(12);
		
		for( Integer i :arrayList) {
			System.out.println(i);
		}
		System.out.println("    ");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(null);
		linkedList.add(10);
		linkedList.add(9);
		
		for (Integer i : linkedList) {
			System.out.println(i);
		}
	}

}
