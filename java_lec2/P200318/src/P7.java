
public class P7 {

	public static void main(String[] args) {
		String str1="안녕하세요";
		String str2="안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		
     	//잘못된 예제
		//St변수==St변수는 주소값이 같다는 뜻.
		
		if(str1==str2) {
			System.out.println("맞다");
		}else {
			System.out.println("다르다");
		}  
		

	}

}
