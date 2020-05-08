package qq.a;
class Call implements CallBackFunc{
	@Override
	public void call() {
		System.out.println("반가워요 B입니다");
	}
}



public class B {

	public static void main(String[] args) {

		Mod m = new Mod();
		Call c= new Call();
		m.testMod(c);
		
		
	}

}
