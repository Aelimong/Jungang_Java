
public class P3 {

	public static void main(String[] args) {
		
		try {
			
		int a=10;
		int b=20;
		String str=null;
		
		int result = a/b;
		System.out.println(result);
		System.out.println(str.charAt(0));
		//언체크드예외는 일반적으로 트라이 캐치를 이용하지 않는다
		}catch(NullPointerException  e) {
		System.out.println("예외발생");
		}catch(Exception e) {
			System.out.println("예외발생");
	
		
		System.out.println("나머지 코드들");
	
	
	
	}

}
	
}