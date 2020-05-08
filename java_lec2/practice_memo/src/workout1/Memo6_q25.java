package workout1;

import java.util.Scanner;

abstract class Height {
	final double INCH = 2.54;
	abstract double getInch(double cm);

}

class Test42 extends Height {

	@Override
	public double getInch(double cm) {
		return cm / INCH;
	}
}

public class Memo6_q25 {

	private static Scanner sc;

	public static void main(String[] args) {

		double x;

		sc = new Scanner(System.in);
		System.out.print("입력(cm) : ");
		x = sc.nextDouble();

		Test42 ob = new Test42();

		System.out.println("결과 : " + (int) (ob.getInch(x)) + "인치");
	}

}
