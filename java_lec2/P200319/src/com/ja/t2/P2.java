package com.ja.t2;

interface Xxx{ //�������̵�, ��ӿ�, ǥ���� �����Ѵ�@!!
	
	public abstract void method(); 
	//�������̽����� ������  public!!&'abstract �޼ҵ常' ��������
	//�׷��� �۽�Ʈ��Ʈ ���ֵ� �۽�Ʈ��Ʈ�� ������

}

class AA implements Xxx{
	
	public void method() {
		System.out.println("�ȳ��ϼ���");
	}; 
	
}

public class P2 {

	public static void main(String[] args) {
		Xxx ref=new AA();
		ref.method();
		
	}

}
