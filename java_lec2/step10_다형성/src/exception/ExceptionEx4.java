package exception;
//사용자 정의 예외처리  무조건 상속을 받아야함


class MyException extends Exception{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public MyException() {
		System.out.println("애들은 가라~");
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
	  else System.out.println("어서오십쇼");
      
      
    	
   //사용자가 만들 땐  throw 	
		
		
	}

}
