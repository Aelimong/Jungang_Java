
public class P2 {

	public static void main(String[] args) {
//		String str1="안녕하세요";
//		System.out.println(str1.charAt(0));
//		
//		String str2=null;
//		System.out.println(str2.charAt(0));

		try {  //이 괄호 안에 것들을 실행시키겠다, 예외가 발생하면 그걸 캐치 쪽으로 실행 시키고 나머지 코드들 진행된다.
			int[] arr = new int[30];
			arr[0]=1;
			arr[10000]=10;
		}catch(Exception e) {
			System.out.println("에러발생");
			return;
		}finally { //리턴으로 프로그램을 종료시켜도 무조건 실행되는 코드!!!
			       //일반적으로 체크드예외 
			System.out.println("안녕하세요");
		}
		
		
		System.out.println("이후에 실행될 코드들...");
		
	}

}
