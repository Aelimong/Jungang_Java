package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * value�� ������ Ű�� ã��
 */
public class MapEx5 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�Ѹ�", "����1");
		map.put("��ġ", "����2");
		map.put("������", "����3");
		map.put("�����", "����4");
		map.put("��浿", "����5");

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �̸��� �Է��ϼ���(����1~5) : ");
		String room = sc.nextLine();

		Set<String> keys = map.keySet();
		for (String key : keys) {
			String rom = map.get(key); //

			if (rom.equals(room)) {
				System.out.println(room + "�� �ִ� ����ڴ� " + key + "�Դϴ�");
			}
		}

	}

}
