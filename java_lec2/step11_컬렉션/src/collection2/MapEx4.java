package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx4 {

	public static void main(String[] args) {
		
		 Book bk1=new Book("java", "kim" , 100);
	     Book bk2=new Book("oracle", "lee" , 200);
	     Book bk3=new Book("html", "park", 300);
	     
	          //"java"의 자료형 , 전체가 들어올 수 있는 자료형
	     Map<String, Book> map=new HashMap<String, Book>();
	     map.put(bk1.getTitle(), bk1);
	     map.put(bk2.getTitle(), bk2);
	     map.put(bk3.getTitle(), bk3);

	     Scanner sc=new Scanner(System.in);
	     System.out.println("찾는 도서명을 입력 : ");
	     String title=sc.next();
	     
	     if(map.get(title)==null) {
	    	 System.out.println("찾는 도서가 없어요...");
	     } else {
	    	 System.out.println(map.get(title).getTitle());
	    	 System.out.println(map.get(title).getAuthor());
	    	 System.out.println(map.get(title).getPage());
	     }
	     sc.close();
	     
	     
	     
	}

}
