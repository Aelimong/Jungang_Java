package interfaceex;

interface Cryable{
	 public void cry();
}
interface Flyable{
	 public void fly();
}


  class Eagle implements Flyable, Cryable { 
    @Override
	public void fly() {
		System.out.println("�������� ���ƴٳ��~"); 
	}

    	@Override
    public void cry() {
    	 System.out.println("���~���"); 
    }
    	
    	
  }
    

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle eg=new Eagle();
	    eg.cry();
		eg.fly();

		

	}

}





//----------------------------------���� ���(�������̽� �� ��Ÿ���� ��)
//
//abstract class Cryable{
//	abstract public void cry();
//}
//abstract class Flyable{
//	abstract public void fly();
//}
//
//
//class Eagle extends Flyable{  //Cryable ���� �������� ������ �Ұ���
//    @Override
//	public void fly() {
//		System.out.println("�������� ���ƴٳ��~"); //2
//		new CryableEx().cry(); //3
//	
//	}
//}
//    class CryableEx extends Cryable{
//    	@Override
//    	public void cry() {
//    	  System.out.println("���~���"); //4
//    	  
//    	  
//    	  
//    	}
//    	
//    	
//    }
//
//
//public class InterfaceEx2 {
//
//	public static void main(String[] args) {
//		new Eagle().fly();  //1
//		
//		
//
//	}
//
//}
