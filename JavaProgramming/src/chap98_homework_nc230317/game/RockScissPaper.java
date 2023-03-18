package chap98_homework_nc230317.game;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {

	//몇승 몇무 몇패인지 셀 변수
	private int win = 0;
	private int draw = 0;
	private int lose = 0;
	
	//승점 담아줄 변수(승:1, 무:0, 패:-1)
	private int score = 0;
	
	//승무패 기록을 담아줄 배열
	private int[] wdl;
	
	//게임 실행 메소드
	public void start() {
		while(true) {
			Scanner sc = new Scanner(System.in);
				
			//사용자가 입력한 round 만큼 게임진행
			System.out.print("진행할 게임의 판 수를 입력하세요.");
			int round = sc.nextInt();
			wdl = new int[round];
				
			//총 10판 진행
			for(int i = 0; i < wdl.length; i++) {
				//클래스 안에 랜덤 변수를 발생시키는 메소드
				//1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
				int randomVal = generateRandom();
				//int randomVal2 = generateRandom();
					
				//사용자 입력 값 받아서 정수형 변환해주는 메소드
				int userNum = convertUserInput(sc);
					
				if(userNum == 0) {
					System.out.println("잘못 입력하셨습니다.");
					//해당 게임을 다시 진행하기 위해 1 감소
					//for문에서 continue문을 만나면 증감식으로 이동하기 때문
					i--;
					continue;
					
				}
					
				//승, 무, 패 판단해주는 메소드
				//가위, 바위, 보 비교
				//무승부
				judgeWdl(userNum, randomVal, i);
					
			
					
			}
			//승점 계산해주는 메소드
			//승점 계산
			sumScore();

			if(reGame()) {
				continue;
			} else {
				break;
			}
			
		}
		
	}
	
	//1~3 중 랜덤 값 발생시키는 메소드
	public int generateRandom() {
		
		Random rand = new Random();
		int randomVal =  rand.nextInt(3) + 1;
		System.out.println(randomVal);

		return randomVal;
	}
	
	//사용자 입력 값을 정수형을 변환해주는 메소드
	public int convertUserInput(Scanner sc) {
		// (1:가위, 2:바위, 3:보)
		String user = sc.next(); 
		int result=0;

		switch(user) {
			case "가위":
				result = 1;
				break;
			case "바위":
				result = 2;
				break;
			case "보":
				result = 3;
				break;
			default:
				break;
		}
		System.out.println(result);
		return result;

		
		
	}
	
	//승, 무, 패 판단 메소드
	public void judgeWdl(int userNum, int randomVal, int i) {
		if(randomVal == userNum) {
			wdl[i] = 'd';
			System.out.println("비겼습니다.");
			
		} else {
			if((userNum == 1 && randomVal == 3) ||
					(userNum == 2 && randomVal == 1) ||
					(userNum == 3 && randomVal == 2)) {
				wdl[i] = 'w';
				System.out.println("이겼습니다.");
				
			} else {
				wdl[i] = 'l';
				System.out.println("졌습니다.");
				
			}

		}
		
	}
	
	//승점 계산 및 출력 메소드
	public void sumScore() {
		for(int j = 0; j < wdl.length; j++) {
			if(wdl[j] == 'w') {
				System.out.println(j+1 + "판의 결과 : " + "승");
				win++;
				score++; //승 + 1
			} else if(wdl[j] == 'd') {
				System.out.println(j+1 + "판의 결과 : " + "무");
				draw++;
			} else if(wdl[j] == 'l') {
				System.out.println(j+1 + "판의 결과 : " + "패");
				lose++;
				score--; //패 -1
			}
		}
		
		System.out.println(win + "승" + draw + "무" + lose + "패");
		System.out.println("총 승점은 " + score + "입니다.");
		
	}
	
	public boolean reGame() {
		boolean isRegame = false;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("다시 게임을 진행하시겠습니까?(1: 재시작, 0: 종료)");
			int regame = sc.nextInt();
			
			if(regame ==1) {
				isRegame = true;
				break;
			} else if(regame == 0) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
				
				
			}

		}
		//sc.close(); 이건 언제 넣는게 좋을까요?

		return isRegame;
		
	}

}
