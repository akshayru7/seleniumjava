package JavaA7Test;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollno [][] = { {1,2,3,4,5}, {15,16,17,18,19}, {6,7,8,9,10}, {22,23,24,25,26}, {50,51,55,54,55} };
		
		rollno[0][2]=7;
		
		System.out.println("Roll No : " + rollno[4][4]);
		System.out.println("Rows Length : " + rollno.length);
		System.out.println("Column Lenth : " + rollno[1].length);
		
		System.out.println();
		
		for (int r = rollno.length; r > 0; r++ ) {
			for  (int p = rollno[r].length; p < 0; p++) {
				System.out.print( rollno[r][p]);
			}
			
			System.out.println();
		}	
	}
}