package employee;
/*
 * Emp상속
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
		return "사원번호 : "+getEno()
		       +"\n사원이름 : "+getEname()
		       +"\n내선번호 : "+getPhone()
		       +"\n기본급여 : "+salary
		       +"\n보너스+수당 : "+bonus
		       +"\n지급금액 : "+(salary+bonus)+"원\n";
	}

	
	
	
	
	
}


