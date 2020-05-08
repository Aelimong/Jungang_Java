import java.io.*;


//비트맵 논리적으로 만들기
public class P5 {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\test\\aa.bmp");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeByte('B');
			dos.writeByte('M');
			
			//dos.writeInt(360054); //원래 360054
			//거꾸로 넣겠따
			dos.writeByte(360054>>0);
			dos.writeByte(360054>>8);
			dos.writeByte(360054>>16);
			dos.writeByte(360054>>24);
			
			dos.writeShort(0);
			dos.writeShort(0);
			//예비공간
			
			//54를 꺾어서 거꾸로 넣겠다
			dos.writeByte(54>>0);
			dos.writeByte(54>>8);
			dos.writeByte(54>>16);
			dos.writeByte(54>>24);
			
			//40을 거꾸로 넣겠다
			dos.writeByte(40>>0);
			dos.writeByte(40>>8);
			dos.writeByte(40>>16);
			dos.writeByte(40>>24);
			
			
			dos.writeByte(400>>0);
			dos.writeByte(400>>8);
			dos.writeByte(400>>16);
			dos.writeByte(400>>24);
			
			dos.writeByte(300>>0);
			dos.writeByte(300>>8);
			dos.writeByte(300>>16);
			dos.writeByte(300>>24);
		
			dos.writeByte(1>>0);
			dos.writeByte(1>>8);
			
			dos.writeByte(24>>0);
			dos.writeByte(24>>8);
			
			
			dos.writeByte(0>>0);
			dos.writeByte(0>>8);
			dos.writeByte(0>>16);
			dos.writeByte(0>>24);
			
			dos.writeByte(360000>>0);
			dos.writeByte(360000>>8);
			dos.writeByte(360000>>16);
			dos.writeByte(360000>>24);
			
			dos.writeInt(0);
			dos.writeInt(0);
			dos.writeInt(0);
			dos.writeInt(0);
			
			
			
			//실제 데이터 ...메타데이터하고 잘 맞아야함..
			for(int x=0; x<400; x++) {
				for(int y=0; y<300; y++) {
					if(x==20) {
						dos.writeByte(255);
						dos.writeByte(0);
						dos.writeByte(0);
					}else {
						dos.writeByte(x);
						dos.writeByte(x);
						dos.writeByte(x);
						
					}
					
				}
			}
			
			
			dos.close();
			System.out.println("파일이 생성되었습니다.");
			
		}catch(Exception e) {
			
		}
		
		
	}

}
