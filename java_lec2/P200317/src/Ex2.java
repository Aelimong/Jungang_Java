
public class Ex2 {

	public static void main(String[] args) {
		//2~100������ �Ҽ��� ���غ���
		//�������׳׽��� ü��
		long time=System.currentTimeMillis();
		
		int[] arrValue= new int[99999];
		
		for(int i=0; i<99999; i++) {
			arrValue[i] = i+2;
		}
		
		//�˰���
		for(int i=0; i< 99999; i++) {
			 if(arrValue[i] != -1) {
				System.out.println(arrValue[i]+"�� �Ҽ��Դϴ�");
			}
				
				for(int x= i+1; x<99; x++) {
					if(arrValue[x]%arrValue[1]==0) {
						arrValue[x]=-1;
					}
				}
				
			}
		
		
		time = System.currentTimeMillis()-time;
		System.out.println("����ð�"+time);
		
		
		
		
	}

}
