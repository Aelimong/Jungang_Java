class Test2{              // 외부에서 뜨로우 하라고 던져주는 것?
	void method1(int value) throws MyException {
		System.out.println("method1...코드들");
		System.out.println("method1...코드들");
		if(value<0) {//value가 0보다 작을 때 
			         
			//실행코드에서 직접적으로 뜨-로우 하겠다 
			throw new MyException("0보다 작은 값이 들어왔습니다.");
		
		}
	
		
		System.out.println("method1...코드들");
		System.out.println("method1...코드들");
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
		}catch(MyException e) {//내부에서 
			System.out.println(e.getMessage());
		}
		
	}
}

