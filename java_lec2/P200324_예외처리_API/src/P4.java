class Test{
	
	void method1() throws Exception { //�긦 ȣ���� �ʿ��� ó���� ������ �ְڴ�
		String str=null;
		System.out.println(str.charAt(0));
	}
}

public class P4 {

	public static void main(String[] args){

		try {
			new Test().method1();
		}catch(Exception e) {
			System.out.println("�������Ϳ���  ");
		}
		
		System.out.println("���� ������ �ڵ��...");
	}

}
