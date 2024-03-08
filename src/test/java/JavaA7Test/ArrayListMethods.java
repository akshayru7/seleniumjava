package JavaA7Test;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(null);
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(0);
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();		
		arrayList1.addAll(arrayList);
		arrayList1.add(15);
		arrayList1.add(2);
		arrayList1.remove(2);
				
		for (Integer i : arrayList1) {
			System.out.println(i);
		}
		
		arrayList1.removeAll(arrayList);
		
		System.out.println("     ");
		
		for (int i = 0; i<arrayList1.size(); i++) {
			System.out.println(i);
		}
	}

}
