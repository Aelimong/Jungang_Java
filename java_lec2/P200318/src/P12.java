/*
 * Ŭ���� �ȿ� �� ������ 3����
 * 1. �Ӽ�(������ ó���Ǿ� ����)
 * 2. �ʱ�ȭ�� ������
 * 3. �޼ҵ�
 * 
 */

class Car{
	//�Ӽ�(������ �� ����)-Ŭ������ �뵵�� ���� ��Ȯ�� �������ֱ�!
	int currentSpeed; //�Ķ����� �������
	String name;
	
	//������(new���� �� �� �ѹ� �ڵ����� ȣ��Ǵ� �޼ҵ�),�ʱ�ȭ�� �ڵ���� �ִ´�
	Car(int currentSpeed, String name){
		this.currentSpeed = currentSpeed; //������ ��������
	 	//this. �޸��� �ּҰ� (�����Ű�� ��ü��)
		this.name = name;
	}
	
	Car(int speed){ //�Ȱ��� �̸��� �޼ҵ��ε� �Ű������� ���°� �޶����
		this.currentSpeed =speed;
	}
	
	
	//�޼ҵ� (Ŭ������ �޼ҵ�� �ڱ��� �Ӽ��� ���� ������ ������ �־���Ѵ�,��ü�� ����)
	//     (����Ÿ���� �������־�� �Ѵ�)
	void run() {
		System.out.println(name+" �� �޸��ϴ�");
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
		//c1.name="�ƹ���";
		//c1.speed=100;
		
		Car c1=new Car(100,"�ƹ���");  
		
		
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
