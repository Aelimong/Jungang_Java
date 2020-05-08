package inputex;
//BufferedReader, InputStreamReader 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  //자바 io 클래스들 이용하여 데이터 주고받을 수 있음?
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		//객체단위로 움직임, 객체는 사용자 정의
		BufferedReader br=new BufferedReader(isr);
		
		int eno;
		String ename;
		char dept;
		double score;
		
		
		System.out.print("사원번호를 입력하세요 : ");
		eno=Integer.parseInt(br.readLine());
		
		System.out.print("사원이름을 입력하세요 : ");
		ename=br.readLine();
		
		System.out.print("부서코드를 입력하세요 : ");
		dept=br.readLine().charAt(0);
		
		System.out.print("입사점수 입력하세요 : ");
		score=Double.parseDouble(br.readLine());
				
		
		System.out.println("사원번호 : "+ eno);
		System.out.println("사원이름 : "+ ename);
		System.out.println("부서코드 : "+ dept);
		System.out.printf("입사성적 : %.1f점\n", score);
		
		
		
	}

}
