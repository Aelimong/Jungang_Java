package col;
import java.util.*;


public class SetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set =new TreeSet<Integer>();
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(6);
		set.add(5); //�ߺ��� ���� ������� �ʴ´�!!!!!!!!!!!!!!!!!!!!
		set.add(9);
		set.add(1);
		
		for(Integer data:set) {
			System.out.println(data);
		}
		
		
;
		
		
		
	}

}
