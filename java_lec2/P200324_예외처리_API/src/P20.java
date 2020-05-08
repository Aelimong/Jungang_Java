
public class P20 {

	public static void main(String[] args) {

		int a = Integer.parseInt("100");
		String str = "FFD177";
		
		System.out.println(a);
	
		int a1= Integer.parseInt(str, 16);
		System.out.println(a1);
		
		int v1=10000;
		String bin = Integer.toBinaryString(v1);
		System.out.println(bin);
	}

}
