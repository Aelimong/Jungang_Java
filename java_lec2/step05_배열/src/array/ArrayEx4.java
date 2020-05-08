package array;

public class ArrayEx4 {

	public static void main(String[] args) {

		int [] num= new int[3];                //?????3번째방까지?????
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
		
		//최대값 최소값 
		
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			//0번째 방은 자기 자신이라 비교할 필요없으니 1번째 방부터 시작
		if(num[i] > max )    max=num[i];
		if(num[i] < min )    min=num[i];
		
	}
                System.out.println("최대값 : "+max);
                System.out.println("최소값 : "+min);
		
		
		
		
		
		
}
}

