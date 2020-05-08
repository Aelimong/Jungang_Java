package methodex;

public class MethodEx6 {

	                        //아래 토익과 아이티랑은 다른 변수
	                        //값은 복사해서 가져오는 것, 각자 기본자료형이기 때문에 (지역변수)
	public static int total(int toeic, int it) {
	   
		return toeic+it;
	}
	
	public static String rs(int total) {   //함수정의
		if(total >= 800) 
			return "합격";
			else return "불합격";
	}
	
	
	public static void main(String[] args) {
       int toeic=750, it=65;
     
       System.out.println("입사총점 : "+total(toeic, it)+"점");
       System.out.println("입사결과 : "+rs(total(toeic, it))+"입니다");
		
		//입사총점 : 815점
       //입사결과 : 합격입니다    --->800점 이상 합격, 미만 불합격
		
	}

}
