import java.util.*;

public class P1 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>(); //List는 인터페이스라서 new List(); 객체생성 불가
		
		list.add(null);
		list.add("보라돌이");
		list.add(2,"뚜비");
		list.add(3,"나나");
		list.add(3,"뽀");
		list.add(4,"뽀");
		list.add(5,"청소기");
		
		String str=list.get(3);
		
		System.out.print(str+"\n");
		System.out.println();
		
		list.remove(2);
		
		
		System.out.println();
		System.out.println("리스트 사이즈"+list.size());
		System.out.println();
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		
		
		
		
	}

}
