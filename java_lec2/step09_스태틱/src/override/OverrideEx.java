package override;
//�������ε�
class Test1 { 
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
	
}
class Test2 extends Test1{
	 //������̼� 
    @Override
	public void view1() {System.out.println("view11 method");}
	public void view2() {System.out.println("view22 method");}
}




public class OverrideEx {

	public static void main(String[] args) {
    Test1 ob=new Test2();//�θ�Ŭ������ ��������(ob)�� �ڽ� ��ü ���� / �������ε��� ����
		                 //�θ�Ŭ���� ���� ���ٰ� �ڽ� Ŭ������!!!
    ob.view1();
    ob.view3();
	
    
    
//  Test2 ob=new Test2();    //Test2���ٰ� ������ �� ���� �ö󰬴ٿ�
//     ob.view1();
//     ob.view2();
//     ob.view3();
//      
	}

}
