package methodex;
//call by name 
public class MethodEx1 {

	
	public static void view() {
		System.out.println("hello");
		//return; //생략가능 void일 때  무언가 출력하고 끝나는구나( 값에 대해 리턴할 일이 없을 때)
		//함수:메서드	
	}
	
	public static void star() {
		System.out.println("******");
	}
	
	
	public static void main(String[] args) {
  //메인함수 안에 이름만 있는 것
		view();
        star();
        view();
        star();
        
      //public static ~~~ 함수 안에 함수는 선언하지 않음
		
	}

}
