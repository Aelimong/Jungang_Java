package animal;

import java.util.Scanner;

//�������ε� : ��Ÿ�ӿ� ȣ�� �Լ��� ����, �ڵ����� �پ��

public class AnimalMain2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  int n;
		 Animal ani=null;
		  
		  while(true) {
			  System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n���� : ");
			  n=sc.nextInt();
			  
			  switch(n) {   //�θ�Ŭ������ ��ü�������� �ڽİ�ü ����
			  case 1: ani=new Dog(); break;
			  case 2: ani=new Cat(); break;
			  case 3: ani=new Fish(); break;
			  case 4: ani=new Duck(); break;
			  default: System.out.println("***�����մϴ�***");
			       sc.close();
			       System.exit(0);
			  }
			  
			  ani.speak();
			  ani.walk();
		  }
	}

}
