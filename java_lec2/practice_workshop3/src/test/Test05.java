package test;
/*

3개의 주사위를 던졌을 때,눈의 곱이 3의 배수인 값을 출력
---출력값 
1*1*3 = 3
1*1*6 = 6
1*2*3 = 6
1*2*6 = 12
….

 */
public class Test05 {

	public static void main(String[] args) {
     
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for (int k=1; k<=6; k++) {
					if((i*j*k)%3==0)
						System.out.println(i+"*"+j+"*"+k+"="+(i*j*k));
				}
			}
		}
			
		
	}

}
