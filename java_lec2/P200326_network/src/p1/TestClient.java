package p1;
import java.net.*;
import java.io.*;
import java.util.*; //��ĳ�ʹ�������

//Ŭ���̾�Ʈ���� : ���� �޴� �� 

public class TestClient {

	public static void main(String[] args) throws Exception{
		 Socket socket = new Socket("211.183.2.12",1007);
		                           //�������ּ�, ��Ʈ�ѹ�
		//Socket socket = new Socket("localhost",1007); //����ǻ�Ϳ� �����ϰڴ�

		System.out.println("client ���� ����....");
		
		OutputStream os= socket.getOutputStream();
		DataOutputStream dos= new DataOutputStream(os);
		
		Scanner scn =new Scanner(System.in);
		System.out.println("���ް� �Է�>");
		
		String value = scn.nextLine();
		dos.writeUTF(value);
		
		socket.close(); //������ �ݾ������
	}

}
