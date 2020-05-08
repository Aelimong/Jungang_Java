import java.io.*;
//읽기 로직......출력하겠다!!!!!!!!!!!!!!!!!!
public class P4 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("C:\\test\\aaa.dat");
		FileInputStream fis= new FileInputStream(file);
		BufferedInputStream bis= new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		//읽기 로직....★★넣는 규격과 뽑는 규격이 완~~~~전히 같아야함
		int a = dis.readInt();
		int b = dis.readInt();
		int c = dis.readByte(); //바이트가 들어와도 int로 받음
		String d = dis.readUTF();
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
		dis.close();
		
		
	}

}
