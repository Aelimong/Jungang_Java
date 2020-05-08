package p2;

import java.net.*;
import java.io.*;
import java.util.*;

class RecvThread extends Thread {
	Socket socket; // ��� �ޱ⸸ �ϴ� ������

	public void run() {
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			while (true) {
				String value = dis.readUTF();
				System.out.println("���� �޽���>" + value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class SendThread extends Thread {
	Socket socket; // ��� �����⸸ �ϴ� ������

	public void run() {
		try {
			Scanner scn = new Scanner(System.in);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos= new DataOutputStream(os);
			
			while(true) {
				System.out.println("�Է� q=����>");
				String value =scn.nextLine();
				
				
				if(value.equals("q")) {
					break;
				}
				
				dos.writeUTF(value);
			}	
			socket.close();
			System.out.println("����Ǿ���.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class MessageServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("server ������ �� �� ���Ӵ��");
		Socket socket = ss.accept();
		System.out.println("server ����Ǿ���....");

		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();

		rt.socket = socket;
		st.socket = socket;

		rt.start();
		st.start();

	}

}
