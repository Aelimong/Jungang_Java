class StData{
	public int score;
	public String name;
	
}

//싱글톤....디자인 패턴...........
class StManager{ //클래스는 기능별로 만들어준다
	//변수가 없을 때 static으로 메소드 만드는 게 좋음
	
	
	private static final StManager instance=new StManager(); 
	public static StManager getInstance() {
		return instance;
	}
	//자기 자신을 변수로 만들 수 있음
	//instance 참조주소 가져오는 변수
	
	/* 옛날방식
	private static StManager instance=null; 
	public static StManager getInstance() {
		if(instance==null) {
			instance = new StManager();
		}
		return instance;
	}
	*/
	private StManager() { //내부에서만 생성할 수 있음
		//1번 호출됨
		System.out.println("생성자 호출됨");
	}
	
	
	
	
	
	//데이터 형태 및 메소드들.........................
	private int count;
	
	public void manage() {
		count++;
		System.out.println(count+"학생 관리를 합니다");
	}
}

public class P7 {

	public static void main(String[] args) {
		
		StManager m = StManager.getInstance();
		
		m.manage();
		
		
	}

}
