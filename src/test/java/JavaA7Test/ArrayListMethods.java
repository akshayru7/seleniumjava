package JavaA7Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(null);
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(0);
		arrayList.add(1);
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();		
		arrayList1.addAll(arrayList);
		arrayList1.add(15);
		arrayList1.add(2);
		arrayList1.remove(2);
				
		for (Integer i : arrayList1) {
			System.out.println(i);
		}
		
		//System.out.println(arrayList1.removeAll(arrayList));
		
		//System.out.println( "element always contain " + arrayList1.removeAll(arrayList));
		
		//arrayList1.clear();
		
		System.out.println("     ");
		
		for (int i = 0; i<arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i));
		}
		
		System.out.println("Size of arrayList2 : " + arrayList.size());
		
		System.out.println("Object Available in only arrayList is : " + arrayList.contains(20));
		
		System.out.println("List is Empty : " + arrayList.isEmpty());
		
		arrayList.clear();
		
		System.out.println("List is Empty : " + arrayList.isEmpty());
		
		System.out.println("      ");
		
		Iterator<Integer> it = arrayList1.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("      ");
		
		System.out.println(arrayList1.get(3));
	}
}