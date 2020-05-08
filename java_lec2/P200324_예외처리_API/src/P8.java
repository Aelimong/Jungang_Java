import java.util.*;

class AAA{ //모든 클래스는 오브젝트를 기본으로 상속받는다
	int v1;
	int v2;
	                           //비교값 ref2들어감
	                           //오브젝트형으로 들어가니까 AAA형으로 강제 캐스팅 해줘야함
	public boolean equals(Object xx) {   //?뭐랑 뭐를 오버라이딩 했다는 거지. 오브젝트 클래스의 이퀄즈 메소드를?
		AAA temp=(AAA)xx;
		if(this.v1 == temp.v1 && this.v2==temp.v2) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "AAA [v1=" + v1 + ", v2=" + v2 + "]";
	}
	
	
	
	
	
}

public class P8 {

	public static void main(String[] args) {

	//	Object ref = new AAA();
		AAA ref1 = new AAA();
	//	ref1.toString(); //오브젝트의 메소드들 사용가능함
		ref1.v1=10;
		ref1.v2=20;
		
		AAA ref2= new AAA();
		ref2.v1=10;
		ref2.v2=20;
		
		//주소값 비교하는중
		if(ref1.equals(ref2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(ref1);
		String str = ref1.toString();
		System.out.println(str);
		

		ArrayList<Integer> list = 
				new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
	}

}
