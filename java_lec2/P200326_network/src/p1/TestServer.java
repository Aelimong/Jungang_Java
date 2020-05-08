package p1;
import java.net.*;
import java.io.*;

public class TestServer {

	public static void main(String[] args) throws Exception {       
		ServerSocket serverSocket = new ServerSocket(1007);
		                                         //포트넘버 넣어주기
		System.out.println("server 소켓이 연결을 기다립니다....");
		
		Socket socket = serverSocket.accept();//접속하기 전까지 ★★여기서★★ 멈춰있음
		
		System.out.println("server 누군가 연결 되었습니다......");
	
		InputStream is = socket.getInputStream(); //input 읽는쪽, out 보내는 쪽
												  //중간단계인 ㅂㅓ퍼트인풋은 안 쓰는 게 좋은 데이터 읽는 즉시
		                                          //바로 날라가야하니까
		DataInputStream dis=new DataInputStream(is);
		
		String a = dis.readUTF();		
		
		System.out.println("server 전달받은 값: "+ a);
		
		socket.close();
		
	}
	

}
