package abstractex;

//----------------------------------------------------------------3

abstract class AA { // 추상 클래스(미완성 상태의 클래스)

	public void view1() {}; // 선언의 형태?

	public void view2() {
		System.out.println("view2 method");
	}

}

class BB extends AA {
	@Override
	public void view1() {
		System.out.println("view11 method");
	}
	// AA클래스의 view1() 재정의- 강제성이 없음 (선언의 형태를 완성된 것이라고 인식하기떄문에)
}

public class AbstractEx1 {

	public static void main(String[] args) {
		// AA ob=new AA(); //객체생성 불가능(앱스트랙트 클래스라서)
		// ob.view1(); //view1
		// ob.view2(); //view2

		AA ob2 = new BB(); // ob2로 참조변수를 만들어 후손객체 생성 /부모자식 객체 생성 가능!!
		ob2.view1(); // view11
		ob2.view2(); // view2

	}

}

//-------------------------------------------------------------------2
//
//abstract class AA{ // 추상 클래스(미완성 상태의 클래스)
//
//	abstract public void view1();  //선언의 형태?
//	public void view2() {System.out.println("view2 method");}
//	
//}
//
//class BB extends AA{
//	
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AA클래스의 view1() 재정의- 강제성이 있음 (앱스트랙트 클래스라서)
//}
//
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//    // AA ob=new AA(); //객체생성 불가능(앱스트랙트 클래스라서)
//    // ob.view1();      //view1
//    // ob.view2();      //view2
//		
//     AA ob2=new BB();  //ob2로 참조변수를 만들어 후손객체 생성 /부모자식 객체 생성 가능!!
//     ob2.view1();    //view11
//     ob2.view2();    //view2
//     
//	}
//
//}


//-------------------------------------------------------------------1                               
//
//class AA{ //일반 클래스
//
//	public void view1() {System.out.println("view1 method");}
//	public void view2() {System.out.println("view2 method");}
//	
//}
//
//class BB extends AA{
//	
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AA클래스의 view1() 재정의- 강제성은 없음
//}
//
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//     AA ob=new AA(); //객체생성 가능
//     ob.view1();      //view1
//     ob.view2();      //view2
//		
//     AA ob2=new BB();  //ob2로 참조변수를 만들어 후손객체 생성
//     ob2.view1();    //view11
//     ob2.view2();    //view2
//     
//	}
//
//}
