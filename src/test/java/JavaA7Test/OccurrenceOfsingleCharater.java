package JavaA7Test;

public class OccurrenceOfsingleCharater {

	public static void main(String[] args) {
		
		String Name = "Vaibhav";
		
		int count = 0;
		for (int i = 0; i<Name.length(); i++) {
			
			if (Name.charAt(i) == 'a') {
			count = count + 1;
			}
		}
		System.out.println("Occurrance of Charachter a : " + count);
	}
}
