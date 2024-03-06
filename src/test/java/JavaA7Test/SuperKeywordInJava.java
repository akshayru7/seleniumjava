package JavaA7Test;

public class SuperKeywordInJava {

	public static void main(String[] args) {
		
		child c = new child();
		c.add();
		child1 k = new child1();
		k.walking();
	}
}

class parent {

	int a = 70;
	
	public parent () {
		System.out.println("Parent class constructor");
	}
	
	public void seat () {
		System.out.println("Seating");
	}
}

class child extends parent {
	 
	int a = 20;
	public void add () {
		System.out.println(a+a);
		System.out.println(super.a+a);
	}
}

class child1 extends parent {
	
	public child1 () {
		super();
		System.out.println("Child1 class constructor");
	}
	
	public void walking () {
		super.seat();
		System.out.println("Walking");
	}
}