package JavaA7Test;

public class StringClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1 = "Codemind Techanology";
		String c2 = "codemind techanology";
		
		System.out.println(c1.charAt(3));
		
		System.out.println(c1.length());
		
		System.out.println(c1.substring(2));
		
		System.out.println(c1.substring(3, 17));
		
		System.out.println(c1.contains("Codemind"));
		
		System.out.println(c2.contains(c2));
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.isEmpty());
		
		System.out.println("".isEmpty());
		
		System.out.println(c1.concat(":"+ c2));
		System.out.println(c1.concat(" Pune"));
		
		System.out.println(c1.replace('o', 'e'));
		
		System.out.println(c1.replace(c1, c2));
		
		System.out.println(c1.equalsIgnoreCase(c2));
		
		System.out.println(c1.split("Codemind Techanology"));
		
		System.out.println(c1.split(c2, 0));
		
		System.out.println(c1.indexOf('m'));
		
		System.out.println(c2.indexOf('o', 9));
		
		System.out.println(c1.indexOf("Codemind"));
		
		System.out.println(c1.indexOf("Tech", 0));
		
		System.out.println(c1.toLowerCase());
		
		System.out.println(c1.toUpperCase());
		
		System.out.println("   Codemind    ".trim());
		
		System.out.println(c1.valueOf(3));
	}

}
