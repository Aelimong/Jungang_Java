package test16;
/*
(1)package명은 test16으로 하고 LoginEx.java파일을 하나 만들어서 
클래스를 2개 추가하시오

(2)클래스명 : Login
-id:String
-pw:String
+setLogin(id:String, pw:String):void
+viewLogin():void

(3) 클래스명 : LoginEx
Login ob=new Login();
ob.setLogin("pororo","1234");
ob.viewLogin();

(3)출력화면
아이디는 pororo이고 비밀번호는 1234입니다
*/

  

class Login{
	
	private String id;
	private String pw;
  
  public void setLogin(String id, String pw) {
	  this.id=id;
	  this.pw=pw;	 
  }
  public void viewLogin() {
	  System.out.println("아이디는 "+id+"이고 비밀번호는 "+pw+"입니다");
	  
  }
	
}

public class LoginEx {
		
	public static void main(String[] args) {
		Login ob=new Login();
		ob.setLogin("pororo","1234");
		ob.viewLogin();
		
		
		
	}
	

}
