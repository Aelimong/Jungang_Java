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
        //���������� �����ϴ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ������
        
        System.out.println(b instanceof A); //�������� b�� �ν��Ͻ� AŬ������ �����ִ°�?? ���������� true(��ӵǾ� ����)
        System.out.println(a instanceof C);  //false �������� a�� �θ�Ŭ�����̱� ������ �������� �������� ����!!!!
        System.out.println(d instanceof A); //true
        
       // System.out.println(b instanceof C); //error
		
		
	}

}
