class Test{
	
	void method1() throws Exception { //얘를 호출한 쪽에서 처리할 권한을 주겠다
		String str=null;
		System.out.println(str.charAt(0));
	}
}

public class P4 {

	public static void main(String[] args){

		try {
			new Test().method1();
		}catch(Exception e) {
			System.out.println("널포이터오류  ");
		}
		
		System.out.println("메인 나머지 코드들...");
	}

}
