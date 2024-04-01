package selenium.practice.automation.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class InterviewExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();	//List<Integer> list=[10,39,5,66,7,7,90];
		list.add(10);
		list.add(39);
		list.add(5);
		list.add(66);
		list.add(7);
		list.add(7);
		list.add(90);
		
		for (Integer it : list) {
			System.out.println(it);
		}
		System.out.println("      ");

		//1.Find number of duplicate elements.
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if( list.get(i) == 7 ) {
				count = count + 1;				
			}
		}
		System.out.println("Count of duplicate number 7 = " + count );
		System.out.println("      ");
		
		//2.Remove duplicate occurrences
		list.remove(4); 								// [10,39,5,66,7,90]
		for (Integer it : list) {
			System.out.println(it);
		}	
		System.out.println("      ");	
		
		//3.Sort is ascending order
		TreeSet<Integer> treeset = new TreeSet<Integer>(list);
		
		for (Integer tr : treeset){
			 System.out.println(tr);
		 }
		System.out.println("      ");

		//4.Sort in descending order
		Iterator<Integer> desc = treeset.descendingIterator();
		
		while (desc.hasNext()) {
			System.out.println(desc.next());
		}
		System.out.println("      ");
		
		//5.Find Min number form list
		System.out.println("Minimum Number : " + Collections.min(list) );
		
		//6.Find Max number from list]
		System.out.println("Maximum Number : "+ Collections.max(list));
	}
}