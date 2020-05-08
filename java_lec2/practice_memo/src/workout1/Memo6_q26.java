package workout1;
/*
[����26]�������̵�(override)�� �̿��Ͽ� ���� ���α׷��� �ۼ��Ͻÿ�

(1)Ŭ������: BaseTest
   �ʵ�� : name:String           ==> �ʱⰪ : �ε鷡
        salary:int          ==> �ʱⰪ : 12000000
   �޼ҵ� : getDisplay():void   ==> �̸��� �������

(2)Ŭ������: DerivedTest
   �ʵ�� : department:String   ==> �ʱⰪ : "ȫ����";
   �޼ҵ� : getDisplay():void   ==> �μ����

(3)ó������
    BaseTest  bt = new DerivedTest();  
    (BaseTest(����)Ŭ������ DerivedTest(�ļ�) ��ü�����Ұ�)

(4)���
�̸� : �ε鷡
���� : 12000000 
�μ� : ȫ����
 */

class BaseTest {
	String name="�ε鷹";
	int salary=12000000;
	
	public void getDisplay() {
     System.out.println("�̸� : "+name+"\n"+"���� : "+salary);
	}
}


class DerivedTest extends BaseTest{
	
	String department="ȫ����";

	@Override
	public void getDisplay() {
		super.getDisplay();
		System.out.println("�μ� : "+department);
	}
	
}

public class Memo6_q26 {

	public static void main(String[] args) {
		BaseTest  bt = new DerivedTest();  
		bt.getDisplay();
		
		
		
	}

}
