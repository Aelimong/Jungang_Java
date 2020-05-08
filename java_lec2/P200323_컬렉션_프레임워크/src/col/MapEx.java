package col;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
				//Key는 항상!!!★문★자열
		
		HashMap<String, StudentData> map=
				new HashMap<String, StudentData>();
		
		StudentData st=new StudentData("트레1",10,100);
		map.put(st.name ,st); //넣을 땐 put
		
		StudentData ref = map.get("트레1"); //뽑을 땐 get
		
		
		map.put("1번" , new StudentData("트레2",10,5));
		map.put("2번" , new StudentData("트레3",10,5));
		map.put("3번" , new StudentData("트레4",10,5));
		map.put("4번" , new StudentData("트레5",10,5));
		map.put("5번" , new StudentData("트레6",10,5));
		map.put("6번" , new StudentData("트레7",10,5));
		map.put("7번" , new StudentData("트레8",10,5));
		
		//iterator구현 안 되어있음
		
		Set<String> keys= map.keySet(); //key를 set의 형태로 나타낼 수 있음
		for(String key : keys) {
			System.out.println(map.get(key).name);
		}
		
		
		
		
	}

}
