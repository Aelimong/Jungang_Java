package employee;
/*
 * Emp���
 * 
 * -salary:long
 * -bonus:long
 * +Engineer()
 * +Engineer(eno, ename, phone)
 * +toString():String
 * 
 * 
 */
public class Engineer extends Emp {

	private long salary;
	private long bonus;
	
	public Engineer() {
		
	}

	public Engineer(int eno, String ename, String phone) {
		super(eno,ename,phone);
	}


	@Override
	public void setSalary(long salary) {
		this.salary=salary;
		
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+150000;
		
	}
	
	@Override
	public String toString() {
		return "�����ȣ : "+getEno()
		       +"\n����̸� : "+getEname()
		       +"\n������ȣ : "+getPhone()
		       +"\n�⺻�޿� : "+salary
		       +"\n���ʽ�+���� : "+bonus
		       +"\n���ޱݾ� : "+(salary+bonus)+"��\n";
	}

	
	
	
	
	
}


