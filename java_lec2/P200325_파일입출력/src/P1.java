//파일 입출력.... API 활용.....
import java.io.*;
//input,output의 약자
public class P1 {

	public static void main(String[] args) throws Exception {
		int a = 400;
		
		File xxx=new File("C:\\test\\aaa.dat");//이 파일이 뭔지 컨트롤하는 객체
		                                       //디렉토리도 관리함 (폴더명 들어갈 수 있음)
		
		//파일 불러오는 거 담당?(write)-핵심코어
		FileOutputStream  fos = new FileOutputStream(xxx); //()안에 파일명 직접 넣을 수 있고, 
		                                                  //파일클래스로 객체 만들어서 넣을 수도 있다
															//이 메소드는 예외처리를 하도록 만들어짐
		  													//하드웨어쪽에서 에러가 날 수 있어서
		//FileOutputStream_보조API(1)
		BufferedOutputStream bos =
				new BufferedOutputStream(fos);  //버퍼씌우고 씌워진 bos를 아래 필터에 등록!!!
		
		
		//필터 등록 후 사용하겠다FileOutputStream_보조API(2)
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeInt(10); //4바이트를 1바이트 단위로 쪼개서 넣을 것이다
		dos.writeInt(400);
		
		dos.writeByte(5);//바이트 단위로 넣겠다
		dos.writeUTF("AABBaabb");
		//^ 이렇게 한 줄씩 코드를 짜면(버퍼드아웃풋 없이) 하드디스크 미친듯이 긁어냄
		//write할 값들을 램에 모았다가(쌓았다가) 일정 크기가 차면 한 번에 하드에 넣기!!
		
		
		
		/*
		//★★★핵심, int값을 넣으면 1byte단위로 들어감, 1byte 넘어가면 짤려서 들어감 
		//비트연산자
		//a : 00 00 01 90
		fos.write(a>>24); // 3바이트를 오른쪽으로 밀겠다 00 00 00 00(맨 오른쪽 1바이트만 들어감)
		fos.write(a>>16); // 2바이트를 오른쪽으로 밀겠다 00 00 00 00
		fos.write(a>>8); // 1바이트를 오른쪽으로 밀겠다 00 00 00 01
		fos.write(a>>0); // 0바이트를 오른쪽으로 밀겠다 00 00 01 90
		*/
		
		fos.close(); //파일 닫아주기 꼭!!!!!!해줘야함
		
		System.out.println("안녕하세요");
		
		
	}

}
