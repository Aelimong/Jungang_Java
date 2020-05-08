package sw;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //자바 안에 위도우즈 만드는 라이브러리

class TestFrame extends JFrame{
	
	public TestFrame() {
		//윈도우 프레임 만드는 기능 하는 메소드 만들기
		this.setLayout(null);	
		this.setBounds(100,100,300,300);
		
		JButton btn1=  new JButton("안녕하세요");
		btn1.setBounds(10,10,150,40);
		
		ActionListener t= new TTTT(); //실질적인 메모리 new TTTT
		btn1.addActionListener(t);
		
		this.add(btn1);
		
		this.setVisible(true);
	}
	
}

class TTTT implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌렀을 때 실행될 코드");
	}
	
}



public class Test {

	public static void main(String[] args) {

		new TestFrame();
		
	}

}
