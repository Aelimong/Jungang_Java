package test16;
/*
(1)package���� test16���� �ϰ� LoginEx.java������ �ϳ� ���� 
Ŭ������ 2�� �߰��Ͻÿ�

(2)Ŭ������ : Login
-id:String
-pw:String
+setLogin(id:String, pw:String):void
+viewLogin():void

(3) Ŭ������ : LoginEx
Login ob=new Login();
ob.setLogin("pororo","1234");
ob.viewLogin();

(3)���ȭ��
���̵�� pororo�̰� ��й�ȣ�� 1234�Դϴ�
*/

  

class Login{
	
	private String id;
	private String pw;
  
  public void setLogin(String id, String pw) {
	  this.id=id;
	  this.pw=pw;	 
  }
  public void viewLogin() {
	  System.out.println("���̵�� "+id+"�̰� ��й�ȣ�� "+pw+"�Դϴ�");
	  
  }
	
}

public class LoginEx {
		
	public static void main(String[] args) {
		Login ob=new Login();
		ob.setLogin("pororo","1234");
		ob.viewLogin();
		
		
		
	}
	

}