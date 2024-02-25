package JavaA7Test;

public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Vaibhav";
		
		System.out.println(Name);
		
		String Names = "Pratik";
		
		System.out.println(Names);
		
		String Namev = "Vaibhav";
		
		System.out.println(Namev);
		System.out.println();
		
		System.out.println(Name.hashCode());
		System.out.println(Namev.hashCode());
		System.out.println(Names.hashCode());
		System.out.println();
		
		String Namea = new String ("Vaibhav");
		
		System.out.println(Namea);
		
		String Namep = new String ("Pratik");
		
		System.out.println(Namep);
		System.out.println();
		
		String Named = "123456789";
		
		Named = "210";
		
		String Namee = "300";
		
		Named.concat("350");
		
		String Namedd = Named.concat("250");
		
		System.out.println(Namedd);				
		System.out.println(Named);
		System.out.println(Namee);
	}
}