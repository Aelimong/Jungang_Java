package interfaceex;
/* class�� interface�� �̿��Ͽ� ����ó��
 * Ŭ����: User
 * -name:String
 * +User
 * +User(name String)
 * +toString():String
 * 
 * �������̽� Score
 * +sol:int (�ʱⰪ:20)  //����
 * +getScore (): int  //������*sol�� ����
 * 
 * �������̽� Print
 * +toPaint():String
 * 
 * --���ȭ��
 * �̸� : ȫ�浿
 * ���� : 60
 * 
 *  
 * 
 */
class User{
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() { //�������� ������ִ� ���� 
		return "�̸� : "+name;
	}
	
}

interface Score {
	public int sol=20;   //����
	public int getScore();   //�������̵� ���� , ������*sol�� ����
}

interface Print{
	public String toPaint();
}


public class InterfaceEx4 extends User implements Score, Print{
	
	public int n;
	public InterfaceEx4(String name, int n) {
		super(name);
		this.n=n;
	}
	@Override
	public int getScore() {
		return sol*n;
	}
	@Override
	public String toPaint() {
		return super.toString()+"\n���� : "+getScore();
	}	

	public static void main(String[] args) {
		InterfaceEx4 ob=new InterfaceEx4("ȫ�浿",3);
		System.out.println(ob.toPaint());

		

	}

}
