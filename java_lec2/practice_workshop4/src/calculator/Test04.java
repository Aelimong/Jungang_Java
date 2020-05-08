package calculator;


class Calc{
	public int calcSum(int a, int b, int c, int d) {
		int sum=0;
		sum=a+b+c+d;
		return sum;	
	}
}

public class Test04 {

	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0;
		
		for(int i=0; i<args.length; i++) {
			if(Integer.parseInt(args[i])>0 && Integer.parseInt(args[i])<=100) {
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				c=Integer.parseInt(args[2]);
				d=Integer.parseInt(args[3]);
			}else {
				System.out.println("입력범위를 초과하였습니다.");
				break;
			}
		}
		
	Calc ca=new Calc();
	System.out.println("Sum="+ca.calcSum(a, b, c, d));
	
	double avg;
	avg=ca.calcSum(a, b, c, d)/4.0;
	System.out.println("Avg:"+avg);
	
	char score;
	switch((int)avg/10) {
	case 10: 
	case 9: score='A'; break;
	case 8: 
	case 7: score='B'; break;
	case 6:
	case 5: score='C'; break;
	case 4:
	case 3:	score='D'; break;
	default: score='F'; break;} 
		System.out.println(score+"학점");
	
		
	}
	
	}


