package JavaA7Test;

public class ArrayAsceAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count []  = { 4, 13, 68, 17 ,97, 35, 101, 47 };
		
		for (int i=0; i < count.length; i++) {	
			for (int c=0; c < count.length; c++) {
				if (count [i] > count [c]) {
					int a = count [i];
					count[i] = count[c];			
					count[c] = a;
				}
			}
		}
		for ( int d : count) {
		System.out.println(d);
		}
	}

}
