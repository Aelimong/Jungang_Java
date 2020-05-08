package com.ja.t2;

abstract class Unit{  
	//�۽�Ʈ��Ʈ  Ŭ������ ��ü�� ������ �� ����. new Unit(); �Ұ��� 
	//                                new Unit[n]; �̰� ����
	//����� ���� Ŭ����
	
	public int hp;
	public int speed;
	public int ap;
	
	public abstract void move();
	//���� �ϵ� �����ϸ� �� ��
	//�������̵���
	
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	public void attack() {
		System.out.println("������ "+ap+"�� �����մϴ�.");
	}
}


class SCV extends Unit {

	public SCV() {
		this.hp=40;
		this.speed=3;
		this.ap=5;
	}
	
	@Override
	public void move() {
		System.out.println("SCV�� "+speed+"�� �����Դϴ�");
	}
	

}

class Marine extends Unit {
	public Marine() {
		this.hp=40;
		this.speed=4;
		this.ap=10;
	}
	
	@Override
	public void move() {
		System.out.println("������ "+speed+"�� �����Դϴ�");
	}
	
	public void useSteamPack() {
		System.out.println("������ �������� ����մϴ�.");
		hp -= 10;
		ap += 20;
		speed += 30;
	}
	
}

class Tank extends Unit {
	public Tank() {
		this.hp=200;
		this.speed=10;
		this.ap=20;
	}
	
	@Override
	public void move() {
		System.out.println("��ũ�� "+speed+"���� �����Դϴ�");
	}
	
}



public class P1 {

	public static void main(String[] args) {
		Unit[] arr= new Unit[10];
		
		arr[0]=new Tank();
		arr[1]=new Tank();
		arr[2]=new Tank();
		
		arr[3]=new Marine();
		arr[4]=new Marine();
		arr[5]=new Marine();
		
		arr[6]=new SCV();
		arr[7]=new SCV();
		arr[8]=new SCV();
		arr[9]=new SCV();
		
		//�̵����
		for(int i=0; i<arr.length; i++) {
			arr[i].move();
		}
		
		//�����..
		for(int i=0; i<arr.length; i++) {
			arr[i].stop();
		}
		
		//������ ���
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Marine) { //arr�迭�߿� Marine�� Ŭ�������� ���� �ֵ��� �������� ������
				Marine m=(Marine)arr[i]; //��Ӱ����� ��� ��������ȯ ����(Unit�� ������ �������� ���)
				m.useSteamPack();
			}
			
	
		}
			
	}

}
