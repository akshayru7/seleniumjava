package JavaA7Test;

public class Interface {

	public static void main(String[] args) {
		
		Fund t = new Fund();
		t.IMPS(1274638294, 0);
		t.RTGS(1233456234, 0);
	}
}

interface fundtransfer {
	
	public static final int amount1 = 1000;
	
	int amount2 = 10000;
	int account = 1234567890;
	
	public abstract void IMPS (int account, int amount1);
	
	void RTGS(int account, int amount2);
}

class Fund implements fundtransfer {
	
	public void IMPS (int account, int amount) {
		System.out.println("Fund transfer via IMPS :" + account + ":" + amount1);
	}
	
	public void RTGS (int account, int amount) {
		System.out.println("Fund transfer via RTGS :" + account + ":" + amount2);
	}
}