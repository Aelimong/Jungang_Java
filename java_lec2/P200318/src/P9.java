//배열 메모리
public class P9 {

	public static void main(String[] args) {
		int[] arr= new int[5]; //int[] 참조타입 , heap메모리에 생성
		
		arr[0]=10;	
		arr[3]=10;
		
		arr= null;
		arr[3]=50;
		//java.lang.NullPointerException 문법적 오류는 아니지만 실행시 오류
		//arr이 어떤 메모리 주소(heap)를 참조하지 않아서(null) 값을 넣을 수 없음
		
		
		
	
	}

}
