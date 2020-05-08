package col;
import java.util.*; //컬렉션 프레임워크 사용을 위해서


class StudentData implements Comparable<StudentData>{
	String name;
	int age;
	int score;
	
	StudentData(String name, int age, int score){
		this.name=name;
		this.age=age;
		this.score=score;
		
	}

	@Override
	public int compareTo(StudentData o) {
		//점수가 크냐작냐고 왼쪽 오른쪽 나누겠다
		//set계열 쓸 때 여기서 기준정해줘야한다!!
		
		if(this.score==o.score) {
			return 0;	
		}else if(this.score>o.score) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}


public class ArrayListEx {

	public static void main(String[] args) {

		//StudentData[] arr= new StudentData[100]; 
		//딱 배열의 갯수가 정해져있을 때, 배열 쓰는 게 제일 좋음 ex)비트맵
		
		ArrayList<StudentData>  list=
				new ArrayList<StudentData>(100); 
		//내부가 배열이고 10개의 크기를 가진 배열이 자동으로 생성
		//(100)괄호 안에 숫자 넣으면 그만큼의 크기를 갖는 배열 생성
		StudentData st1=new StudentData("한조",10,70);
		
		list.add(st1);
		        //StudentData타입의 변수 넣기!
		
		list.add(new StudentData("트레",20,100));
		list.add(new StudentData("트레2",20,100));
		list.add(new StudentData("트레3",20,100));
		list.add(new StudentData("트레4",20,100));
		list.add(new StudentData("트레5",20,100));
		list.add(new StudentData("트레6",20,100));
		
		
		list.add(3, new StudentData("트레7",20,100));
		//arrayList한정 이렇게 중간에 밀어넣는 건 조심해야한다!
		list.remove(5);
		//중간에 삭제하고 뒤에 부분을 앞으로 밀어넣는 거라 조심해야한다!
		//퍼포먼스적으로 오래 걸림
		list.remove(st1);//값으로도 지울 수 있음, 인덱스뿐만 아니라
		
		StudentData t=list.get(3);// arrayList의 가장 큰 장점! 
		                          //인덱스로 빠르게 값을 뽑아낼 수 있다!
		
		 for(int i=0; i<list.size(); i++) {
			 StudentData ref=list.get(i);
			 System.out.println(ref.name);
		 }
		
		
		
		
	}

}
