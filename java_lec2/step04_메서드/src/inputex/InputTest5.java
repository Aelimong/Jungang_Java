package inputex;

//printf 출력



public class InputTest5 {

	public static void main(String[] args) {

		int eno=101;
		String ename="홍길동";
		char dept='A';
		double score=58.9;
		
		System.out.printf("사원번호 : %d\n", eno);
		System.out.printf("사원이름 : %s\n", ename);
		System.out.printf("부서코드 : %c\n", dept);
		System.out.printf("입사성적 : %.1f점", score);
		                          //부동소수점수 %f (플로팅어쩌고)
	
		
	}

}


