import java.sql.ResultSet;
import java.util.*;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name=null; //�ְ����� ���� ���̵�
		int maxScore=0;   //�ְ�����
		int totalScore=0; //�����հ�
		
		//System.out.println(map.get("blue"));
		
		Set<Entry<String, Integer>> set= map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=set.iterator();
		
		Collection<Integer> valueSet=map.values();
		maxScore=Collections.max(valueSet);
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			Integer values = entry.getValue(); 
			//System.out.println(values);
			totalScore+=values;
			
			if(values.equals(maxScore)) {
				name = entry.getKey();
			}		
			
		}
	
		
		System.out.println("�հ�����: "+totalScore);
		System.out.println("�������: "+(totalScore/map.size()));
		System.out.println("�ְ�����: "+maxScore);
		System.out.println("�ְ������� ���� ���̵�"+name);
		
		
	}

}