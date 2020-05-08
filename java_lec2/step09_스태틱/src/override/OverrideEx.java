package override;
//동적바인딩
class Test1 { 
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
	
}
class Test2 extends Test1{
	 //어노테이션 
    @Override
	public void view1() {System.out.println("view11 method");}
	public void view2() {System.out.println("view22 method");}
}




public class OverrideEx {

	public static void main(String[] args) {
    Test1 ob=new Test2();//부모클래스의 참조변수(ob)로 자식 객체 생성 / 동적바인딩의 형태
		                 //부모클래스 먼저 갔다가 자식 클래스로!!!
    ob.view1();
    ob.view3();
	
    
    
//  Test2 ob=new Test2();    //Test2갔다가 없으면 그 위로 올라갔다옴
//     ob.view1();
//     ob.view2();
//     ob.view3();
//      
	}

}
