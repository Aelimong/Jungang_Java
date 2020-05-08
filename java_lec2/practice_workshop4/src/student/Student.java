package student;

public class Student {

	String name;
	int korean;
	int english;
	int match;
	int science;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int korean, int english, int match, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.match = match;
		this.science = science;
	}
	
	public double getAvg() {
		double avg;
		avg=(korean+english+match+science)/4.0;
		return avg;
	}
	public String getGrade() {
		String grade;
		switch((int)getAvg()/10){
		case 10:
		case 9: grade="A"; break;
		case 8:
		case 7: grade="B"; break;
		case 6:
		case 5: grade="C"; break;
		case 4:
		case 3: grade="D"; break;
		default: grade="F"; }
		
		return grade;
		}

	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMatch() {
		return match;
	}

	public int getScience() {
		return science;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void setMatch(int match) {
		this.match = match;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	
	
}
