package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID�� �Է��ϼ���: pororo
 * PW�� �Է��ϼ���: 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�.
 * ���� ����Ʈ�� 89.97���Դϴ�
 * 
 * 
 * 
 * [[BOOK�� ��������]]
 * å�̸� : java   å���� : kim ������ : 100
     å�̸� : oracle å���� : lee ������ : 200
     å�̸� : html   å���� : park ������ : 300
 * 
 * --------------------
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1235
 * 
 * ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.
 * 
 */
public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id; // �����Լ� �ȿ��� ���۵Ǵ� �Ŷ� ���������� �ʿ����
		String pw;

		// �Է�ó��!!
		System.out.print("ID�� �Է��ϼ��� : ");
		id = sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");
		pw = sc.next();

		// �Է°��� ���� �˻�
		UserProc up = new UserProc();
		User entity = up.getLoginUser(id, pw); // �޼��� ������ֱ�!, UserŬ���� ��ü�� ������ �ٳ���ϱ� ������

		// ��� ���

		if (entity != null) { // �����Ͱ� �ִ� ���
			System.out.println("\n" + entity.getName() + "���� �����ϼ̽��ϴ�");
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "�� �Դϴ�" + "\n");

			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();

			System.out.println("[[BOOk�� ��������]]");
			for (Book ob : list) {
				System.out.println(
						"å�̸� : " + ob.getTitle() + "\t" + "å���� : " + ob.getAuthor() + "\t" + "������ : " + ob.getPage());
			}

		} else {// �����Ͱ� ���� ���
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.");
		}

	}

}
