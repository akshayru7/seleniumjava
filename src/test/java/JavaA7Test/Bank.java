package JavaA7Test;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accountholder1 AH = new Accountholder1();
		System.out.println(AH.AccountHolderName1);
		System.out.println(AH.BranchName);
		System.out.println(AH.IFSC);
		AH.FundTransfer();
		AH.withdraw();
		
		Accountholder2 ah2 = new Accountholder2();
		System.out.println(ah2.AccountHolderName2);
		System.out.println(ah2.Accountnumber2);
		System.out.println(ah2.BranchName);
		System.out.println(ah2.IFSC);
		ah2.creditmessage();
		ah2.accountdetails();
	}
	
	String Name = "BOI";
	int IFSC = 1234;
	String BranchName = "Hadpsar";
	String Distcrict = "Pune";

	public void createaccount () {
		System.out.println("Create a customer account");
	}
}

class Accountholder1 extends Bank {
	
	String Accountnumber1 = "12345678901234";
	String AccountHolderName1 = "Akash";
	
	public void withdraw () {
		System.out.println("Account Holder withdraw money from bankaccount");
	}
	
	public void FundTransfer() {
		System.out.println("Account Holder tranfer Money to same bank account");
		System.out.println();
	}
}

class Accountholder2 extends Bank {
	
	String Accountnumber2 = "12345678901243";
	String AccountHolderName2 = "Pratik";
	
	public void creditmessage () {
		System.out.println("Deposite money in own account then give credit message");
	}
	public void accountdetails () {
		System.out.println("Deposite money view in account details with credit status");
	}
}