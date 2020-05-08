
public class P13 {

	public static void main(String[] args) {
		String str = "안녕하세요\n반갑습니다\n잘부탁....";
		System.out.println(str);
		String temp = str.replace("\n", "<br>");
		System.out.println(temp);
	
		String str2=" 박 지성     ";
		temp = str2.trim();
		System.out.println(temp);
		
		System.out.println("<"+str2+">");
		System.out.println("<"+temp+">");
		
		str="안녕하세요,반갑습니다,잘부탁드려요";
		String[] arr=str.split(",");
		
		for(String n:arr) {
			System.out.println(n);
		}
		
		
		
		
	}

}
