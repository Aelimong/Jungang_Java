import java.io.*;

public class P2 {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\test\\bbb.dat");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//���Ͼ��� �ڵ� ... ������ ���� ������ �ְ�.....
		
		
		
		
		//�� �������� Ŭ����!!!!!!!!!
		dos.close();
		
		
		
		
		
	}

}
