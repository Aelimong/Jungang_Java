//람다식: 쓰일 일이 저어어어어엉말 없을 때,1~3줄 정도만 필요할 때
//(코드 간결화를 위해)

interface Callable{ 
	public void call(int a, String str); //상속 오버라이딩 해줘야함 
}

/* ★첫번째 방법
class Test3 implements Callable{
	
	
	public void call() {
	System.out.println("무언가 아주~~~~~ 간단한 코드...");	
	}
}
*/



public class P7 {

	public static void main(String[] args) {
		
		/*★두번째 방법			//익명개체
		Callable x =new Callable() {
			int a=10;
			@Override
			public void call() {
				this.a=20;
				System.out.println(a+" 아주 간단한 코드");
				
			}
		}; 
		*/
		
		//람다식
		Callable x = (a,str) -> {
			System.out.println(a+" 아주 간단한 코드 "+str);
		};
		
		//다형성에 의해 변수가 달라도 객체생성 가능!
		x.call(10,"애림");
		
		
		
		
	}

}
