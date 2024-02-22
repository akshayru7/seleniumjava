package JavaA7Test;

public class MutableStringType {
	
	public static void main(String[] args) {
	
		StringBuffer ab = new StringBuffer("Mahindra");
		
		ab.append(" Thar 4*4");
		
		System.out.println(ab);
		
		System.out.println(ab.hashCode());
		
		System.out.println(ab.reverse());
		
		StringBuilder ac = new StringBuilder("Testing");
		
		System.out.println(ac.append(" Manual & Automation"));
		
		System.out.println(ac.reverse());
		
		System.out.println(ac.reverse());
		
		System.out.println(ac.replace(8, 12, "Manual"));
		
		System.out.println(ac.charAt(5));
		
		System.out.println(ac.hashCode());
	}

}
