package JavaA7Test;

public class Count {

	public static void main(String[] args) {
		
		String Name = "Welcome to codemind Technology";
		
		for (int i=0; i<Name.length(); i++) {
			
			int count1 = 0;
			for (int j=0; j<Name.length(); j++) {
			
				if (i>j && Name.charAt(i) == Name.charAt(j))
					break;
				if (Name.charAt(i) == Name.charAt(j))
					count1++;
			}
			if ( count1 != 0)
			System.out.print(Name.charAt(i) + ":" + count1 + ", " );
		}
	}

}
