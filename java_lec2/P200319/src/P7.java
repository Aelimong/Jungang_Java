class StData{
	public int score;
	public String name;
	
}

//�̱���....������ ����...........
class StManager{ //Ŭ������ ��ɺ��� ������ش�
	//������ ���� �� static���� �޼ҵ� ����� �� ����
	
	
	private static final StManager instance=new StManager(); 
	public static StManager getInstance() {
		return instance;
	}
	//�ڱ� �ڽ��� ������ ���� �� ����
	//instance �����ּ� �������� ����
	
	/* �������
	private static StManager instance=null; 
	public static StManager getInstance() {
		if(instance==null) {
			instance = new StManager();
		}
		return instance;
	}
	*/
	private StManager() { //���ο����� ������ �� ����
		//1�� ȣ���
		System.out.println("������ ȣ���");
	}
	
	
	
	
	
	//������ ���� �� �޼ҵ��.........................
	private int count;
	
	public void manage() {
		count++;
		System.out.println(count+"�л� ������ �մϴ�");
	}
}

public class P7 {

	public static void main(String[] args) {
		
		StManager m = StManager.getInstance();
		
		m.manage();
		
		
	}

}
