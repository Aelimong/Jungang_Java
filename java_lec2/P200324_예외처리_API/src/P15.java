
public class P15 {

	public static void main(String[] args) {
		/*
		String str="�ȳ��ϼ���";
		for(int i=0; i<5; i++) {
			str += i;
		}
		
		System.out.println(str);
		*/
		
		//Buffer~~�޸𸮸� ���� �˳��ϰ� ����(�ӽð���)
		StringBuffer str = new StringBuffer("�ȳ��ϼ���");
		
		for(int i=0; i<5; i++) {
			str.append(i);
		}
		
		System.out.println(str);
		
		
		
		
	}

}
