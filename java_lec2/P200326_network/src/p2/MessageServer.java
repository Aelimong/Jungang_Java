package p2;

import java.net.*;
import java.io.*;
import java.util.*;

class RecvThread extends Thread {
	Socket socket; // 계속 받기만 하는 쓰레드

	public void run() {
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			while (true) {
				String value = dis.readUTF();
				System.out.println("받은 메시지>" + value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class SendThread extends Thread {
	Socket socket; // 계속 보내기만 하는 쓰레드

	public void run() {
		try {
			Scanner scn = new Scanner(System.in);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos= new DataOutputStream(os);
			
			while(true) {
				System.out.println("입력 q=종료>");
				String value =scn.nextLine();
				
				
				if(value.equals("q")) {
					break;
				}
				
				dos.writeUTF(value);
			}	
			socket.close();
			System.out.println("종료되었슴.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class MessageServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("server 가동시 작 및 접속대기");
		Socket socket = ss.accept();
		System.out.println("server 연결되었음....");

		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();

		rt.socket = socket;
		st.socket = socket;

		rt.start();
		st.start();

	}

}
