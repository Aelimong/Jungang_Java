package exception;
//����� ���� ����ó��  ������ ����� �޾ƾ���


class MyException extends Exception{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public MyException() {
		System.out.println("�ֵ��� ����~");
	}
}


public class ExceptionEx4 {

	public static void main(String[] args) {
      int age=Integer.parseInt(args[0]);
      
      if(age<19)
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  else System.out.println("����ʼ�");
      
      
    	
   //����ڰ� ���� ��  throw 	
		
		
	}

}
