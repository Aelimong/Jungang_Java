package p1;
import java.net.*;
import java.io.*;

public class TestServer {

	public static void main(String[] args) throws Exception {       
		ServerSocket serverSocket = new ServerSocket(1007);
		                                         //��Ʈ�ѹ� �־��ֱ�
		System.out.println("server ������ ������ ��ٸ��ϴ�....");
		
		Socket socket = serverSocket.accept();//�����ϱ� ������ �ڡڿ��⼭�ڡ� ��������
		
		System.out.println("server ������ ���� �Ǿ����ϴ�......");
	
		InputStream is = socket.getInputStream(); //input �д���, out ������ ��
												  //�߰��ܰ��� ������Ʈ��ǲ�� �� ���� �� ���� ������ �д� ���
		                                          //�ٷ� ���󰡾��ϴϱ�
		DataInputStream dis=new DataInputStream(is);
		
		String a = dis.readUTF();		
		
		System.out.println("server ���޹��� ��: "+ a);
		
		socket.close();
		
	}
	

}
