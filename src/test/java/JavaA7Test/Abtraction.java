package JavaA7Test;

public class Abtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ad r = new ad();
		r.add(1, 04);
		
	}

}

abstract class queue {
	
	public void sub (int a, int b) {
		System.out.println(a+b);
	}
	
	public void sub (int a) {
		System.out.println(1);
	}
}

class ad extends queue {
	
	public void add (int a, int b) {
		System.out.println(a-b);
	}
}