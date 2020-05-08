package test5_6;
/*
 고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다.
사용 데이터
Account(계좌번호): 441-0290-1203, 
balance(잔액): 500000원, 
interestRate(이율): 7.3% 
 
 */
public class AccountTest {

	public static void main(String[] args) {
       Account ac=new Account("441-0290-1203",500000,7.3);
       System.out.println("계좌번호: "+ac.getAccount()
                          +"\n잔액: "+ac.getBalance()+"원");
       
       ac.withdraw(600000);
       ac.deposit(20000);
     
       System.out.println("계좌번호: "+ac.getAccount()
                          +"\n잔액: "+ac.getBalance()+"원");
       
      System.out.printf("이자: %.1f",ac.calculateInterest());
		
		
	}

}
