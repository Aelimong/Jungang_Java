import java.io.*;


public class P1 {

	public static void main(String[] args) throws FileNotFoundException {
		int a = 10;
		int b = 0;
		int result = a / b;

		System.out.println(result);
		
		File file= new File("C:\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(file);
		//unchecked ���� 
		// :����� ������ ����Ű�µ� ������ �� �� �������� ���� ex)RuntimeException
	
	}


}
