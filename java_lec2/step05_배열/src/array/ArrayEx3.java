package array;
// $ java ArrayEx3 abcd 가다나 123 12345

//String n=new String(); == String n1=" ";


public class ArrayEx3 {

	public static void main(String[] args) {
		                            //배열 매개변수
         System.out.println("args의 길이 : "+args.length);
		
		for(int i=0; i<args.length;i++) {
			System.out.println("args["+i+"] :"+args[i]);
			System.out.println("args["+i+"]의 크기 :"+args[i].length());
		    System.out.println();
		}
		
	//향상된 for문으로------------------
		
		for(String n : args){
			System.out.println(n+" ");
			System.out.println("args의 길이 : "+n.length());
			System.out.println();
		}
	}

}
