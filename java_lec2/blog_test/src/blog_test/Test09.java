package blog_test;
//1���� 200������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
public class Test09 {

	public static void main(String[] args) {
        int sum=0;
		for(int i=1; i<=200; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}System.out.println(sum);
		
		
		
		
		
	}

}
