package JavaA7Test;

public class ThisKeywordUseInJava {

	public static void main(String[] args) {
		
		Arithmatic ad = new Arithmatic();
		ad.Addition();
		ThisKeywordUseInJava t = new ThisKeywordUseInJava();
		ag j =new ag();
		j.agh();
	}
	
	public ThisKeywordUseInJava () {
		this(50);
		System.out.println("Default constructor");
	}
	
	public ThisKeywordUseInJava (int c) {
		this(15.02f);
		System.out.println(c);
	}
	
	public ThisKeywordUseInJava (float d) {
		System.out.println(d);
	}
}

class Arithmatic {
	
		int a = 10;
		//int b=90;
	
		public void Addition () {
		//int a = 20;
		System.out.println(a+a);
		//System.out.println("This keyword use : " + (this.a+a));
		}
		
		//public void Addition1 () {
		//this.Addition();
		//}
}

class ag extends Arithmatic {
	
	public void agh () {
		int a= 97;
		this.Addition();
		System.out.println(" : "+(this.a+a));
	}
}