package test19;
/*
 * 
BookShop ob=new BookShop();
ob.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
//viewBook()�޼��带 �̿��ؼ� ������ �ϼ��Ͻÿ�

ob.setBname("JSP���"),  
ob.setAuthor("��JP"), 
ob.setPrice(3500)
//getter�� �̿��ؼ� ������ �ϼ��Ͻÿ�


(3) ���ȭ��
å�̸� : �ڹٿϼ�
��  �� : Ȳ�ϼ�
��  �� : 25000��

å�̸� : JSP���
��  �� : ��JP
��  �� : 35000��

 */
public class BookShopEx {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		ob.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
		ob.viewBook();
		
		
		
		ob.setBname("JSP���");
		ob.setAuthor("��JP");
		ob.setPrice(35000);
		System.out.println("å�̸� : "+ob.getBname());
		System.out.println("��   �� : "+ob.getAuthor());
		System.out.println("��   �� : "+ob.getPrice()+"��");
		
	}

	
}
