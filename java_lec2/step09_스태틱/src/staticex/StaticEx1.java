package staticex;
//static은 변수와 메서드 사용가능 , 최초의 한 번 초기화 되고 프로그램이 돌아가는 동안 계속 변하지 않는 변수 (전역변수)

class Test{
	int x;
	int y;
	static int z;
	
	static {                                  //위치 상관 없음
		 System.out.println("static 초기화 영역");//최초 1회만 초기화함	  ??????
		}
	
	public Test(int x,int y,int z1) {
		this.x=x;
		this.y=y;
		z=z1;
		System.out.println("객체 초기화 영역");
	}

	public void view() {
		System.out.println(x+" "+y+" "+z);
	}
}



public class StaticEx1 {

	public static void main(String[] args) {
		Test ob1=new Test(1,2,3);
		Test ob2=new Test(4,5,6);

		ob1.view();
		ob2.view();
		
	}

}
