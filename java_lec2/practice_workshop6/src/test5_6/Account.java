package test5_6;
/*
- account:String
- balance:int
- interestRate:double
+ Account()
+ Account(account:String, balance:int,
interestRate:double)
+ calculateInterest():double
+ deposit(money:int):void
+ withdraw(money:int):void
+ getXXX()
+ setXXX()
 */
public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (balance*interestRate/100);
	}
	
	public void deposit(int money) {
	  balance=balance+money;
	}
	
	public void withdraw(int money) {
		if(money>balance) {
			System.out.println("��� �� �� �����ϴ�");
		} else {
			balance=balance-money;
		}
	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void accountInfo() {
		System.out.print("���¹�ȣ : "+account+" "
				           +"�ܾ� : "+balance+"��"+" "
				           +"������ : "+interestRate+"%");
		
	}
	public void accountInfo2() {
		System.out.print("���¹�ȣ : "+account+" "
				           +"�ܾ� : "+balance+"��"+" "
				           +"������ : "+interestRate+"%");
		System.out.println(" ���� : "+(int)calculateInterest()+"��");
				        
	}

}
