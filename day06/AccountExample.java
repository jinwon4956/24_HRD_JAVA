package day06;
class Account{
	// 예금하기 
	int balance;
	public int getBalance() {
		return balance;
	}
	public void depositint (int money) {
		balance += money;
	}
	
	// 출금하기
	public void widthdrawint (int money) throws InsufficientExample{
		if(balance < money) {
			throw new InsufficientExample("잔고 부족:" + (money-balance)+"모자람");
		}
		balance -= money;
	}
}
public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.depositint(10000);
		System.out.println("예금액:"+account.getBalance());
		//출금하기
		try {
			account.widthdrawint(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
