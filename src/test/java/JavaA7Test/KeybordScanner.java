package JavaA7Test;

import java.util.Scanner;

public class KeybordScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()){
			System.out.println(scanner.next());
		}	
	}
}