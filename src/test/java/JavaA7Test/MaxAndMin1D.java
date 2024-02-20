package JavaA7Test;

public class MaxAndMin1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//maximum naumber find out in 1-D Array
		/*int arr[]= {50,76,87,23,34};
		
		int b = arr[0];
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]< b) {
				  b = arr[i];
			}
		}
		System.out.println(" Minimum Number from 1D Array : " + b);		
		*/
		
		//create in left half table from diagonals
				int arr[] []= {{10,67,87}, {50,76,87}, {1, 2, 3} };
				
				for (int i = 0; i<arr.length; i++) {
					for(int j = 0; j<arr[i].length; j++) {
					if (i>=j) 
					System.out.print(arr[i][j] + "\t");
				}	
					System.out.println();
		}
				System.out.println();
				
		//create in left half table from diagonals
				int arr1[] []= {{10,67,87}, {50,76,87}, {1, 2, 3} };
				
				for (int i = 0; i<arr1.length; i++) {
					for(int j = 0; j<arr1[i].length; j++) {
					if (i<=j) 
					System.out.print(arr1[i][j] + "\t");
				}	
					System.out.println();
		}
				System.out.println();
				
		//Diagonal element
				int arr2[] []= {{10,67,87}, {50,76,87}, {1, 2, 3} };
				
				for (int i = 0; i<arr2.length; i++) {
					for(int j = 0; j<arr2[i].length; j++) {
					if (i==j) 
					System.out.print(arr2[i][j] + "\t");
				}	
					System.out.println();
		}
					System.out.println();
					
				
		//Diagonal element
					int arr3[] []= {{40,67,87}, {50,76,87}, {1, 2, 6}};
					
					for (int i = 0; i<arr3.length; i++) {
						for(int j = 0; j<arr3[i].length; j++) {
						if (i==j) 
						System.out.print(arr3[i][j] + "\t");
					}	
						System.out.println();
			}
	}

}
