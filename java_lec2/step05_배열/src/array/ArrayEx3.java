package array;
// $ java ArrayEx3 abcd ���ٳ� 123 12345

//String n=new String(); == String n1=" ";


public class ArrayEx3 {

	public static void main(String[] args) {
		                            //�迭 �Ű�����
         System.out.println("args�� ���� : "+args.length);
		
		for(int i=0; i<args.length;i++) {
			System.out.println("args["+i+"] :"+args[i]);
			System.out.println("args["+i+"]�� ũ�� :"+args[i].length());
		    System.out.println();
		}
		
	//���� for������------------------
		
		for(String n : args){
			System.out.println(n+" ");
			System.out.println("args�� ���� : "+n.length());
			System.out.println();
		}
	}

}
