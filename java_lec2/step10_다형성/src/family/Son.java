package family;

public class Son extends Family implements Job {
	
	
	public Son() {
		// TODO Auto-generated constructor stub
	}

	
	public Son(String name) {
		super(name);
	}
	
	@Override
	public String work() {
		return "����";
	}
	
	
	@Override
	public String toString() {
		return  super.toString()+"�Ƶ��� "+work()+"�� �Ѵ�";
	}

}
