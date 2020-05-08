package test2;


class Calc{

	public void calculate(int n) {
		System.out.print("Â¦¼ö: ");
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2==0){
			    sum+=i;
			 System.out.print(i+" ");
			}
		}
		 System.out.println("\n"+"°á°ú: "+sum);
	   }	
}

public class Test02 {

	public static void main(String[] args) {
       Calc cc=new Calc();
       
       int n=Integer.parseInt(args[0]);
	   cc.calculate(n);
	   
	}

}
