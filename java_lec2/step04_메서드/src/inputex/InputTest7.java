package inputex;

public class InputTest7 {

	public static void main(String[] args) {
      
		int eno=Integer.parseInt(args[0]); //숫자 대입할 땐 파싱 과정 필요함
		String ename=args[1];
		char dept=args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f\n",eno,ename,dept,score);
		
		
		
		
		
		
	}

}
