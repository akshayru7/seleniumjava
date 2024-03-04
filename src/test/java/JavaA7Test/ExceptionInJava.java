package JavaA7Test;

public class ExceptionInJava {

	public static void main(String[] args) {

		Test t = new Test();
		t.setA(20);
		System.out.println(t.getA());
		
		int result = 10/0;
		Test1 t1 = new Test1();
		t1.setB(5000);
		System.out.println(t1.getB());
	}
}

class Test {
	
	int a;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}	
}

class Test1 {
	 
	int b;
	 
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
}