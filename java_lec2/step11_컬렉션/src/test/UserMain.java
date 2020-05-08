package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID를 입력하세요: pororo
 * PW를 입력하세요: 1234
 * 
 * 뽀로로님이 입장하셨습니다.
 * 현재 포인트는 89.97점입니다
 * 
 * 
 * 
 * [[BOOK의 정보보기]]
 * 책이름 : java   책저자 : kim 페이지 : 100
     책이름 : oracle 책저자 : lee 페이지 : 200
     책이름 : html   책저자 : park 페이지 : 300
 * 
 * --------------------
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1235
 * 
 * ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.
 * 
 */
public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id; // 메인함수 안에서 동작되는 거라 접근지정자 필요없음
		String pw;

		// 입력처리!!
		System.out.print("ID를 입력하세요 : ");
		id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		pw = sc.next();

		// 입력값에 대한 검사
		UserProc up = new UserProc();
		User entity = up.getLoginUser(id, pw); // 메서드 만들어주기!, User클래스 전체를 가지고 다녀야하기 때문에

		// 결과 출력

		if (entity != null) { // 데이터가 있는 경우
			System.out.println("\n" + entity.getName() + "님이 입장하셨습니다");
			System.out.println("현재 포인트는 " + entity.getPoint() + "점 입니다" + "\n");

			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();

			System.out.println("[[BOOk의 정보보기]]");
			for (Book ob : list) {
				System.out.println(
						"책이름 : " + ob.getTitle() + "\t" + "책저자 : " + ob.getAuthor() + "\t" + "페이지 : " + ob.getPage());
			}

		} else {// 데이터가 없는 경우
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.");
		}

	}

}
