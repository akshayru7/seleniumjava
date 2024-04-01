package JavaA7Test;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array declaration
		String ss2[];
	
		// declaration with initialization
		String sss[] = new String[4];
		
		//Storing element in Array
		sss [0] = "Pratik";
		sss [1] = "Akash";
		sss [2] = "Vishwas";
		sss [3] = "Mayur";
		
		//How to Access an Element
		sss[2] = "Vaibhav"; // replace array element
		
		System.out.println(sss[0]);
		System.out.println(sss[1]);
		System.out.println(sss[2]);
		System.out.println(sss[3]);
		
		System.out.println("Size of Array : " + sss.length);
		
		System.out.println("/////////////////////////");
		
		for (int i = 0; i < sss.length; i++) {
			System.out.println(i + ":" + sss[i]);
		}
		
		System.out.println("/////////////////////////");
		
		// declaration with initialization
		String ss1 [] = {"Pratik", "Vaibhav"}; 
		
		for (String s1 : ss1) {
			System.out.println(s1);
		}
	}

}