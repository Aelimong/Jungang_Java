import java.io.*;

public class P3 {

	public static void main(String[] args) {

		File file = new File("C:\\test\\ccc.ccc");
		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream(file);	
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//나머지 로직처리....
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally { //어떤 경우에도 클로즈 해줘야함!!!
			try{
				fos.close(); //클로즈 메소드도 트라이 캐치 해줘야하는 메소드
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
