package family;

public class Father extends Family implements Job {

	public Father() {
		// TODO Auto-generated constructor stub
	}
	
	public Father(String name) {
		super(name);
	
	}
	
	@Override
	public String work() {
		return "�ƺ��� ������ ���� �Ѵ�"+"\n";
	}


	@Override
	public String toString() {
		return super.toString()+work();
	}
	

}
