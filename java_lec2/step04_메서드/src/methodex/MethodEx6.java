package methodex;

public class MethodEx6 {

	                        //�Ʒ� ���Ͱ� ����Ƽ���� �ٸ� ����
	                        //���� �����ؼ� �������� ��, ���� �⺻�ڷ����̱� ������ (��������)
	public static int total(int toeic, int it) {
	   
		return toeic+it;
	}
	
	public static String rs(int total) {   //�Լ�����
		if(total >= 800) 
			return "�հ�";
			else return "���հ�";
	}
	
	
	public static void main(String[] args) {
       int toeic=750, it=65;
     
       System.out.println("�Ի����� : "+total(toeic, it)+"��");
       System.out.println("�Ի��� : "+rs(total(toeic, it))+"�Դϴ�");
		
		//�Ի����� : 815��
       //�Ի��� : �հ��Դϴ�    --->800�� �̻� �հ�, �̸� ���հ�
		
	}

}
