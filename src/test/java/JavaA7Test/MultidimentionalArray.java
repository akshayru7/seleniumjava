package JavaA7Test;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollno [][] = { {1,2,3,4,5}, {15,16,17,18,19}, {6,7,8,9,10}, {22,23,24,25,26}, {50,51,55,54,55} };
		
		rollno[0][3]=7;
		
		System.out.println("Roll No : " + rollno[4][4]);
		System.out.println("Rows Length : " + rollno.length);
		System.out.println("Column Lenth : " + rollno[1].length);
		
		System.out.println();
		
		for (int r = 0; r < rollno.length; r++ ) {
			for  (int p = 0; p < rollno[r].length; p++) {
				System.out.println( rollno[r][p] + "\t");
			}
			
			System.out.println();
		}	
	}
}
