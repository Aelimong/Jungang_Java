import java.util.*;

class AAA{ //��� Ŭ������ ������Ʈ�� �⺻���� ��ӹ޴´�
	int v1;
	int v2;
	                           //�񱳰� ref2��
	                           //������Ʈ������ ���ϱ� AAA������ ���� ĳ���� �������
	public boolean equals(Object xx) {   //?���� ���� �������̵� �ߴٴ� ����. ������Ʈ Ŭ������ ������ �޼ҵ带?
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
	//	ref1.toString(); //������Ʈ�� �޼ҵ�� ��밡����
		ref1.v1=10;
		ref1.v2=20;
		
		AAA ref2= new AAA();
		ref2.v1=10;
		ref2.v2=20;
		
		//�ּҰ� ���ϴ���
		if(ref1.equals(ref2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
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
