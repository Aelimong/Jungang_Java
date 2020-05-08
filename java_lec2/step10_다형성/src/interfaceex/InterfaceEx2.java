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
		System.out.println("독수리는 날아다녀요~"); 
	}

    	@Override
    public void cry() {
    	 System.out.println("까악~까악"); 
    }
    	
    	
  }
    

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle eg=new Eagle();
	    eg.cry();
		eg.fly();

		

	}

}





//----------------------------------다중 상속(인터페이스 안 나타났을 때)
//
//abstract class Cryable{
//	abstract public void cry();
//}
//abstract class Flyable{
//	abstract public void fly();
//}
//
//
//class Eagle extends Flyable{  //Cryable 같이 가져오고 싶은데 불가능
//    @Override
//	public void fly() {
//		System.out.println("독수리는 날아다녀요~"); //2
//		new CryableEx().cry(); //3
//	
//	}
//}
//    class CryableEx extends Cryable{
//    	@Override
//    	public void cry() {
//    	  System.out.println("까악~까악"); //4
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
