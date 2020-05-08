package test19;
/*
-bname:String   (책이름)
-author:String   (저자) 
-price:int          (가격) 

+setBook(bname:String,  author:String, price:int):void
+viewBook():void
+setter & getter

(3) 출력화면
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원
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
		System.out.println("책이름 : "+bname);
		System.out.println("저  자 : "+author);
		System.out.println("가  격 : "+price+"원\n");
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
