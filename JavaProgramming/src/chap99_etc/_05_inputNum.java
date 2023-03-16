package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~200사이의 숫자를 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터는 변수에 1~200 랜덤값 생성
		int com = (int) (Math.random() * 200) + 1;
		
		Random rand = new Random(); // ctrl + shift + o
		
		while(true) {
			System.out.println(com);

			//사용자 입력 정수 받기 nextInt
			int input = sc.nextInt();
			
			//201이면 while문 종료
			if(input == 201) break;
			
			//com == input
			if(com == input) { 
				System.out.println("맞췄습니다.계속 하시겠습니까? (1: 계속, 0: 종료)");
				input = sc.nextInt();
				
				if(input == 1) {
					System.out.println("1~200사이의 숫자를 입력하세요. : ");
					com = (int) (Math.random() *200) + 1;
					//System.out.print(com);
					//input = sc.nextInt();
					continue;	
					
				} else if(input == 0) {
					break;
				}
			} else {
				//틀렸습니다. 다시 입력하세요.
				System.out.println("틀렸습니다. 다시 입력하세요.");
				//입력값 다시 받도록
				//System.out.println(com);
				continue;						
			} 
		}

			
			//맞췄습니다.
			//계속 하시겠습니까?
			//1 => com = 새로운 1~200까지 난수, 다시게임 시작
			//0 => 게임종료
			
			//틀렸습니다. 다시 입력하세요.
			//입력값 다시 받도록
		
			sc.close(); //이건 꼭 넣어준다.
		}

}
