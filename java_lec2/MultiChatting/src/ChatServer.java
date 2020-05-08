import java.util.*;
import java.io.*;
import java.net.*;

/**
 * @author USER accept���ϴ� thread�� ���� ������ ���ѹݺ���Ŵ ������ȣȣȣ�P �ʹ� ������
 */
public class ChatServer {

	public static void main(String[] args) throws Exception {
		System.out.println("����] ���� ���� ..."); // ������ �α�
		ServerSocket ss = new ServerSocket(7755);

		// main�� ��������������. main�� ������� ���
		while (true) {

			try {
				Socket socket = ss.accept();
				// ���ο� �����ϴ� ����ŭ ������ ������.
				// ������ ���ڸ��� writeUTF�Ѵٴ� �����Ͽ� �ۼ�
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				int command = dis.readInt();

				if (command == 1) {
					// �г��� ����
					String nick = dis.readUTF();
					User u = new User(nick, socket);
					DataModel.list.add(u);
					// thread�� �ѻ���� �ϳ��� ������

					// greeting

					for (User user : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(user.socket.getOutputStream());

						dos.writeUTF(u.name + "���� �����߽��ϴ�.");

					}
					
					System.out.println(u.name + "���� �����߽��ϴ�.");
					
					ServerRecvThread rt=new ServerRecvThread();
					rt.user=u;
					rt.start();

				}
			} catch (Exception e) {
				System.out.println("accept ���� �߻�");
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
	// �����͸� ���� arraylist�� �����ؼ� static���� ��� -> �������� �����ϱ� �����Ƽ� ���������� �������� static���� ����
	public static ArrayList<User> list = new ArrayList<User>();

}

class ServerRecvThread extends Thread {
	// �������ڸ��� ������ ����ǵ��� �ϴ� ��
	public User user; // �ֻ��� ��ü �޾ƿ���

	public void run() {
		try {
			// ��� �޾ƾ��� ���� �����ϱ� ���Ϲ� �ۿ� ����
			DataInputStream dis = new DataInputStream(user.socket.getInputStream());

			while (true) {
				int command = dis.readInt(); // ��Ʈ�� ���� �ް� ���� �س����ϱ�

				if (command == 2) {
					String message = dis.readUTF();
					// ��ȭ����- ��ü�� ��ε�ĳ���� �������
					for (User u : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(u.socket.getOutputStream());

						dos.writeUTF(user.name + "��: " + message);

					}
					System.out.println(user.name + "��: " + message);

				} else if (command == 3) {

					DataModel.list.remove(user);// ���� �����ϰ�

					for (User u : DataModel.list) {
						DataOutputStream dos = new DataOutputStream(u.socket.getOutputStream());

						dos.writeUTF(user.name + "���� �����Ͽ����ϴ�.");
						System.out.println(user.name + "���� �����Ͽ����ϴ�.");
						break;
					}

				}

			}

		} catch (Exception e) {
			// ����Ʈ���� ����
			DataModel.list.remove(user);
			System.out.println(user.name+"������������...");
			
		}finally {
			try {
				user.socket.close();	
			}catch(Exception e) {
				System.out.println("????");
			}
			
		}
	}
}
