package JavaA7Test;

class dog {
	
    //object propertise, data member, member variables, attributes 
	
	String Name = "Dog";
	String Breed = "German Shaffered";
	String Colour = "Black";
	int age = 4;
	float weight = 15.7f;
	float Height = 1.9f;
	
	 //object member function or method or behavior
	
	public float running () {
		
		float speed = 25f;
		
		System.out.println(speed);
		return speed;
	}
}

class laptop {
	
	//propertise, attributes, data member, state
	
	String CompanyName = "Hp";
	String color = "silver";
	float price = 55000f;
	float membary = 250f;
	float weight = 25f;
	int size = 3*2;
	
	//behaviour, function, methods
	
	public String PowerOn() {
		
		String p = "ON";
		return p;
	}
	
	public String PowerOff () {
		
		String p = "OFF";
		return p;
	}
}

class book {
	
	private static final boolean bool = false;
	String Name = "Notebook";
	String lines = "double";
	int price = 50;
	int size = 5*7;
	
	public String writing() {
		
		String b = "Writing a notes";
		return b;
		
	}
	
	public void open () {
		
	}
	
	public void close () {
		
	}
}

class bankaccount {
	
	//propertice, attributes,
	String accountholdername = "John";
	int accountnumber = 1234524447;
	String Address = "A/t post : hadpsar, pune";
	int IFSC = 1234;
	
	public int accountdetails () {
		
		int Rs = 20000;
		return Rs;
		
	}
	public int fundtransfer () {
		
		int Rs = 10000;
		return Rs;
		
	}
	public String atm () {
		
		String Card = "ICIC";
		return Card;
		
	}
}

public class OopsConceptClassAndExampleofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dog d1 = new dog();
		
		//d1.running;
		
		laptop l1 = new laptop();
		
		System.out.println(l1.PowerOn());
		System.out.println(l1.PowerOff());
	
		book b1 = new book();
		
		System.out.println(b1.writing());
		
		bankaccount ba = new bankaccount();
		
		System.out.println(ba.accountdetails());
		System.out.println(ba.fundtransfer());
		System.out.println(ba.atm());
	}
}