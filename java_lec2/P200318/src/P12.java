/*
 * 클래스 안에 꼭 들어가야할 3가지
 * 1. 속성(변수로 처리되어 있음)
 * 2. 초기화할 생성자
 * 3. 메소드
 * 
 */

class Car{
	//속성(보통은 맨 위에)-클래스의 용도에 따라 정확히 선언해주기!
	int currentSpeed; //파란색은 멤버변수
	String name;
	
	//생성자(new했을 때 딱 한번 자동으로 호출되는 메소드),초기화할 코드들을 넣는다
	Car(int currentSpeed, String name){
		this.currentSpeed = currentSpeed; //갈색은 지역변수
	 	//this. 메모리의 주소값 (실행시키는 주체의)
		this.name = name;
	}
	
	Car(int speed){ //똑같은 이름의 메소드인데 매개변수와 형태가 달라야함
		this.currentSpeed =speed;
	}
	
	
	//메소드 (클래스의 메소드는 자기의 속성과 아주 밀접한 관련이 있어야한다,객체의 행위)
	//     (리턴타입이 정해져있어야 한다)
	void run() {
		System.out.println(name+" 가 달립니다");
	}
	

	void speedUp(String value) {
		
	}
	
	void speedUp(int value) {
		this.currentSpeed+=value;
	}
	
	int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
}


public class P12 {

	public static void main(String[] args) {
		//Car c1=new Car();
		//c1.name="아반테";
		//c1.speed=100;
		
		Car c1=new Car(100,"아반테");  
		
		
		c1.speedUp(30);
		c1.run();
		int currentSpeed=c1.getCurrentSpeed();
		System.out.println(currentSpeed);
		
		Car c2=new Car(1);
		Car c3=new Car(1,"adaw");
		//Car c4=new Car(1,"adaw",3);
		c3.speedUp(1);
		c3.speedUp("1");
		
		
		
		
		
		
	}

}
