package qq.a;

interface CallBackFunc{
	public abstract void call();
}


public class Mod {

	public void testMod(CallBackFunc x) {
		System.out.println("���� �����ڵ�");
		System.out.println("���� �����ڵ�");
		
		x.call();
		
		System.out.println("���� �����ڵ�");
		System.out.println("���� �����ڵ�");
	}
}
