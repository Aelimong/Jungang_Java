package finalex;
import java.lang.Object;  //�ڹٴ� �׻� ���⿡ ��� �Ǿ�����(���� �Ǿ�����)
import java.lang.String; 
import java.lang.System;

class Test{
    String name="��ȣ��";
    
   
//
//    public Test() { //������! ����������
//	} 
    
    
    public void view() {
    	System.out.println("�̸� : "+this.name.toString());
    }
    
}


public class ObjectEx {

	public static void main(String[] args) {
      Test ob=new Test();
      ob.view();
	}

}
