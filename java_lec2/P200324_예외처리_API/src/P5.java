class Test2{              // �ܺο��� �߷ο� �϶�� �����ִ� ��?
	void method1(int value) throws MyException {
		System.out.println("method1...�ڵ��");
		System.out.println("method1...�ڵ��");
		if(value<0) {//value�� 0���� ���� �� 
			         
			//�����ڵ忡�� ���������� ��-�ο� �ϰڴ� 
			throw new MyException("0���� ���� ���� ���Խ��ϴ�.");
		
		}
	
		
		System.out.println("method1...�ڵ��");
		System.out.println("method1...�ڵ��");
	}
}

class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public MyException(String message) {
		super(message);
		
	}
	
	
	
}


public class P5 {

	public static void main(String[] args) {
		
		try{
			new Test2().method1(-5);
		}catch(MyException e) {//���ο��� 
			System.out.println(e.getMessage());
		}
		
	}
}

