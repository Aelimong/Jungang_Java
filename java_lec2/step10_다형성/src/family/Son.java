package family;

public class Son extends Family implements Job {
	
	
	public Son() {
		// TODO Auto-generated constructor stub
	}

	
	public Son(String name) {
		super(name);
	}
	
	@Override
	public String work() {
		return "공부";
	}
	
	
	@Override
	public String toString() {
		return  super.toString()+"아들은 "+work()+"를 한다";
	}

}
