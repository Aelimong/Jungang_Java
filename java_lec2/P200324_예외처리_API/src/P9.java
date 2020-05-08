class BBB{
	
}


public class P9 {

	public static void main(String[] args) {


		BBB b=new BBB();
		int value = b.hashCode(); //메모리의 주소값을 기준으로 고유값을 만들어냄
		System.out.println(value);
		System.out.println(b); //16진수값
		
		String str1=new String("안녕하세요");
		System.out.println(str1.hashCode());
		
		String str2=new String("안녕하세요");
		System.out.println(str2.hashCode());
		

		
		
		
		
		
	}

}
