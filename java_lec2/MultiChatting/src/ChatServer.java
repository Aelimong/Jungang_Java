import java.util.*;
import java.io.*;
import java.net.*;

/**
 * @author USER accept만하는 thread를 따로 빼내서 무한반복시킴 오오오호호호홓 너무 좋은데
 */
public class ChatServer {

	public static void main(String[] args) throws Exception {
		System.out.println("서버] 가동 시작 ..."); // 일종의 로그
		ServerSocket ss = new ServerSocket(7755);

		// main을 빠져나가지않음. main을 스레드로 사용
		while (true) {

			try {
				Socket socket = ss.accept();
				// 내부에 접속하는 수만큼 소켓이 생성됨.
				// 소켓을 받자마자 writeUTF한다는 가정하에 작성
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				int command = dis.readInt();

				if (command == 1) {
					// 닉네임 설정
					String nick = dis.readUTF();
					User u = new User(nick, socket);
					DataModel.list.add(u);
					// thread가 한사람당 하나씩 생성됨

					// greeting

					for (User user : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(user.socket.getOutputStream());

						dos.writeUTF(u.name + "님이 입장했습니다.");

					}
					
					System.out.println(u.name + "님이 입장했습니다.");
					
					ServerRecvThread rt=new ServerRecvThread();
					rt.user=u;
					rt.start();

				}
			} catch (Exception e) {
				System.out.println("accept 문제 발생");
			}

		}
	}

}

// Data Class ...
class User {
	public String name;
	public Socket socket;

	public User(String name, Socket socket) {
		super();
		this.name = name;
		this.socket = socket;
	}
}

class DataModel {
	// 데이터를 담을 arraylist를 생성해서 static으로 사용 -> 여러개를 연결하기 귀찮아서 전역적으로 쓰기위해 static으로 선언
	public static ArrayList<User> list = new ArrayList<User>();

}

class ServerRecvThread extends Thread {
	// 접속하자마자 쓰레드 실행되도록 하는 것
	public User user; // 최상위 객체 받아오자

	public void run() {
		try {
			// 계속 받아야할 이유 없으니까 와일문 밖에 선언
			DataInputStream dis = new DataInputStream(user.socket.getInputStream());

			while (true) {
				int command = dis.readInt(); // 인트값 먼저 받게 설정 해놨으니까

				if (command == 2) {
					String message = dis.readUTF();
					// 대화내용- 전체에 브로드캐스팅 해줘야함
					for (User u : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(u.socket.getOutputStream());

						dos.writeUTF(user.name + "님: " + message);

					}
					System.out.println(user.name + "님: " + message);

				} else if (command == 3) {

					DataModel.list.remove(user);// 유저 삭제하고

					for (User u : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(u.socket.getOutputStream());

						dos.writeUTF(user.name + "님이 퇴장하였습니다.");
						System.out.println(user.name + "님이 퇴장하였습니다.");
						break;
					}

				}

			}

		} catch (Exception e) {
			// 리스트에서 제거
			DataModel.list.remove(user);
			System.out.println(user.name+"강제접속종료...");
			
		}finally {
			try {
				user.socket.close();	
			}catch(Exception e) {
				System.out.println("????");
			}
			
		}
	}
}
