package chap99_projects;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalFrame_gridbag extends JFrame {
	
	Container c;
	//배열로 작성
	JButton buttonList[] = new JButton[5];
	String strLst[] = {"b1","b2","back","forward","reset"};
		
	
	//껍데기 작성
	CalFrame_gridbag()
	{
		
	
		setTitle("강호현 계산기 프레임");
		setSize(300, 400);
		//종료 버튼 작성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();		
		setVisible(true);
		
	}


	public void setButton() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab1 = new JLabel("My program");
		c.add(lab1);
		for(int i = 0; i < 5; i++) {
			buttonList[i] = new JButton(strLst[i]);
			c.add(buttonList[i]);
		}
		
	}
	
	
}


