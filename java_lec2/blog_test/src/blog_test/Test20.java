package blog_test;
/*
20.
�ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ����� ���� ������� ȭ�鿡 ����غ���.
1���� �����ϸ� 99������ �Ѵ�. 
���� ��� ��) 
3 �ڼ��ѹ�
6 �ڼ� �ѹ�
9 �ڼ� �ѹ� 
.
33 �ڼ� �ι�
.
98 �ڼ� �ѹ�
99 �ڼ� �ι�
 */
public class Test20 {

	public static void main(String[] args) {
		

		  for (int i = 3; i < 100; i++) {
	            int unit = i % 10;
	            int ten = i / 10;
	            if (i < 10) {
	                if (i % 3 == 0)
	                    System.out.println(i + " �ڼ� �ѹ�");
	            } else {
	                if ((ten % 3 == 0) && (i % 10 == 0))         // 30, 60, 90
	                    System.out.println(i + " �ڼ� �ѹ�");
	                else if ((unit % 3 == 0) && (ten % 3 == 0))  // �����ڸ�, �����ڸ� �Ѵ� 3�� ���
	                    System.out.println(i + " �ڼ� �ι�");
	                else if ((unit % 3 == 0) || (ten % 3 == 0))   // 3�� ����� �� ��?????
	                if (i % 10 != 0)        // 10�� �ڸ� �Ÿ���????????????
	                        System.out.println(i + " �ڼ� �ѹ�");
	            }

	        }
	
		  
		
		
   /*
		int n1, n2=0;
		for(int i=1; i<100; i++) {
			n1=i/10;
			n2=i%10;
			
			if(n1%3==0 || n2%3==0) {
		    System.out.println(i+"�ڼ� �ѹ�");
		    } else if(n1%3==0 && n2%3==0) {
		    } System.out.println(i+"�ڼ� �ι�");
		    
		}
		
	*/
	}
		
}
