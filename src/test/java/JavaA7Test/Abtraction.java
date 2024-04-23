package JavaA7Test;

public class Abtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ad r = new ad(10);
		r.sub(1, 04);
		r.add(1);
	}
}

abstract class queue {
	
	public abstract void sub (int a, int b);
	
	public void add (int a) {
		System.out.println(1);
	}
	
	public queue (int c) {
		
	}
}

class ad extends queue {
	
	public ad(int c) {
		super(10);
	}

	public void sub (int a, int b) {
		System.out.println(a-b);
	}
}