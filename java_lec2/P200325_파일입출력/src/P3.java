import java.io.*;

public class P3 {

	public static void main(String[] args) {

		File file = new File("C:\\test\\ccc.ccc");
		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream(file);	
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//������ ����ó��....
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally { //� ��쿡�� Ŭ���� �������!!!
			try{
				fos.close(); //Ŭ���� �޼ҵ嵵 Ʈ���� ĳġ ������ϴ� �޼ҵ�
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
