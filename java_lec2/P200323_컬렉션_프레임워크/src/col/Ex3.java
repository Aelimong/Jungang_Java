package col;

import java.util.*;

class Test{             //ǥ���� �������̽��� ���� �� ����
	public void method1(List<String> list) {
		method2(list);
	}

    public void method2(List<String> list) {
		
	}

}

public class Ex3 {

	public static void main(String[] args) {
		//�������� ������
		//�迭���� �������̽��� �ִ�, ǥ���� �ִ�
		
		                     //�������� String �������ָ� ��ü�����κ�<>���� �ڵ����� 
							 // ������
		List<String> list = new ArrayList<>();
		 //List<String> list = new ArrayList<String>();
		 //List<String> list1 = new LinkedList<String>();
		 //--->�޴� ���� �������̽��� �����ϸ� ���������� ��������!!!!!
		 //�ҽ����� ���յ��� ������ �ֱ� ������ ��ⱳü�� ����

		 //List�� ǥ���� ���ǵǾ��ִ�. 
		//ArrayList�� List�� ��� ����
		//LinkedList�� �������̽� List�� �����Ǿ��ִ� ����
		
		new Test().method1(list);
		
	}

}
