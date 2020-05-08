package com.ja.t2;

abstract class Unit{  
	//앱스트랙트  클래스는 객체를 생성할 수 없다. new Unit(); 불가능 
	//                                new Unit[n]; 이건 가능
	//상속을 위한 클래스
	
	public int hp;
	public int speed;
	public int ap;
	
	public abstract void move();
	//선언만 하되 구현하면 안 됨
	//오버라이딩용
	
	public void stop() {
		System.out.println("유닛이 멈춥니다.");
	}
	public void attack() {
		System.out.println("유닛이 "+ap+"로 공격합니다.");
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
		System.out.println("SCV가 "+speed+"로 움직입니다");
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
		System.out.println("마린이 "+speed+"로 움직입니다");
	}
	
	public void useSteamPack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
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
		System.out.println("탱크가 "+speed+"으로 움직입니다");
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
		
		//이동명령
		for(int i=0; i<arr.length; i++) {
			arr[i].move();
		}
		
		//멈춘다..
		for(int i=0; i<arr.length; i++) {
			arr[i].stop();
		}
		
		//스팀팩 사용
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Marine) { //arr배열중에 Marine을 클래스형로 가진 애들이 조건으로 들어가야함
				Marine m=(Marine)arr[i]; //상속관계인 경우 강제형변환 가능(Unit을 마린에 넣으려는 경우)
				m.useSteamPack();
			}
			
	
		}
			
	}

}
