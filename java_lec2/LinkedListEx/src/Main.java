class Node<T> {
	T value; //���⿡ � ���� ������ �𸥴�. 
	Node next; // �ڱ� �ڽ��� ���� �� �ִ� �����ּҸ� ����ڴ�

}

class MyLinkedList<T> {
	Node<T> first = null;

	void add(T value) {
		Node<T> newNode = new Node<T>();  
		newNode.value = value;
 
		if (first == null) {
			first = newNode; // first�� newNode�� �ּҰ��� �ְڴ�
			return;
		}

		Node<T> temp = first;

		while (true) {
			if (temp.next == null) {
				temp.next = newNode;
				break; // while�� ������ ���������� �Ҹ�

			} // temp.next�� null���� ����ְ� �� ���� ����� �ּҰ��� �־���� ����!

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
		temp.next = temp.next.next; // 2��°�� �ؽ�Ʈ�� 4��° �ؽ�Ʈ ���� �ְڴ�

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

	T get(int index) {  //����Ÿ�Ե� T

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
	                //������ ���� �־����
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
