package JavaA7Test;

public class ExceptionInJava {

	public static void main(String[] args) {

		Test t = new Test();
		t.setA(20);
		System.out.println(t.getA());
		
//		int result = 10/0;
		t.setB(5000);
		System.out.println(t.getB());
	}
}

class Test {
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}	
	 
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
}