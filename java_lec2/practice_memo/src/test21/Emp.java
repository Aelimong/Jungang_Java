package test21;

////�������� EmpEx�� ���� �ۼ��Ͻÿ�

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
		return name+"�� "+dept+"����̸�  "+salary+"���� �޿��� �޽��ϴ�";
	}
	
	
	
}
