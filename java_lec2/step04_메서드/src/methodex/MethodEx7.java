package methodex;
//call by reference : 참조에 의한 전달, 참조 주소 전달 (원본 데이터에 액세스 할 수 있는 자료)
//객체 자료형에서 사용, 클래스, 열거형, 배열, 인터페이스
public class MethodEx7 {

	
	public static void view1(String str) {
	System.out.println(str);
	}

	public static void view2(int[] num) {
            for(int n:num) {
            	System.out.println("변경전 view2의 num : "+n);
            }
		
         // 	System.out.println();
            num[2]=300;
            for(int n:num) {
            	System.out.println("변경후 view2의 num : "+n);
	}
	}
	
	
	public static void main(String[] args) {
		String str="happy";
		view1(str);   //함수호출
	
	
		
		int [] num= {10,20,30,40,50};
		for(int i:num)
		System.out.println("호출전 메인의 num: "+i);
	
		view2(num);
		for(int i:num)
		System.out.println("호출후 메인의 num: "+i);
		
		
		
	}

}
