import java.io.*;


public class P1 {

	public static void main(String[] args) throws FileNotFoundException {
		int a = 10;
		int b = 0;
		int result = a / b;

		System.out.println(result);
		
		File file= new File("C:\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(file);
		//unchecked 예외 
		// :실행시 문제는 일으키는데 컴파일 할 땐 문제없는 예외 ex)RuntimeException
	
	}


}
