package JavaA7Test;

public class StringproblemExample {

	public static void main(String[] args) {
		
		
		String Name = "aba";
		
		String Named = "";
		
		for(int i = Name.length()-1; i>=0; i--) {
			Named = Named + Name.charAt(i);
		}
		System.out.println(Named);
		
			if(Name.equals(Named)) {
				System.out.println("String is Palindrome");
			} else {
				System.out.println("String is not Palindrome");
			}
	}
}