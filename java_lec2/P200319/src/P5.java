class Account {
	private String name;
	public int balance;
	
	public Account(String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(int value) {
		balance+=value;
	}
	
	public void withdraw(int value) {
		
		if (balance < value) {
			System.out.println("예외발생..출금금액이 잔액보다 큽니다");
			return;
		}
		
		balance-=value;
		
	}
	


}

public class P5 {

	public static void main(String[] args) {
		Account a1 = new Account("한조",10000);
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.withdraw(1000000);
		a1.withdraw(3000);
		System.out.println(a1.balance);
	}

}
