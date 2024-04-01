package JavaA7Test;

public class Polymorphism {

	public static void main(String[] args) {
		
		// we are able to performing same thing in different or multiple ways
		
		// compile time polymorphism/early binding : overloading is example of early binding :- if a single class 
				// or parent child relation class having multiple method with same name but with 
				//different number or type of parameter/argument
				// method name must be same, we must have different number or type of argument, 
				//method return type may be same or different 
					//increase readability of code.
		// runtime polymorphism/late binding : overriding exaple of late binding :- if we are having same signature method 
				//in parent child class.
				// for overriding method we must have parent child reation in two classes
				// we must have same signature method in child class, return type is also same.
					// if we doesn't wanted to use parent class method implemented in its child class in this case 
					// we will override method in child class
		
		boi r = new boi();
		r.CalculationInterestofPersonalLoan(100, 40, 20);
}
}
class Rbi {
	
	public void CalculationInterestofPersonalLoan (int principleamount, int interestrate, int tenure) {
		System.out.println(principleamount+interestrate+tenure);
	}
	
}
class boi extends Rbi {
	
	public void CalculationInterestofPersonalLoan (int principleamount, int interestrate, int tenure) {
		System.out.println(principleamount=interestrate/tenure);
}
	}