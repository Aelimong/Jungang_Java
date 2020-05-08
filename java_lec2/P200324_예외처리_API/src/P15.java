
public class P15 {

	public static void main(String[] args) {
		/*
		String str="안녕하세요";
		for(int i=0; i<5; i++) {
			str += i;
		}
		
		System.out.println(str);
		*/
		
		//Buffer~~메모리를 조금 넉넉하게 만듬(임시공간)
		StringBuffer str = new StringBuffer("안녕하세요");
		
		for(int i=0; i<5; i++) {
			str.append(i);
		}
		
		System.out.println(str);
		
		
		
		
	}

}
