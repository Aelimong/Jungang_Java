package p2;
import java.net.*;
import java.io.*;
import java.util.*;


public class MessageClient {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("211.183.2.19",7777);
		System.out.println("client 연결되었음");
		
		RecvThread rt= new RecvThread();
		SendThread st= new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
		
		rt.start();
		st.start();
		
				
		
	}

}
