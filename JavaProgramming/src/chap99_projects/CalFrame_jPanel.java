package chap99_projects;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalFrame_jPanel extends JFrame {
	
	public CalFrame_jPanel() {

		//frame 객체 생성
		JFrame frame = new JFrame("강호현의 계산기");
		frame.setPreferredSize(new Dimension(400,500));
			
		frame.setLocation(500, 400);
		
		Container container = frame.getContentPane();

		
		//GridLayout(int rows, int cols) -> row개 행과 cols개 열로 분할한다. 값은 0으로 초기화

		
		//메인 화면, 결과 출력창을 넣을 부분 추가
		JPanel panel = new JPanel();
		


		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.add(new JLabel("숫자를 입력하세요 : "));
		
		//입력창을 생성한다. 정확히는 버튼 누르면 나오는 출력창이다.
		container.add(new JTextField(), BorderLayout.NORTH);
		
		
		//계산기는 4 * 4 이다. 그리고 여백을 10포인트씩 가로 세로 부여한다.
		panel.setLayout(new GridLayout(4,4,10,10));
		
		for(int i=7; i<=9; i++) {
			panel.add(new JButton(String.valueOf(i)));
		}
		
		add(new JButton(String.valueOf("+")));
		
		for(int i=4; i<=6; i++) {
			panel.add(new JButton(String.valueOf(i)));
		}
		
		panel.add(new JButton(String.valueOf("-")));
		
		for(int i=1; i<=3; i++) {
			panel.add(new JButton(String.valueOf(i)));
		}
		
		panel.add(new JButton(String.valueOf("x")));
		panel.add(new JButton(String.valueOf(0)));
		
		panel.add(new JButton("00"));
		panel.add(new JButton("="));
		panel.add(new JButton("/"));
		
		
		//문제는 grid layout은 컴포넌트 크기가 고정된다고 한다.
		container.add(panel, BorderLayout.CENTER);
		
			
		frame.setTitle("강호현의 계산기");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		frame.pack();
		//눈에 보인다.
		frame.setVisible(true); 
		
		
		
	}



	

}


