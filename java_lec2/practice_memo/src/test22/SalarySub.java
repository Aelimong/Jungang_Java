package test22;
/*
 -dept:String
 +SalarySub()
 +SalarySub(dept:String)
 +SalarySub(name:String, salary:int, dept:String)   ==> name, salary�� �θ�����ڷ� �ѱ�
 +toString():String         ==>  �μ����
 
 */
public class SalarySub extends Salary {

	private String dept;
	
	
	public SalarySub() {
	}

    public SalarySub(String dept) {
    	super();
		this.dept=dept;
	}
	
	public SalarySub(String name, int salary, String dept) {
		super(name,salary); //2
		this.dept=dept;
	}

	@Override
	public String toString() {
		return super.toString()+"\n�μ� : "+dept;
	}

	
}
