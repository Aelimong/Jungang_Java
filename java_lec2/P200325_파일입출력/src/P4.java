import java.io.*;
//�б� ����......����ϰڴ�!!!!!!!!!!!!!!!!!!
public class P4 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("C:\\test\\aaa.dat");
		FileInputStream fis= new FileInputStream(file);
		BufferedInputStream bis= new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		//�б� ����....�ڡڳִ� �԰ݰ� �̴� �԰��� ��~~~~���� ���ƾ���
		int a = dis.readInt();
		int b = dis.readInt();
		int c = dis.readByte(); //����Ʈ�� ���͵� int�� ����
		String d = dis.readUTF();
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
		dis.close();
		
		
	}

}
