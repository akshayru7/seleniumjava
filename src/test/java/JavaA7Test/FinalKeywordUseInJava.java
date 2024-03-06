package JavaA7Test;

public class FinalKeywordUseInJava {

	public static void main(String[] args) {
		
		polymorphismoverride p = new polymorphismoverride();
		p.Starting1();
		finaluse g = new polymorphismoverride();
		g.Starting1();
	}
}
 
class finaluse {
	
	    //final int a = 4;
	    
	  //final public void Starting1 () {
	public int Starting1 () {
		final int a = 100;
		System.out.println("Increase Speed : " + (a+a));
		return a;
	}
}

final class polymorphismoverride extends finaluse {
	
	public int Starting1 () {
		int a = 200;
		System.out.println("Increase Speed over: " + (a+a));
		return a;
	}
	
//class new1 extends polymorphismoverride {\
	
//}
}