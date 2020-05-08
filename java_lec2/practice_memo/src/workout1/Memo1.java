package workout1;
/*[문제3] 다음 값을 각각 대입하여 출력하시오
(name : 민들래 / kor : 90  / eng : 70 / mat : 75)

[출력화면]
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오
 */

public class Memo1 {

	public static void main(String[] args) {

	String name="민들래";
    double kor=90;
	double eng=70;
	double mat=75;	
	double tot=kor+eng+mat;
	double avg=tot/3;
	 
    System.out.println("이름 : "+name);
    System.out.println("합계점수: "+tot+"점");
    System.out.printf("평균점수: %.1f점", avg);
		
		
	}

}
