package JavaA7Test;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Car = "Mahindra Thar";
		String C1 = "";
		for (int i = (Car.length()-1); i>=0; i--) {
			C1= C1 + Car.charAt(i);
		}
		
		System.out.println(C1);
	
		String arr[] = Car.split(" ");
		
		String C2 = "";
		
		for (String C3 : arr) {
			for(int i = 0; i<(C3.length()); i++) {
				C2 = C2 + C3.charAt(i);
			} C2 = C2 + " ";
		}
		System.out.println(C2.trim());
		
		String A9 = "abcd2679";
		String C4 = A9.replaceAll("[^0-9]", "");
		int Add = 0;
		for (int i = 0; i < C4.length(); i++) {
			int number = Character.getNumericValue(C4.charAt(i));
			Add = Add + number;
		}
		
		System.out.println(Add);
		
	}
}
