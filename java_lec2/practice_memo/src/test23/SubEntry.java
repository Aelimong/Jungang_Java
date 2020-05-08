package test23;
/*
-definition:String
-year:int
+SubEntry()
+SubEntry(definition:String, year:int)
+SubEntry(word:String, definition:String, year:int)
+toString():String           ==> 원어, 시기 출력
 */

public class SubEntry extends Entry {

	private String definition;
	private int year;
	

	public SubEntry() {
		// TODO Auto-generated constructor stub
	}
	
	public SubEntry(String definition, int year) {
		super();
	}

	public SubEntry(String word, String definition, int year ) {
		super(word);
		this.definition=definition;
		this.year=year;
	}

	@Override
	public String toString() {
		return super.toString()+"\n원어 : "+definition
			  +"\n시기 : "+year;
	}

	
	
	
	

}
