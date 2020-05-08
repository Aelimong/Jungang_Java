class Node<T> {
	T value; //여기에 어떤 값을 넣을지 모른다. 
	Node next; // 자기 자신을 받을 수 있는 참조주소를 만들겠다

}

class MyLinkedList<T> {
	Node<T> first = null;

	void add(T value) {
		Node<T> newNode = new Node<T>();  
		newNode.value = value;
 
		if (first == null) {
			first = newNode; // first에 newNode의 주소값을 넣겠다
			return;
		}

		Node<T> temp = first;

		while (true) {
			if (temp.next == null) {
				temp.next = newNode;
				break; // while문 끝나면 지역변수들 소멸

			} // temp.next에 null값이 들어있고 그 곳에 뉴노드 주소값을 넣어야지 끝남!

			temp = temp.next;

		}

	}

	void remove(int index) {
		Node<T> temp = first;

		if (index == 0) {
			first = first.next;
			return;
		}

		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next; // 2번째의 넥스트에 4번째 넥스트 값을 넣겠다

	}

	void add(int index, T value) {
		Node<T> newNode = new Node<T>();
		newNode.value = value;

		Node<T> temp = first;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	T get(int index) {  //리턴타입도 T

		Node<T> temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.value;

	}

}

class STData{
	int v1;
	String v2;
	String v3;
	
}



public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	                //참조형 변수 넣어야함
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		list.add(3, 500);
		
		list.remove(5);

		for (int i = 0; i < 10; i++) {
			int value = list.get(i);
			System.out.println(value);
		}
		
		MyLinkedList<STData> stList = new MyLinkedList<STData>();
		stList.add(new STData());
		

	}

}
