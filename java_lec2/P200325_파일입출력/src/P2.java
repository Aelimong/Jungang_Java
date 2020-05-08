import java.io.*;

public class P2 {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\test\\bbb.dat");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//파일쓰기 코드 ... 로직에 따하 적절히 넣고.....
		
		
		
		
		//꼭 마지막에 클로즈!!!!!!!!!
		dos.close();
		
		
		
		
		
	}

}
