package col;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
				//Key�� �׻�!!!�ڹ����ڿ�
		
		HashMap<String, StudentData> map=
				new HashMap<String, StudentData>();
		
		StudentData st=new StudentData("Ʈ��1",10,100);
		map.put(st.name ,st); //���� �� put
		
		StudentData ref = map.get("Ʈ��1"); //���� �� get
		
		
		map.put("1��" , new StudentData("Ʈ��2",10,5));
		map.put("2��" , new StudentData("Ʈ��3",10,5));
		map.put("3��" , new StudentData("Ʈ��4",10,5));
		map.put("4��" , new StudentData("Ʈ��5",10,5));
		map.put("5��" , new StudentData("Ʈ��6",10,5));
		map.put("6��" , new StudentData("Ʈ��7",10,5));
		map.put("7��" , new StudentData("Ʈ��8",10,5));
		
		//iterator���� �� �Ǿ�����
		
		Set<String> keys= map.keySet(); //key�� set�� ���·� ��Ÿ�� �� ����
		for(String key : keys) {
			System.out.println(map.get(key).name);
		}
		
		
		
		
	}

}
