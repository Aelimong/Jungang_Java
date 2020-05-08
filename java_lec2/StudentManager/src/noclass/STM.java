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
	static int stCount = 0; //등록된 숫자
	
	public static void save() {
		File file = new File("C:\\test\\stm.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			
			//헤더...? 시그니처 느낌
			dos.writeByte('S');
			dos.writeByte('T');
			dos.writeByte('M'); 
			
			//메타데이터(순수한 데이터가 아니라... 순수한 데이터를 어떻게 읽어내야할지 알려주는 추가적인 데이터)
			dos.writeInt(stCount);
			
			//데이터 입력...순서가 중요!!!
			
			for(int i=0; i<stCount; i++) {
				dos.writeUTF(stList[i].name);
				dos.writeInt(stList[i].age);
				dos.writeInt(stList[i].score);
			}
			
			
//			
//			for(STData data : stList) {
//				dos.writeUTF(data.name);
//				dos.writeInt(data.age);
//				dos.writeInt(data.score); //0~100사이의 값만 나오기 때문에 굳이 인트로 안 넣어도 괜찮다
//			}
//			
			dos.close(); //원래는 파이널리에 넣어줘야하는데 .. 
			             //close 메소드도 트라이캐치 예외처리 해줘야해서 일단 약식으로...
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void load() {
		File file = new File("C:\\test\\stm.dat");
		
		//이 프로그램을 맨~~~처음 실행했을 때(어떠한 데이터도 없을 경우) 오류를 잡기 위한 것
		if(!(file.exists())) {
			System.out.println("읽을 파일이 없습니다.");
			return;
		}
		
		try {
			FileInputStream fis =  new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			//읽기 로직....
			int sign1= dis.readByte();
			int sign2= dis.readByte();
			int sign3= dis.readByte();

			if(!(sign1 =='S' && sign2=='T' && sign3=='M')) {
				System.out.println("잘못된 파일입니다.(시그니쳐오류)"); 
				return;
			}
			
			//메타데이터 읽기
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
		//데이터는 처음부터 끝까지 소멸되면 안 되기 때문에 메인함수 맨 위에서 생성
		
		load();
		
		Scanner scn = new Scanner(System.in); // static in: 참조변수

		System.out.println("***학생관리 프로그램에 오신 걸 환영합니다***");

		while (true) {
			System.out.println("====메뉴====");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 리스트 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 점수 수정");
			System.out.print("입력 (q=종료)>");
			String inputValue = scn.nextLine();
 
			if (inputValue.equals("q") || inputValue.equals("Q")) {
				break;
			}
			
			
			if(inputValue.equals("1")) {
				//학생 정보 입력 코드
				System.out.println("======학생 정보 입력 시작======");
				
				System.out.println("학생 이름을 입력해주세요");
				System.out.print("입력>");
				String name = scn.nextLine();
				
				System.out.println("나이를 입력해주세요");
				System.out.print("입력>");
				String temp = scn.nextLine();
				
				int age=0; //age를 try문 안에서 변수를 생성하면 다른 곳에서 사용못함
				try {
					age = Integer.parseInt(temp);	
				}catch(Exception e) {
					System.out.println("숫자가 아닌 값을 입력했습니다. ERROR CODE = 100011");
				} finally {
				
				}
					
				
				
				System.out.println("점수를 입력해주세요");
				System.out.print("입력>");
				int score = Integer.parseInt(scn.nextLine());
		
				
				STData stData = new STData(name, age, score);
				
				stList[stCount]=stData;
				stCount++;
				
				System.out.println("======학생 정보 입력 끝======");
				System.out.println("계속 하시려면 Enter를 눌러주세요");
				scn.nextLine();
				
			}else if(inputValue.equals("2")) {
				System.out.println("======학생 리스트 시작======");
				
				for(int i=0; i<stCount; i++) {
					System.out.println(stList[i].name);
				
				}
				
				System.out.println("======학생 리스트 끝======");
				System.out.println("계속 하시려면 Enter를 눌러주세요");
				scn.nextLine();
				
			}else if(inputValue.equals("3")) {
				//학생 정보 검색
				System.out.println("======검색 시작======");
				System.out.println("검색할 학생의 이름을 입력해주세요");
				System.out.print("입력>");
				String searchingName = scn.nextLine();
				
				int searchingCount=0;
				for(int i=0; i<stCount; i++) {
					if((stList[i].name).contains(searchingName)){
			
						String print="";
						print +="이름: ";
						print +=stList[i].name;
						print +=", 나이: ";
						print +=stList[i].age;
						print +=", 점수: ";
						print +=stList[i].score;
						System.out.println(print);
						
						searchingCount++;
						
					}
				} 
				
				System.out.println(searchingCount+"명이 검색되었습니다");			
				System.out.println("======검색 끝======");
				System.out.println("계속 하시려면 Enter를 눌러주세요");
				scn.nextLine();
				
			}else if(inputValue.equals("4")) {
				//학생 정보 삭제
				System.out.println("======학생 삭제 시작======");
				System.out.println("삭제할 학생의 이름을 입력해주세요");
				System.out.print("입력>");
				String deletingName=scn.nextLine();
				int count=0;
				for(int i=0; i<stCount; i++) {
					
					if(stList[i].name.equals(deletingName)) {
						for(int x=i; x<stCount; x++) {
							stList[x]=stList[x+1];
						}	
						i--; //stList[x]값 에 새로 들어온 이름이 동일 이름일 수도 있어서 검사차원에서 한번더!
						stCount--;
				
						count++;
					}
					
				}System.out.println(count+"명이 삭제되었습니다");
				
				
				System.out.println("======학생 삭제 끝======");
				System.out.println("계속 하시려면 Enter를 눌러주세요");
				scn.nextLine();
			}else if(inputValue.equals("5")) {
				//학생 점수 수정
			}else {
				System.out.println("1부터 5사이의 값을 입력해주세요.");
			}

		}
		save();
		System.out.println("이용해주셔서 감사합니다");
		
		
	}

}
