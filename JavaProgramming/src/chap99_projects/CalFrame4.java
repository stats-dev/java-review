package chap99_projects;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalFrame4 extends JFrame {
	
	Container c = getContentPane();
	//배열로 작성
		
	//GridLayout(int rows, int cols) -> row개 행과 cols개 열로 분할한다. 값은 0으로 초기화
	//계산기는 3 * 4 이다.
	GridLayout grid = new GridLayout(3,4);
	
	
	
	
	//껍데기 작성
	CalFrame4()
	{
		
	
		setTitle("두번째 그리드 프레임");
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


