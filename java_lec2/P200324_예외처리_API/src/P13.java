
public class P13 {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���\n�ݰ����ϴ�\n�ߺ�Ź....";
		System.out.println(str);
		String temp = str.replace("\n", "<br>");
		System.out.println(temp);
	
		String str2=" �� ����     ";
		temp = str2.trim();
		System.out.println(temp);
		
		System.out.println("<"+str2+">");
		System.out.println("<"+temp+">");
		
		str="�ȳ��ϼ���,�ݰ����ϴ�,�ߺ�Ź�����";
		String[] arr=str.split(",");
		
		for(String n:arr) {
			System.out.println(n);
		}
		
		
		
		
	}

}
