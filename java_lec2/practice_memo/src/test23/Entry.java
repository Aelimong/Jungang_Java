package test23;
/*
-word:String
+Entry()                            ==> **  약어사전 **    출력
+Entry(word:String)
+toString()String               ==> 약어 : OOP   출력
*/

public class Entry {
	
	private String word;
	
	public Entry() {
		System.out.println("**  약어사전   **");
	}

	public Entry(String word) {
		super();
		this.word = word;
	}

	@Override
	public String toString() {
		return "약어 : "+ word;
	
	
	

	}

}
