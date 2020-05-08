import java.util.*;
import java.io.*;
import java.net.*;


public class ChatClient {

	public static void main(String[] args) throws Exception{
		Scanner scn=new Scanner(System.in);
	
		System.out.println("ä��]Ŭ���̾�Ʈ ����");
		System.out.println("����� �г����� �Է����ּ���");
		System.out.print("�Է�>");
		
		String name = scn.nextLine();
		
		Socket socket = new Socket("211.183.2.91",7755);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeInt(1);
		dos.writeUTF(name);
		
		//���ú� ������...
		ClientRecvThread rt= new ClientRecvThread();
		rt.socket=socket;
	    rt.start();
		
	System.out.println("ä�ü����� �����Ͽ����ϴ�");
	System.out.println("����� q�� �Է��Ͽ��ּ���");
	
	
	
	while (true) {
		String message=scn.nextLine();
		if(message.equals("q")) {
			socket.close();
			System.out.println("���α׷� ����...");
			break;
		}
		
		dos.writeInt(2);
		dos.writeUTF(message);

		
		
	}
		
		
		
	}

}


class ClientRecvThread extends Thread{
	public Socket socket;
	public void run() {
		
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message=dis.readUTF();
				System.out.println(message);
			}
			
			
		}catch(Exception e) {
			
		}
		 
	}
}