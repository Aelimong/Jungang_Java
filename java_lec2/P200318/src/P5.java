
public class P5 {

	public static void main(String[] args) {
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3=v1; //형태가 다르기 때문에 자동형변환 됨
		v1=(byte)v3; //작은 형에 큰 형을 넣는 건 문법적으로 맞지 않아 강제형변환 필요@@@
		
		double v5 = 3.333;
		int v6 = (int)v5; //강제형변환을 해도 괜찮다는 확신이 있을 때만 해야함(값의 손실이 있을 경우가 있기 때문에)

		System.out.println(v6);
		

	}

}
