
public class P8 {

	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���";
		String str2 = new String("�ȳ��ϼ���");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(str2)){  //���� �ּҸ� ���󰡼� char�ڵ尡 ������ �ϳ��ϳ� �����ִ� API 
			                    //�񱳺���1.equals(�񱳺���2)
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		
		

	}

}
