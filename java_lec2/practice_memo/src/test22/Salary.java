package test22;
/*
 -name:String
-salary:int
+Salary()
+Salary(name:String, salary:int)
+toString():String         ==>  �̸�, �������
   
 */
public class Salary {

	private String name;
	private int salrary;
	
	public Salary() {  //4
		// TODO Auto-generated constructor stub
	}

	public Salary(String name, int salrary) {
		super();//3
		this.name = name;
		this.salrary=salrary;
	}

	@Override
	public String toString() {    //5
		return "�̸� : "+name+"\n���� : "+salrary;
	}
	
}
