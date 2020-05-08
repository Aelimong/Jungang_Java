package workshop1;

public class Test04 {

	public static void main(String[] args) {
       char ch='z';
       boolean b=(65<=(int)ch && 90>=(int)ch || 97<=(int)ch && 122>=(int)ch );
		//대문자 65~90  소문자 97~ 122
       
       System.out.println(b);
	}

}
