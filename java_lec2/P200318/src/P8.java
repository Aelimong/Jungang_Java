
public class P8 {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = new String("안녕하세요");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(str2)){  //참조 주소를 따라가서 char코드가 같은지 하나하나 비교해주는 API 
			                    //비교변수1.equals(비교변수2)
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		

	}

}
