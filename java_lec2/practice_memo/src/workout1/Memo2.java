package workout1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [����9] for���� �̿��Ͽ� �������� ���Ͻÿ�

x�� ���� �Է��Ͻÿ� : 3
y�� ���� �Է��Ͻÿ� : 3
3�� 3���� 27
 */

public class Memo2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
		int X, x, y;
		System.out.print("x�� ���� �Է��Ͻÿ� : ");
        X=x=Integer.parseInt(br.readLine());
		
		System.out.print("y�� ���� �Է��Ͻÿ� : ");
	    y=Integer.parseInt(br.readLine());

	   
	   for(int i=1; i<y; i++) {
		   
		   x*=X; //x=x*x1
		  
	//	   �ڱ� �ڽſ��� �����ϴ°�!!	  	   
		  
	   }
	   
	   System.out.println(X+"�� "+y+"���� "+x);
	   
	   
		}
		
		
		
		
/*[����8]
		
		double mid;
		double fina;
		double report;
	    double atten;
	    
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
        mid=Double.parseDouble(br.readLine()); 
        
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		fina=Double.parseDouble(br.readLine());
        
		System.out.print("������ �Է��Ͻÿ� : ");
		report=Double.parseDouble(br.readLine());
        
		System.out.print("�⼮������ �Է��Ͻÿ� : ");
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
		
		System.out.printf("����= %.2f\n", exam);
		System.out.println("����="+gr);
		System.out.println("��="+test);
		
		 */
		
		
/* [����7]
		
		double x;
		double y;
		System.out.print("x���� �Է��Ͻÿ� : ");
	    x=Double.parseDouble(br.readLine());
	   
	    System.out.print("y���� �Է��Ͻÿ� : ");
	    y=Double.parseDouble(br.readLine());
	    
	    char four;
	    System.out.print("�����ڸ� �Է�(+,-,*,/): ");
		four=br.readLine().charAt(0);
		
	
		if(four == '+') {
			System.out.print(x+"+"+y+"="+(x+y));
		} else if(four == '-') {
			System.out.print(x+"-"+y+"="+(x-y));
		} else if(four == '*') {
			System.out.print(x+"*"+y+"="+x*y);
		} else if(four == '/') {
			System.out.print(x+"/"+y+"="+(x/y));
		} else System.out.print("������error");
		

/*[����6]
 

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
      
        
        System.out.println("�̸� : "+name); 	
        
        char gender1;
        if(gender == 'M') gender1='��';
        else gender1='��';
        System.out.println("���� : "+gender1+"��");
        
        System.out.println("���� : "+age+"��");
        System.out.println("����: "+tall+"cm"); 	
       
*/
		
		
		
/* [����5] 
		
		double down, hei;
		
		System.out.println("****�ﰢ���� ���� ���ϱ�****");
		System.out.print("�غ� : ");
		down=Double.parseDouble(br.readLine());
		
		System.out.print("���� : ");
		hei=Double.parseDouble(br.readLine());
	
		double area;
		area=(down*hei)/2;
				
		System.out.printf("���� : %.2f", area);
*/

	
}

