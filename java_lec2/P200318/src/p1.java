//변수
public class p1 {

	public static void main(String[] args) {
		
		{
			int a=10; //지역변수(스코프 안쪽에서 생성된)는 메소드를{스코프} 빠져 나가면 소멸됨
			a=20;
			System.out.println(a);
		}
		
		
		int a=49;
		//이전 변수 소멸시키면 됨
		System.out.println(a);
		System.out.println("무언가의 코드....");

	}

}
