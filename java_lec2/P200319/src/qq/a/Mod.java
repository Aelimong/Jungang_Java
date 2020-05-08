package qq.a;

interface CallBackFunc{
	public abstract void call();
}


public class Mod {

	public void testMod(CallBackFunc x) {
		System.out.println("무언가 실행코드");
		System.out.println("무언가 실행코드");
		
		x.call();
		
		System.out.println("무언가 실행코드");
		System.out.println("무언가 실행코드");
	}
}
