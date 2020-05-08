package workout1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [문제9] for문을 이용하여 제곱값을 구하시오

x의 값을 입력하시오 : 3
y의 값을 입력하시오 : 3
3의 3승은 27
 */

public class Memo2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
		int X, x, y;
		System.out.print("x의 값을 입력하시오 : ");
        X=x=Integer.parseInt(br.readLine());
		
		System.out.print("y의 값을 입력하시오 : ");
	    y=Integer.parseInt(br.readLine());

	   
	   for(int i=1; i<y; i++) {
		   
		   x*=X; //x=x*x1
		  
	//	   자기 자신에게 누적하는것!!	  	   
		  
	   }
	   
	   System.out.println(X+"의 "+y+"승은 "+x);
	   
	   
		}
		
		
		
		
/*[문제8]
		
		double mid;
		double fina;
		double report;
	    double atten;
	    
		System.out.print("중간고사를 입력하시오 : ");
        mid=Double.parseDouble(br.readLine()); 
        
		System.out.print("기말고사를 입력하시오 : ");
		fina=Double.parseDouble(br.readLine());
        
		System.out.print("과제를 입력하시오 : ");
		report=Double.parseDouble(br.readLine());
        
		System.out.print("출석점수를 입력하시오 : ");
		atten=Double.parseDouble(br.readLine());
		
		double exam=((mid+fina)/2)*0.6; 
		double rep=report*0.2;
		double att=atten*0.2;
		double rs=exam+rep+att;
		char gr;
		
		if(rs>=90) {
			gr='A';
		} else if(rs>=80) {
			gr='B';
		} else if(rs>=70) {
			gr='C';
		} else if(rs>=60) {
			gr='D';
		} else gr='F';
		
		String test="";
		
		switch(gr) {
		case 'A': 
		case 'B': test="excellent"; break;
		case 'C': 
		case 'D': test="good"; break;
		case 'E':
		case 'F': test="poor"; break;
		}
		
		System.out.printf("성적= %.2f\n", exam);
		System.out.println("학점="+gr);
		System.out.println("평가="+test);
		
		 */
		
		
/* [문제7]
		
		double x;
		double y;
		System.out.print("x값을 입력하시오 : ");
	    x=Double.parseDouble(br.readLine());
	   
	    System.out.print("y값을 입력하시오 : ");
	    y=Double.parseDouble(br.readLine());
	    
	    char four;
	    System.out.print("연산자를 입력(+,-,*,/): ");
		four=br.readLine().charAt(0);
		
	
		if(four == '+') {
			System.out.print(x+"+"+y+"="+(x+y));
		} else if(four == '-') {
			System.out.print(x+"-"+y+"="+(x-y));
		} else if(four == '*') {
			System.out.print(x+"*"+y+"="+x*y);
		} else if(four == '/') {
			System.out.print(x+"/"+y+"="+(x/y));
		} else System.out.print("연산자error");
		

/*[문제6]
 

		String name;
		char gender;
		int age;
		double tall;
		
		
		System.out.print("Input name: ");
        name=br.readLine();
        System.out.print("Input gender : ");
        gender=br.readLine().charAt(0);
        System.out.print("Input age : ");
        age=Integer.parseInt(br.readLine());
        System.out.print("Input tall : ");
        tall=Double.parseDouble(br.readLine());
      
        
        System.out.println("이름 : "+name); 	
        
        char gender1;
        if(gender == 'M') gender1='남';
        else gender1='여';
        System.out.println("성별 : "+gender1+"자");
        
        System.out.println("나이 : "+age+"세");
        System.out.println("신장: "+tall+"cm"); 	
       
*/
		
		
		
/* [문제5] 
		
		double down, hei;
		
		System.out.println("****삼각형의 넓이 구하기****");
		System.out.print("밑변 : ");
		down=Double.parseDouble(br.readLine());
		
		System.out.print("높이 : ");
		hei=Double.parseDouble(br.readLine());
	
		double area;
		area=(down*hei)/2;
				
		System.out.printf("넓이 : %.2f", area);
*/

	
}

