import java.io.*;


//��Ʈ�� �������� �����
public class P5 {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\test\\aa.bmp");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeByte('B');
			dos.writeByte('M');
			
			//dos.writeInt(360054); //���� 360054
			//�Ųٷ� �ְڵ�
			dos.writeByte(360054>>0);
			dos.writeByte(360054>>8);
			dos.writeByte(360054>>16);
			dos.writeByte(360054>>24);
			
			dos.writeShort(0);
			dos.writeShort(0);
			//�������
			
			//54�� ��� �Ųٷ� �ְڴ�
			dos.writeByte(54>>0);
			dos.writeByte(54>>8);
			dos.writeByte(54>>16);
			dos.writeByte(54>>24);
			
			//40�� �Ųٷ� �ְڴ�
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
			
			
			
			//���� ������ ...��Ÿ�������ϰ� �� �¾ƾ���..
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
			System.out.println("������ �����Ǿ����ϴ�.");
			
		}catch(Exception e) {
			
		}
		
		
	}

}
