package p1;
import java.net.*;
import java.io.*;
import java.util.*; //스캐너받으려고

//클라이언트서버 : 전달 받는 쪽 

public class TestClient {

	public static void main(String[] args) throws Exception{
		 Socket socket = new Socket("211.183.2.12",1007);
		                           //아이피주소, 포트넘버
		//Socket socket = new Socket("localhost",1007); //내컴퓨터에 접속하겠다

		System.out.println("client 연결 성공....");
		
		OutputStream os= socket.getOutputStream();
		DataOutputStream dos= new DataOutputStream(os);
		
		Scanner scn =new Scanner(System.in);
		System.out.println("전달값 입력>");
		
		String value = scn.nextLine();
		dos.writeUTF(value);
		
		socket.close(); //소켓을 닫아줘야함
	}

}
