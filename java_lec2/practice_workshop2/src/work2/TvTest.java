package work2;

public class TvTest {

	public static void main(String[] args) {

		Tv[] tv= new Tv[3]; {
		tv[0] =new Tv("INFINIA", 1500000, "LED TV");
		tv[1] =new Tv("XCANVAS", 1000000, "LCD TV");
		tv[2] =new Tv("CINEMA", 2000000, "3D TV");}
		
	
		// 0��° �迭�� �ִ� �� ���� �� ����!!!!!!
		int max = tv[0].getPrice();
		int min = tv[0].getPrice();
        String max_item="", min_item="";
		
		
		for (int i = 0; i < tv.length; i++) {

			System.out.println(tv[i].toString());

		}
		
		for (int i = 0; i < tv.length; i++) {
			
			if (max < tv[i].getPrice()) {
				max = tv[i].getPrice();
				max_item=tv[i].getName();
			}
			
			if (min > tv[i].getPrice()) {
				min = tv[i].getPrice();
				min_item=tv[i].getName();
			}
		}
	
		System.out.println("������ ���� ��� ��ǰ : " + max_item);
		System.out.println("������ ���� ������ ��ǰ : " + min_item);
		
		
		
		
	  }
}

	
