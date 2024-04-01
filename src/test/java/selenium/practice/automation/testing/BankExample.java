package selenium.practice.automation.testing;

import java.util.ArrayList;

public class BankExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("Boi");
		list.add("Pratik");
		list.add("12345678920");
		list.add("IFSC0937");
		list.add("At pune");
		list.add("nill");
		
		for (int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		
		System.out.println(list.contains(" Pratik "));
		
		int count = 0;
		for (int i=0; i<list.size(); i++) {
			for (int j=0; j<list.size(); j++) {
				if (i>j && list.get(i) == list.get(j))
				break;
				
				if ( list.get(i) == "At pune" && list.get(i) == list.get(j))
					count = count + 1;
			}
		}
		System.out.println(list.get(5) + " : " + count);
		System.out.println("   ");
		
		int count1 = 0;
		for(int i=0; i<list.size(); i++) {
			for (int j=0; j<list.size(); j++) {
				if ( list.get(i) == "nill" && list.get(i) == list.get(j))
					count1++;
			}
		}
		System.out.println(list.get(6) + " : " + count1);
	}
}
