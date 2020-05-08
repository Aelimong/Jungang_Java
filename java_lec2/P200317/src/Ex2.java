
public class Ex2 {

	public static void main(String[] args) {
		//2~100사이의 소수를 구해보자
		//에라스토테네스의 체법
		long time=System.currentTimeMillis();
		
		int[] arrValue= new int[99999];
		
		for(int i=0; i<99999; i++) {
			arrValue[i] = i+2;
		}
		
		//알고리즘
		for(int i=0; i< 99999; i++) {
			 if(arrValue[i] != -1) {
				System.out.println(arrValue[i]+"는 소수입니다");
			}
				
				for(int x= i+1; x<99; x++) {
					if(arrValue[x]%arrValue[1]==0) {
						arrValue[x]=-1;
					}
				}
				
			}
		
		
		time = System.currentTimeMillis()-time;
		System.out.println("경과시간"+time);
		
		
		
		
	}

}
