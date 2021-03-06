package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
     Book bk1=new Book("java", "kim" , 100);
     Book bk2=new Book("oracle", "lee" , 200);
     Book bk3=new Book("html", "park", 300);
		
     List<Book> list=new ArrayList<Book>(); //기억공간 갯수 정할 필요없음, 계속 추가할 수 있어서
     list.add(bk1);
     list.add(bk2);
     list.add(bk3);
     
     for(Book ob:list) {
    	 System.out.println("책이름 : "+ob.getTitle());
    	 System.out.println("책저자 : "+ob.getAuthor());
    	 System.out.println("페이지 : "+ob.getPage()+"\n");
     }
     
     // Iterator이용하여 출력
     
       Iterator<Book> iter=list.iterator();
       while (iter.hasNext()) {
    	   Book ob=iter.next();
    	   System.out.println("책이름 : "+ob.getTitle());
           System.out.println("책저자 : "+ob.getAuthor());
           System.out.println("페이지 : "+ob.getPage()+"\n");
       }
		
    //   System.out.println(list.size());
         System.out.println("책이름 : "+list.get(0).getTitle()); 
         System.out.println("책저자 : "+list.get(0).getAuthor()); 
         System.out.println("책이름 : "+list.get(0).getPage()); 
         
         //   --->0객체의 참조값
       
       
       
	}

}
