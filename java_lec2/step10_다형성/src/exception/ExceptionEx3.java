package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception  �ҽ��ڵ忡�� Ȯ���� ������
public class ExceptionEx3 {
   String str;
  public ExceptionEx3() {
	   input();
   }
  public void input() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("���ڿ��� �Է��ϼ��� : ");
	 
	try {
		str=br.readLine();
	} catch (IOException e) {
		System.out.println();
		e.printStackTrace();
	}  //���⼭ Ȯ�� �����ϰ� ����ó�� �� �� ����, �����ڵ� �׻� Ȯ���ؾ���@!
	   
	}
	
   public void output() {
		System.out.println("��� : "+str);
	}
	

	public static void main(String[] args) {
		ExceptionEx3 ob=new ExceptionEx3();
		ob.output();
		
		
		
	}

}
