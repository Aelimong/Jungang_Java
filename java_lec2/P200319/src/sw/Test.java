package sw;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //�ڹ� �ȿ� �������� ����� ���̺귯��

class TestFrame extends JFrame{
	
	public TestFrame() {
		//������ ������ ����� ��� �ϴ� �޼ҵ� �����
		this.setLayout(null);	
		this.setBounds(100,100,300,300);
		
		JButton btn1=  new JButton("�ȳ��ϼ���");
		btn1.setBounds(10,10,150,40);
		
		ActionListener t= new TTTT(); //�������� �޸� new TTTT
		btn1.addActionListener(t);
		
		this.add(btn1);
		
		this.setVisible(true);
	}
	
}

class TTTT implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư ������ �� ����� �ڵ�");
	}
	
}



public class Test {

	public static void main(String[] args) {

		new TestFrame();
		
	}

}
