package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception  소스코드에서 확인이 가능함
public class ExceptionEx3 {
   String str;
  public ExceptionEx3() {
	   input();
   }
  public void input() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("문자열을 입력하세요 : ");
	 
	try {
		str=br.readLine();
	} catch (IOException e) {
		System.out.println();
		e.printStackTrace();
	}  //여기서 확인 가능하고 예외처리 할 수 있음, 에러코드 항상 확인해야함@!
	   
	}
	
   public void output() {
		System.out.println("결과 : "+str);
	}
	

	public static void main(String[] args) {
		ExceptionEx3 ob=new ExceptionEx3();
		ob.output();
		
		
		
	}

}
