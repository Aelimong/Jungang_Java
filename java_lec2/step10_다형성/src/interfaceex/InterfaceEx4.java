package interfaceex;
/* class와 interface를 이용하여 성적처리
 * 클래스: User
 * -name:String
 * +User
 * +User(name String)
 * +toString():String
 * 
 * 인터페이스 Score
 * +sol:int (초기값:20)  //배점
 * +getScore (): int  //맞은수*sol을 리턴
 * 
 * 인터페이스 Print
 * +toPaint():String
 * 
 * --출력화면
 * 이름 : 홍길동
 * 점수 : 60
 * 
 *  
 * 
 */
class User{
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() { //변수값을 출력해주는 역할 
		return "이름 : "+name;
	}
	
}

interface Score {
	public int sol=20;   //배점
	public int getScore();   //오버라이딩 예정 , 맞은수*sol을 리턴
}

interface Print{
	public String toPaint();
}


public class InterfaceEx4 extends User implements Score, Print{
	
	public int n;
	public InterfaceEx4(String name, int n) {
		super(name);
		this.n=n;
	}
	@Override
	public int getScore() {
		return sol*n;
	}
	@Override
	public String toPaint() {
		return super.toString()+"\n점수 : "+getScore();
	}	

	public static void main(String[] args) {
		InterfaceEx4 ob=new InterfaceEx4("홍길동",3);
		System.out.println(ob.toPaint());

		

	}

}
