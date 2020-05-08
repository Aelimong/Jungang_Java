package test21;

////수강생이 EmpEx를 보고 작성하시오

public class Emp {

	private String name;
	private String dept;
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return name+"은 "+dept+"사원이며  "+salary+"원의 급여를 받습니다";
	}
	
	
	
}
