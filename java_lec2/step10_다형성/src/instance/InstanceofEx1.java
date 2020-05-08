package instance;

class A{}

class B extends A{}
class C extends A{}
class D extends B{}


public class InstanceofEx1 {

	public static void main(String[] args) {
        A a=new A();
        B b=new B();
        D d=new D();
        //참조변수가 참조하는 인스턴스의 실제 타입을 알아보기 위한 연산자
        
        System.out.println(b instanceof A); //참조변수 b가 인스턴스 A클래스에 속해있는가?? 속해있으니 true(상속되어 있음)
        System.out.println(a instanceof C);  //false 참조변수 a는 부모클래스이기 때문에 누구에게 속해있지 않음!!!!
        System.out.println(d instanceof A); //true
        
       // System.out.println(b instanceof C); //error
		
		
	}

}
