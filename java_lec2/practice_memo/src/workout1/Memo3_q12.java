package workout1;

import java.util.Scanner;

/*
 [����12]���θ޼��忡�� ���� �Է¹ް�  compute�޼��带 ȣ���Ͽ� ó���Ͻÿ�
(1)�Է¹��� ����  compute(item, qty, price)�޼����� ó���Ұ�
(2)�������  �ݾ� = ���� * �ܰ� �� �Ͻÿ�

[�Է�ȭ��]
ǰ���� �Է��Ͻÿ� : apple
������ �Է��Ͻÿ� : 10
�ܰ��� �Է��Ͻÿ� : 1200

[���ȭ��]
ǰ�� : apple
�ݾ� : 12000��
 
 
 */
public class Memo3_q12 {

 public static int compute(String item, int qty, int price) {
	 return qty*price;
 }

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String item;
        int qty, price;
      
        System.out.print("ǰ���� �Է��Ͻÿ� : ");
        item=sc.nextLine();
        
        System.out.print("������ �Է��Ͻÿ� : ");
        qty=sc.nextInt();
        
        System.out.print("�ܰ��� �Է��Ͻÿ� : ");
        price=sc.nextInt();
        
        compute(item, qty, price);
        
        System.out.println("ǰ�� : "+item);
        System.out.println("�ݾ� : "+compute(item, qty, price)+"��");
        
        
        
		
		
		
		
	}

}
