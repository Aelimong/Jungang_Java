package com.ja.t1;



class A{
	public int v1;
	public void method1() {
		System.out.println("�ȳ��ϼ���");
	}
	public void method3() {
		System.out.println("A�� �޼ҵ�...");
	}
}


class B extends A{
	public int v2;
	public void method2() {
		System.out.println("�ݰ����ϴ�");
	}
	
	@Override
	public void method3() {
		System.out.println("B�� �޼ҵ�...");
	}
}


public class P1 {

	public static void main(String[] args) {
		//��� - ������ - �������̵� => �������̽�
		B ref = new B();
		A ref1 = new B();
		//��ü�� ����������� ��ü �ȿ� ���� ���� ���ϴ� ����
		//AŬ���������� �ڵ� ����ȯ�� �Ͼ, AŬ������ �������� ���ٰ���
		ref1.v1=10;
		ref1.method3();
		
	}

}
