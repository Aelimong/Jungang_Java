package test19;
/*
-bname:String   (å�̸�)
-author:String   (����) 
-price:int          (����) 

+setBook(bname:String,  author:String, price:int):void
+viewBook():void
+setter & getter

(3) ���ȭ��
å�̸� : �ڹٿϼ�
��  �� : Ȳ�ϼ�
��  �� : 25000��

å�̸� : JSP���
��  �� : ��JP
��  �� : 35000��
*/

public class BookShop {

	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
    }

	public void viewBook() {
		System.out.println("å�̸� : "+bname);
		System.out.println("��  �� : "+author);
		System.out.println("��  �� : "+price+"��\n");
	}

	public String getBname() {
		return bname;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
	
}
