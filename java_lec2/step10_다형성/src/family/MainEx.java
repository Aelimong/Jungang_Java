package family;


/*
 * �̸�: ȫ�浿
 * �ƺ��� ������ ���� �Ѵ�
 * 
 * �̸� : ����
 * ������ �������� �Ѵ�
 * 
 * �̸� : ȫ��ǥ
 * �Ƶ��� �����Ѵ�
 * 
 */
public class MainEx {

	public static void main(String[] args) {
	
		
		Father fa=new Father("ȫ�浿");
		System.out.println(fa.toString());
		
		Mother mo=new Mother("����");
		System.out.println(mo.toString());
		
		Son so=new Son("ȫ��ǥ");
		System.out.println(so.toString());
		
		
        /*
		
		1. ��ü�迭

     Family[] fm= new Family[3]; 
     fm[0] = new Father("ȫ�浿");
     fm[1] = new Mother("����");
     fm[2] = new Son("ȫ��ǥ");
  
      
     for(int i=0; i<fm.length; i++) {
   	  System.out.println(fm[i].toString());
      }
    	  
		
		
		2.���� ����
    	  Family [] f1= new Family[] {
    			  new Father("ȫ�浿"),
                  new Mother("��û"),
                  new Son("ȫ��ǥ")};
 
    	  
    	  for(Family ob : f1) {
           	  System.out.println(ob);
        	  }
    	  
    	  */
        	  
    	  
    	  
    	  
    	  
}
}