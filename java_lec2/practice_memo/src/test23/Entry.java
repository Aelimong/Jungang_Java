package test23;
/*
-word:String
+Entry()                            ==> **  ������ **    ���
+Entry(word:String)
+toString()String               ==> ��� : OOP   ���
*/

public class Entry {
	
	private String word;
	
	public Entry() {
		System.out.println("**  ������   **");
	}

	public Entry(String word) {
		super();
		this.word = word;
	}

	@Override
	public String toString() {
		return "��� : "+ word;
	
	
	

	}

}
