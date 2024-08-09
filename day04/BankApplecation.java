package day04;

public class BankApplecation {

	public static void main(String[] args) {
		
		Account hanaAccount = new Account();
		hanaAccount.setBALANE(10000);
		System.out.println("현재 잔고"+hanaAccount.getBalance());
		
		hanaAccount.setBALANE(-100);
		System.out.println("현재 잔고:"+hanaAccount.getBalance());
		
		hanaAccount.setBALANE(2000000000);
		System.out.println("현재 잔고:"+hanaAccount.getBalance());
		hanaAccount.setBALANE(-100000000);
		System.out.println("현재 잔고:"+hanaAccount.getBalance());

	
	}
	public void 
}
