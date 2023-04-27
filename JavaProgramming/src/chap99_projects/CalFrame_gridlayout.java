package chap99_projects;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CalFrame_gridlayout extends JFrame {
	
	public CalFrame_gridlayout() {
		Container container = getContentPane();
		//배열로 작성
			
		//GridLayout(int rows, int cols) -> row개 행과 cols개 열로 분할한다. 값은 0으로 초기화

		//계산기는 4 * 4 이다. 그리고 여백을 10포인트씩 가로 세로 부여한다.
		setLayout(new GridLayout(4,4,10,10));

		for(int i=7; i<=9; i++) {
			add(new JButton(String.valueOf(i)));
		}
		
		add(new JButton(String.valueOf("+")));
		
		for(int i=4; i<=6; i++) {
			add(new JButton(String.valueOf(i)));
		}
		
		add(new JButton(String.valueOf("-")));
		
		for(int i=1; i<=3; i++) {
			add(new JButton(String.valueOf(i)));
		}
		
		add(new JButton(String.valueOf("x")));
		add(new JButton(String.valueOf(0)));
		
		add(new JButton("00"));
		add(new JButton("="));
		add(new JButton("/"));
		
		
		//문제는 grid layout은 컴포넌트 크기가 고정된다고 한다.
		
		
		setTitle("강호현의 계산기");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//눈에 보인다.
		setVisible(true); 
		
		
		
	}



	

}


