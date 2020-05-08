import java.util.*;
import java.io.*;
import java.net.*;


public class ChatClient {

	public static void main(String[] args) throws Exception{
		Scanner scn=new Scanner(System.in);
	
		System.out.println("채팅]클라이언트 시작");
		System.out.println("사용할 닉네임을 입력해주세여");
		System.out.print("입력>");
		
		String name = scn.nextLine();
		
		Socket socket = new Socket("211.183.2.91",7755);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeInt(1);
		dos.writeUTF(name);
		
		//리시브 쓰레드...
		ClientRecvThread rt= new ClientRecvThread();
		rt.socket=socket;
	    rt.start();
		
	System.out.println("채팅서버에 입장하였습니다");
	System.out.println("종료는 q를 입력하여주세여");
	
	
	
	while (true) {
		String message=scn.nextLine();
		if(message.equals("q")) {
			socket.close();
			System.out.println("프로그램 종료...");
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
