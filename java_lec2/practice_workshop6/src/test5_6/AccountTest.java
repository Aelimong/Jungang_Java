package test5_6;
/*
 ���� �ݸ��� ���¸� ���� �Ͽ� ���� �ܾ��� �������� ���ڸ� ����ϴ� ���α׷��� �ۼ� �Ѵ�.
��� ������
Account(���¹�ȣ): 441-0290-1203, 
balance(�ܾ�): 500000��, 
interestRate(����): 7.3% 
 
 */
public class AccountTest {

	public static void main(String[] args) {
       Account ac=new Account("441-0290-1203",500000,7.3);
       System.out.println("���¹�ȣ: "+ac.getAccount()
                          +"\n�ܾ�: "+ac.getBalance()+"��");
       
       ac.withdraw(600000);
       ac.deposit(20000);
     
       System.out.println("���¹�ȣ: "+ac.getAccount()
                          +"\n�ܾ�: "+ac.getBalance()+"��");
       
      System.out.printf("����: %.1f",ac.calculateInterest());
		
		
	}

}
