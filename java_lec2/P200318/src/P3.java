
public class P3 {

	public static void main(String[] args) {
		
		int i=0;
		for(; i<10; i++) {
			if(i==7) {
				break;
			}
		}
		System.out.println(i);
		
		/*
		for(int i=0; i<10; i++) { //위에서 i가 생성된 채로 소멸되지 않았기 때문에 사용불가
			
		}
		*/
		

	}

}
