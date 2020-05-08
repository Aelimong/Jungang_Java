package col;
import java.util.*;



public class LinkedListEx {

	public static void main(String[] args) {
		//내부 동작방식은 완전 다름.. ArrayList와 쓰는 방법은 똑같은데
		LinkedList<StudentData> list=
				new LinkedList<StudentData>();
		StudentData st1=new StudentData("한조",10,100);
		
		list.add(st1);
		list.add(new StudentData("트레1",20,70));
		list.add(new StudentData("트레2",20,70));
		list.add(new StudentData("트레3",20,70));
		list.add(new StudentData("트레4",20,70));
		list.add(new StudentData("트레5",20,70));
		list.add(new StudentData("트레6",20,70));
		
		list.add(3,new StudentData("트레7",20,70));
		list.remove(5);//결과는 똑같지만 링크만 바꾸는 것 
		list.remove(st1); //삭제되는 시점은 얘가 더 빠름,,, 하지만 찾아내기까지 시간이 걸림....
		StudentData t = list.get(4);//링크드리스트의 최대 단점...
		
		/*잘못된 예제
		for(int i=0; i<list.size(); i++) {
			StudentData ref = list.get(i);
			System.out.println(ref.name);
		}  //LinkedList에서는 이렇게 출력 노노노노노노 
		   //한 번 돌릴때마가 처음부터 하나씩 다 훑고옴		
		*/
		
		
		/*귀찮은 정답....아무도 이렇게 안 씀
		  반복자연산!! 
		  내부에 각각의 저장방식이 달라서 반복해야할 동작이 다르고
		  컬렉션 이터레이터를 통해 돌려야한다.
		Iterator<StudentData> iter = list.iterator();
	
		      //다음값이 있어???? 라고 조건을 걸어주는 것
		while(iter.hasNext()) {
			StudentData ref = iter.next();
			System.out.println(ref.name);
		}*/
		
		      //list에서 뽑아서 StudentData형에 하나씩 뽑아서 ref에 넣겠다
			  //반복자가 선언되어있는 경우(자료구조)에만 향상된 for문 사용가능)
		for(StudentData data :list) {
			System.out.println(data.name);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
