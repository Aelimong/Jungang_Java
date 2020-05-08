package com.elite.test04;

class Calc {

	public double getSum(int data) {
		double sum = 0;
		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		return sum;
	}

}

class InvaildException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvaildException() {
		super();
		System.out.println("입력 값에 오류가 있습니다");
	}
}

public class ExTest {

	public static void main(String[] args) throws InvaildException {

		int data = Integer.parseInt(args[0]);

		if (data < 2 || data > 5) {
			throw new InvaildException();
		} 
		
		Calc cc = new Calc();
		System.out.println("결과 값: " + cc.getSum(data));
		

	}

}
