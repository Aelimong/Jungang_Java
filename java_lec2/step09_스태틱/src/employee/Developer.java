package employee;

/*
 * Emp���
 * 
 * -salary:long
 * -bonus:long
 * +Developer()
 * +Developer(eno, ename, phone)
 * +toString():String
 * 
 * 
 */

public class Developer extends Emp {

	private long salary;
	private long bonus;
	
	public Developer() {
		
	}

	public Developer(int eno, String ename, String phone){
		super(eno,ename,phone);
	}

	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus;
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
