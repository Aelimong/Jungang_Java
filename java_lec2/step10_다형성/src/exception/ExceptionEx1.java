package exception;
/*
 * ����ó��
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int var=5;
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(var/n);
		}catch (Exception e) { //������ �ֱ� ������ � ����, ������ �Է��ص� �Ʒ� ������ ��� ��
			System.out.println("�Էµ� ���� ������ �־��");
		}
		
		
		
		
		
		
		/* $ java ExceptionEx1 2 ==> 2
	 * $ java ExceptionEx1 0 ==> 0���� ���� �� �����
	 * $ java ExceptionEx1 p ==> ���ڷ� �ٲ� �� �����ϴ�
	 * $ java ExceptionEx1 ' ' ==>�Էµ� ���� �����ϴ�
	 */
		
		
		
//		int var=5;
//		
//		try {
//			
//		int n=Integer.parseInt(args[0]);
//		System.out.println(var/n);
//		
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ���� �� �����"+e.getMessage());
//		}catch(NumberFormatException e) {
//			System.out.println("���ڷ� �ٲ� �� �����ϴ�"+e.toString());
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�Էµ� ���� �����ϴ�");
//		} finally {
//			System.out.println("������ ����");  //finally ������ ����, ����ó���� ������ ��ü�� �ݴ� ����
//		}
		
		
		
		
		
	}

}
