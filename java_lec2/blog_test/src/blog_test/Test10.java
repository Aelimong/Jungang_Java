package blog_test;
/*
for ���� �̿��ؼ� 
1���� 1000������ ���� ���ϴ� �ڵ带 �ۼ��ϵ�
3�� ����� ���ϴ� �ڵ带 �ۼ�����

 */
public class Test10 {

	public static void main(String[] args) {
        int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}System.out.println(sum);
		
		
		
	}

}
