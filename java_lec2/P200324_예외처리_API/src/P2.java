
public class P2 {

	public static void main(String[] args) {
//		String str1="�ȳ��ϼ���";
//		System.out.println(str1.charAt(0));
//		
//		String str2=null;
//		System.out.println(str2.charAt(0));

		try {  //�� ��ȣ �ȿ� �͵��� �����Ű�ڴ�, ���ܰ� �߻��ϸ� �װ� ĳġ ������ ���� ��Ű�� ������ �ڵ�� ����ȴ�.
			int[] arr = new int[30];
			arr[0]=1;
			arr[10000]=10;
		}catch(Exception e) {
			System.out.println("�����߻�");
			return;
		}finally { //�������� ���α׷��� ������ѵ� ������ ����Ǵ� �ڵ�!!!
			       //�Ϲ������� üũ�忹�� 
			System.out.println("�ȳ��ϼ���");
		}
		
		
		System.out.println("���Ŀ� ����� �ڵ��...");
		
	}

}
