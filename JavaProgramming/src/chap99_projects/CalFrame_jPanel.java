package chap99_projects;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		//버튼 배열을 만들고, 채우기
		JButton[] buttons = new JButton[16];
		


		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.add(new JLabel("숫자를 입력하세요 : "));
		
		//입출력창을 생성한다. 정확히는 버튼 누르면 나오는 출력창이다.
		JTextField txtField = new JTextField();
		//출력창의 크기를 조정한다.
		txtField.setPreferredSize(new Dimension(100,50));
		//창의 크기를 조정하고, 창 주위로 여백을 줍니다. 근데 이건 작동이 잘 안된다.
//		txtField.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		//글자 크기를 조정합니다.
		txtField.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		
		container.add(txtField, BorderLayout.NORTH);
		
		
		//계산기는 4 * 4 이다. 그리고 여백을 10포인트씩 가로 세로 부여한다.
		panel.setLayout(new GridLayout(4,4,10,10));
		
		for(int i=7; i<=9; i++) {
			buttons[i-7] = new JButton(String.valueOf(i));
			panel.add(buttons[i-7]);
		}
		
		buttons[3] = new JButton(String.valueOf("+"));
		panel.add(buttons[3]);
		
		//4,5,6
		for(int i=4; i<=6; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			panel.add(buttons[i]);
		}
		
		buttons[7] = new JButton(String.valueOf("-"));
		panel.add(buttons[7]); //add 순서도 중요하다.

		//8,9,10번째
		for(int i=1; i<=3; i++) {
			buttons[i+7] = new JButton(String.valueOf(i));
			panel.add(buttons[i+7]);
		}
		
		
		buttons[11] = new JButton(String.valueOf("x"));
		buttons[12] = new JButton(String.valueOf(0)); 
		buttons[13] = new JButton(String.valueOf("00"));
		buttons[14] = new JButton(String.valueOf("="));
		buttons[15] = new JButton(String.valueOf("/"));
		
		panel.add(buttons[10]);
		panel.add(buttons[11]);
		panel.add(buttons[12]);
		panel.add(buttons[13]);
		panel.add(buttons[14]);
		panel.add(buttons[15]);

		
		
		for(int i = 0; i < buttons.length; i++) {
			JButton button = buttons[i];
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String buText = button.getText();
					txtField.setText(buText);
//					calculator(buText); //ifelse로 처리

					switch (buText) {
					case '+':
						System.out.println(n1 + n2);
						break;
					case '-':
						System.out.println(n1 - n2);
						break;
					case '*':
						System.out.println(n1 * n2);
						break;
					case '/':
						if(n2 != 0) {
							System.out.println(n1 / n2);	        		
						} else {
							System.out.println("잘못된 수식이다.");
						}
						break;
					default:
						System.out.println("다시입력");
					}
				}
				
		}
		
		

		//문제는 grid layout은 컴포넌트 크기가 고정된다고 한다.
		container.add(panel, BorderLayout.CENTER);
		
			
		frame.setTitle("강호현의 계산기_수정");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		frame.setVisible(true); 
		
	
	
		
	}
	
	public static void calculator(String input) {
		System.out.println(input);
		boolean isFinished = false;
		boolean isOperator = false;
		String num1 = "0";
		String num2 = "0";
		char op = ' ';
		double n1 = num1.charAt(0);
		double n2 = num2.charAt(0);
		
		//연산자와 문자 확인
		if(input.charAt(0) >= 48 && input.charAt(0) <= 57) {
			num1 += input.charAt(0);
		} else {
			if(input.charAt(0) != '=') {
				isOperator = true;
				if(isOperator) num2 += input.charAt(0);
				op = input.charAt(0);
			} else {
				isFinished = true;
				System.out.println(op + n1 + n2);
			
			}
		}
		
		if(isFinished) {

			switch (op) {
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				if(n2 != 0) {
					System.out.println(n1 / n2);	        		
				} else {
					System.out.println("잘못된 수식이다.");
				}
				break;
			default:
				System.out.println("다시입력");
			}
		}
				
		
		
	}
	
	public static double cal(char op, double n1, double n2) {
		double result = 0;
		switch (op) {
		case '+':
			System.out.println(n1 + n2);
			result = n1 + n2;
			break;
		case '-':
			System.out.println(n1 - n2);
			result = n1 - n2;
			break;
		case '*':
			System.out.println(n1 * n2);
			result = n1 * n2;
			break;
		case '/':
			if(n2 != 0) {
				System.out.println(n1 / n2);
				result = n1 / n2;
			} else {
				System.out.println("잘못된 수식이다.");
			}
			break;
		default:
			System.out.println("다시입력");
		}
		
		
		return result;
	}



	

}


