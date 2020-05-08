
public class P6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int result = a / b;
			System.out.println(result);
		} catch (Exception e) {
			//e.printStackTrace(); //프로그램 개발과정에선 무조건 확인해야함
			                     //시스템쩜아웃쩜 해서 예외의 결과가 콘솔에 나옴
			                     //java.lang.ArithmeticException: / by zero
			String message = e.getMessage();
			System.out.println(message+"의 문제가 발생");
		}

		System.out.println("안녕하세요");
	}
}