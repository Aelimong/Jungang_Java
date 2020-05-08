package userclass;
import java.util.*;


public class STMController {

	
	private STMModel model; 
	//컨트롤러가 모델과 뷰어를 조정해야하기 때문에 멤버변수(클래스형)로 받는다
	
	
	public STMController(STMModel model) {
		//model=new STMModel(); //컨트롤러 안에 객체생성 한다면 완전 포함관계(완전 종속)
		this.model=model;
	}
	
	
	public void run() {
	//사실상 시작 시점
	//왜 여기에서...? 와이낫 메인...?
		
		greeting();
		
		while(true) {
	
			showMenu();
			String inputValue = STMUtil.SCANNER.nextLine();
			
			if(inputValue.equals("q")) {
				break;
			}
			
			
			switch(inputValue) {
			case "1":
				addData();
				break;
			case "2":
				showList();
				break;
			case "3":
					break;
			case "4":
				break;
			case "5":
				break;
			default:
				System.out.println("다른 값을 입력해주세요");
			}
			
			
			
			
			
		}
	
	}
	
	private void greeting() {
		System.out.println("프로그램 반가워");
		System.out.println("작성자 애림");
	}

	
	private void showMenu() {

		System.out.println("1.입력");
		System.out.println("2.리스트 출력");
		System.out.println("3.검색");
		System.out.println("4.삭제");
		System.out.println("5.수정");
		System.out.print("입력>");
	}
	
	private void addData() {
		System.out.print("이름을 입력>");
		String name = STMUtil.SCANNER.nextLine();
		System.out.print("나이를 입력>");
		int age=Integer.parseInt(STMUtil.SCANNER.nextLine());
		System.out.print("점수를 입력>");
		int score=Integer.parseInt(STMUtil.SCANNER.nextLine());
		
		
		model.addStudentData(new STData(name, age, score));
		
	}
	
	public void showList() {
		for(int i=0; i<model.getCurrentStudentCount(); i++) {
			STData st = model.getStudentData(i);
			System.out.println(st.getName());
		}
	}
	
}
