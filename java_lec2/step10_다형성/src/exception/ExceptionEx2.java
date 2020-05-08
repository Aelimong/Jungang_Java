package exception;
//unchecked exception
public class ExceptionEx2 {

	public static void main(String[] args) {
     int[] num= {10,20,30};
     
     try {
     
     for(int i=0;i<5; i++) {
    	 System.out.print(num[i]+" ");
         }
		
    }    catch (ArrayIndexOutOfBoundsException e) {
    	 System.out.println("\n배열 개수가 맞지 않음");
         }
		
     
	}

}
