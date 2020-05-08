package test19;
/*
 * 
BookShop ob=new BookShop();
ob.setBook("자바완성","황완성",25000);
//viewBook()메서드를 이용해서 나머지 완성하시오

ob.setBname("JSP잡기"),  
ob.setAuthor("송JP"), 
ob.setPrice(3500)
//getter를 이용해서 나머지 완성하시오


(3) 출력화면
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원

 */
public class BookShopEx {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		ob.setBook("자바완성","황완성",25000);
		ob.viewBook();
		
		
		
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(35000);
		System.out.println("책이름 : "+ob.getBname());
		System.out.println("저   자 : "+ob.getAuthor());
		System.out.println("가   격 : "+ob.getPrice()+"원");
		
	}

	
}
