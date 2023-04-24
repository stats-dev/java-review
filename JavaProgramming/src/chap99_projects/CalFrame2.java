package chap99_projects;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalFrame2 extends JFrame {
	//껍데기 작성
	CalFrame2()
	{
		setTitle("첫프레임");
		setSize(300, 400);
		//종료 버튼 작성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ContentPane으로 해당 위치에 컴포넌트 추가
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//버튼을 추가하는 클래스 객체 생성
		JButton j_open = new JButton("Confirm");
		JButton j_close = new JButton("Pause");


		//레이블 추가
		JLabel j_lab = new JLabel("name");
		
		// 컴포넌트에 해당 버튼을 추가(add)
		c.add(j_open);
		c.add(j_close);
		c.add(j_lab);
		
		setVisible(true);
		
	}
	
	
}


