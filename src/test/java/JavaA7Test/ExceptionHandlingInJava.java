package JavaA7Test;

public class ExceptionHandlingInJava {
	
	int AccountBalance;
	int AccountDebitAmount;
	
	public ExceptionHandlingInJava (int AccountBalance, int AccountDebitAmount) {
		System.out.println ("Withdraw Money");
	}
	
	public int fetchmoney (int a, int b) {
		AccountBalance = a;
		AccountDebitAmount = b;
		int d = 0;
		
		try {
			d = a/b;
		}
		
		catch (NullPointerException e) {
			System.out.println("Please do try devided by zero");
		}
		
		catch (Exception e) {
			System.out.println("Please do try devided by zero");			
		}
		
		finally {
			System.out.println("Code from finally block");
		}
	
		return d;
	}

	public static void main (String args[]) throws ArithmeticException, NullPointerException {
		
		ExceptionHandlingInJava c = new ExceptionHandlingInJava(100000, 10000);
		System.out.println( "Total Deduct Account Balance in % : " + c.fetchmoney(100000, 10000));
	}
}