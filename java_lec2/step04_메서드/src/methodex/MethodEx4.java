package methodex;
/*--���
 * ���� : 253��
 * ��� : 84.33��
 * ���� : B
 * ��� : �հ�
 * -------------
 * ���� : switch�� �̿�
 * ��� if~else f�� ���հ� �ƴϸ� �հ� �� ����
 * 
 * */

public class MethodEx4 {

	
/*
     public static int total(int k, int e, int m) {
	      return k+e+m;  //�����ϰ� ���� ���� ������ int �����
	                     //������ ȣ���� ������ �ǵ��ư� (���� ������)
      }

     public static double avg(int tot) {
    	 double av=tot/3.0;
    	 return av;
     }
     
     public static char grade(double av){
	     
    	 char gr;
    	 int AV=(int)av;
    	 
    	 switch(AV/10) {
	     case 10: 
	     case 9 : gr='A'; break;
	     case 8 : gr='B'; break;
	     case 7: gr='C'; break;
	     case 6: gr='D'; break;
	     default: gr='F';
	     }
	     return gr;
    	 
     }
	     
     public static String result(char gr){
	    
    	 String rs;
    	 
    	 if(gr == 'F') {
    		 rs="���հ�";
    	 } else 
    		 {
    		 rs="�հ�";
    		 }
    	 return rs;
    	 
     }
	
	public static void main(String[] args) {
	
	*/
	
    public static int total(int k, int e, int m) {
	      return k+e+m;  
	      }

   public static double avg(int tot) {
  	return tot/3.0;
  	
   }
   
   public static char grade(double av){
	     
  	 char gr;
  	 switch((int)av/10) {
	     case 10: 
	     case 9 : gr='A'; break;
	     case 8 : gr='B'; break;
	     case 7: gr='C'; break;
	     case 6: gr='D'; break;
	     default: gr='F';
	     }
	     return gr;
  	 
   }
	     
   public static String result(char gr){
	     	 
  	 if(gr == 'F') {
  		return "���հ�";
  	 } else  {
  		 return"�հ�";
  		 }
   }
	
	public static void main(String[] args) {
		
		int k=95, e=85, m=73;  //�޸𸮻��� �ӽð�
		
		System.out.println("���� : "+total(k, e, m)); 
		System.out.printf("��� : %.2f\n", avg(total(k, e, m)));
		System.out.println("���� : "+grade(avg(total(k, e, m))));
        System.out.println("���: "+result(grade(avg(total(k, e, m)))));
		
	

	}

}
