package workout1;
/*[����3] ���� ���� ���� �����Ͽ� ����Ͻÿ�
(name : �ε鷡 / kor : 90  / eng : 70 / mat : 75)

[���ȭ��]
�̸� : �ε鷡
�հ����� : 235��
������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�
 */

public class Memo1 {

	public static void main(String[] args) {

	String name="�ε鷡";
    double kor=90;
	double eng=70;
	double mat=75;	
	double tot=kor+eng+mat;
	double avg=tot/3;
	 
    System.out.println("�̸� : "+name);
    System.out.println("�հ�����: "+tot+"��");
    System.out.printf("�������: %.1f��", avg);
		
		
	}

}
