package exception;
/*
 * 예외처리
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int var=5;
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(var/n);
		}catch (Exception e) { //상위에 있기 때문에 어떤 문자, 공백을 입력해도 아래 값으로 출력 됨
			System.out.println("입력된 값에 문제가 있어요");
		}
		
		
		
		
		
		
		/* $ java ExceptionEx1 2 ==> 2
	 * $ java ExceptionEx1 0 ==> 0으로 나눌 수 없어요
	 * $ java ExceptionEx1 p ==> 숫자로 바꿀 수 없습니다
	 * $ java ExceptionEx1 ' ' ==>입력된 값이 없습니다
	 */
		
		
		
//		int var=5;
//		
//		try {
//			
//		int n=Integer.parseInt(args[0]);
//		System.out.println(var/n);
//		
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없어요"+e.getMessage());
//		}catch(NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다"+e.toString());
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("입력된 값이 없습니다");
//		} finally {
//			System.out.println("무조건 실행");  //finally 무조건 실행, 예외처리를 끝나고 객체를 닫는 역할
//		}
		
		
		
		
		
	}

}
