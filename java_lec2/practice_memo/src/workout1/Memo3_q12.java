package workout1;

import java.util.Scanner;

/*
 [문제12]메인메서드에서 값을 입력받고  compute메서드를 호출하여 처리하시오
(1)입력받은 값을  compute(item, qty, price)메서에서 처리할것
(2)계산방법은  금액 = 수량 * 단가 로 하시오

[입력화면]
품명을 입력하시오 : apple
수량를 입력하시오 : 10
단가를 입력하시오 : 1200

[출력화면]
품명 : apple
금액 : 12000원
 
 
 */
public class Memo3_q12 {

 public static int compute(String item, int qty, int price) {
	 return qty*price;
 }

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String item;
        int qty, price;
      
        System.out.print("품명을 입력하시오 : ");
        item=sc.nextLine();
        
        System.out.print("수량을 입력하시오 : ");
        qty=sc.nextInt();
        
        System.out.print("단가를 입력하시오 : ");
        price=sc.nextInt();
        
        compute(item, qty, price);
        
        System.out.println("품명 : "+item);
        System.out.println("금액 : "+compute(item, qty, price)+"원");
        
        
        
		
		
		
		
	}

}
