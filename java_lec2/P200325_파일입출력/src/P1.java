//���� �����.... API Ȱ��.....
import java.io.*;
//input,output�� ����
public class P1 {

	public static void main(String[] args) throws Exception {
		int a = 400;
		
		File xxx=new File("C:\\test\\aaa.dat");//�� ������ ���� ��Ʈ���ϴ� ��ü
		                                       //���丮�� ������ (������ �� �� ����)
		
		//���� �ҷ����� �� ���?(write)-�ٽ��ھ�
		FileOutputStream  fos = new FileOutputStream(xxx); //()�ȿ� ���ϸ� ���� ���� �� �ְ�, 
		                                                  //����Ŭ������ ��ü ���� ���� ���� �ִ�
															//�� �޼ҵ�� ����ó���� �ϵ��� �������
		  													//�ϵ�����ʿ��� ������ �� �� �־
		//FileOutputStream_����API(1)
		BufferedOutputStream bos =
				new BufferedOutputStream(fos);  //���۾���� ������ bos�� �Ʒ� ���Ϳ� ���!!!
		
		
		//���� ��� �� ����ϰڴ�FileOutputStream_����API(2)
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeInt(10); //4����Ʈ�� 1����Ʈ ������ �ɰ��� ���� ���̴�
		dos.writeInt(400);
		
		dos.writeByte(5);//����Ʈ ������ �ְڴ�
		dos.writeUTF("AABBaabb");
		//^ �̷��� �� �پ� �ڵ带 ¥��(���۵�ƿ�ǲ ����) �ϵ��ũ ��ģ���� �ܾ
		//write�� ������ ���� ��Ҵٰ�(�׾Ҵٰ�) ���� ũ�Ⱑ ���� �� ���� �ϵ忡 �ֱ�!!
		
		
		
		/*
		//�ڡڡ��ٽ�, int���� ������ 1byte������ ��, 1byte �Ѿ�� ©���� �� 
		//��Ʈ������
		//a : 00 00 01 90
		fos.write(a>>24); // 3����Ʈ�� ���������� �аڴ� 00 00 00 00(�� ������ 1����Ʈ�� ��)
		fos.write(a>>16); // 2����Ʈ�� ���������� �аڴ� 00 00 00 00
		fos.write(a>>8); // 1����Ʈ�� ���������� �аڴ� 00 00 00 01
		fos.write(a>>0); // 0����Ʈ�� ���������� �аڴ� 00 00 01 90
		*/
		
		fos.close(); //���� �ݾ��ֱ� ��!!!!!!�������
		
		System.out.println("�ȳ��ϼ���");
		
		
	}

}
