package noclass;
import java.util.*;
import java.io.*;

class STData{
	
	public String name;
	public int age;
	public int score;
	
	public STData(String name, int age, int score) {
		this.name=name;
		this.age=age;
		this.score=score;
		
	}
		
}


public class STM {
	
	static STData[] stList= new STData[100];
	static int stCount = 0; //��ϵ� ����
	
	public static void save() {
		File file = new File("C:\\test\\stm.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			
			//���...? �ñ״�ó ����
			dos.writeByte('S');
			dos.writeByte('T');
			dos.writeByte('M'); 
			
			//��Ÿ������(������ �����Ͱ� �ƴ϶�... ������ �����͸� ��� �о������ �˷��ִ� �߰����� ������)
			dos.writeInt(stCount);
			
			//������ �Է�...������ �߿�!!!
			
			for(int i=0; i<stCount; i++) {
				dos.writeUTF(stList[i].name);
				dos.writeInt(stList[i].age);
				dos.writeInt(stList[i].score);
			}
			
			
//			
//			for(STData data : stList) {
//				dos.writeUTF(data.name);
//				dos.writeInt(data.age);
//				dos.writeInt(data.score); //0~100������ ���� ������ ������ ���� ��Ʈ�� �� �־ ������
//			}
//			
			dos.close(); //������ ���̳θ��� �־�����ϴµ� .. 
			             //close �޼ҵ嵵 Ʈ����ĳġ ����ó�� ������ؼ� �ϴ� �������...
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void load() {
		File file = new File("C:\\test\\stm.dat");
		
		//�� ���α׷��� ��~~~ó�� �������� ��(��� �����͵� ���� ���) ������ ��� ���� ��
		if(!(file.exists())) {
			System.out.println("���� ������ �����ϴ�.");
			return;
		}
		
		try {
			FileInputStream fis =  new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			//�б� ����....
			int sign1= dis.readByte();
			int sign2= dis.readByte();
			int sign3= dis.readByte();

			if(!(sign1 =='S' && sign2=='T' && sign3=='M')) {
				System.out.println("�߸��� �����Դϴ�.(�ñ״��Ŀ���)"); 
				return;
			}
			
			//��Ÿ������ �б�
			int count=dis.readInt();
			
			for(int i=0; i<count; i++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				int score = dis.readInt();
				
				stList[stCount]=new STData(name, age, score);
				stCount++;
				
			}
			
			dis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		//�����ʹ� ó������ ������ �Ҹ�Ǹ� �� �Ǳ� ������ �����Լ� �� ������ ����
		
		load();
		
		Scanner scn = new Scanner(System.in); // static in: ��������

		System.out.println("***�л����� ���α׷��� ���� �� ȯ���մϴ�***");

		while (true) {
			System.out.println("====�޴�====");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ����Ʈ ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.print("�Է� (q=����)>");
			String inputValue = scn.nextLine();
 
			if (inputValue.equals("q") || inputValue.equals("Q")) {
				break;
			}
			
			
			if(inputValue.equals("1")) {
				//�л� ���� �Է� �ڵ�
				System.out.println("======�л� ���� �Է� ����======");
				
				System.out.println("�л� �̸��� �Է����ּ���");
				System.out.print("�Է�>");
				String name = scn.nextLine();
				
				System.out.println("���̸� �Է����ּ���");
				System.out.print("�Է�>");
				String temp = scn.nextLine();
				
				int age=0; //age�� try�� �ȿ��� ������ �����ϸ� �ٸ� ������ ������
				try {
					age = Integer.parseInt(temp);	
				}catch(Exception e) {
					System.out.println("���ڰ� �ƴ� ���� �Է��߽��ϴ�. ERROR CODE = 100011");
				} finally {
				
				}
					
				
				
				System.out.println("������ �Է����ּ���");
				System.out.print("�Է�>");
				int score = Integer.parseInt(scn.nextLine());
		
				
				STData stData = new STData(name, age, score);
				
				stList[stCount]=stData;
				stCount++;
				
				System.out.println("======�л� ���� �Է� ��======");
				System.out.println("��� �Ͻ÷��� Enter�� �����ּ���");
				scn.nextLine();
				
			}else if(inputValue.equals("2")) {
				System.out.println("======�л� ����Ʈ ����======");
				
				for(int i=0; i<stCount; i++) {
					System.out.println(stList[i].name);
				
				}
				
				System.out.println("======�л� ����Ʈ ��======");
				System.out.println("��� �Ͻ÷��� Enter�� �����ּ���");
				scn.nextLine();
				
			}else if(inputValue.equals("3")) {
				//�л� ���� �˻�
				System.out.println("======�˻� ����======");
				System.out.println("�˻��� �л��� �̸��� �Է����ּ���");
				System.out.print("�Է�>");
				String searchingName = scn.nextLine();
				
				int searchingCount=0;
				for(int i=0; i<stCount; i++) {
					if((stList[i].name).contains(searchingName)){
			
						String print="";
						print +="�̸�: ";
						print +=stList[i].name;
						print +=", ����: ";
						print +=stList[i].age;
						print +=", ����: ";
						print +=stList[i].score;
						System.out.println(print);
						
						searchingCount++;
						
					}
				} 
				
				System.out.println(searchingCount+"���� �˻��Ǿ����ϴ�");			
				System.out.println("======�˻� ��======");
				System.out.println("��� �Ͻ÷��� Enter�� �����ּ���");
				scn.nextLine();
				
			}else if(inputValue.equals("4")) {
				//�л� ���� ����
				System.out.println("======�л� ���� ����======");
				System.out.println("������ �л��� �̸��� �Է����ּ���");
				System.out.print("�Է�>");
				String deletingName=scn.nextLine();
				int count=0;
				for(int i=0; i<stCount; i++) {
					
					if(stList[i].name.equals(deletingName)) {
						for(int x=i; x<stCount; x++) {
							stList[x]=stList[x+1];
						}	
						i--; //stList[x]�� �� ���� ���� �̸��� ���� �̸��� ���� �־ �˻��������� �ѹ���!
						stCount--;
				
						count++;
					}
					
				}System.out.println(count+"���� �����Ǿ����ϴ�");
				
				
				System.out.println("======�л� ���� ��======");
				System.out.println("��� �Ͻ÷��� Enter�� �����ּ���");
				scn.nextLine();
			}else if(inputValue.equals("5")) {
				//�л� ���� ����
			}else {
				System.out.println("1���� 5������ ���� �Է����ּ���.");
			}

		}
		save();
		System.out.println("�̿����ּż� �����մϴ�");
		
		
	}

}
