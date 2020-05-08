
public class P6 {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 10;
		
		byte result = (byte)(v1 + v2); 
		//바이트 더하기 바이트는 인트형으로 변환됨
		//바이트 변수에 대입하고자 할 땐 강제형변환 필요
		//byte, short인 경우 연산할 때 무조건 int형으로 변환해서 사용하므로 
		//될 수 있으면 처음부터 int형 선언하는 게 좋음
		
		
		int v3 = 10;
		int v4 = 20;
		int v5 = v3+v4;
		

	}

}
