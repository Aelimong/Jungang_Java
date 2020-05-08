package workout1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제13] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[입력화면/출력화면]

원하는 month을 입력하시오 : 3
3월은 31일입니다.
*/


public class Memo3_q13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
		int mon;
		
		System.out.print("원하는 month를 입력하시오 : ");
      	mon=Integer.parseInt(br.readLine());
     
        System.out.println(mon+"월은 "+month[0]+"일입니다");

		
	}

}
