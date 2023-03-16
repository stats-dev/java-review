package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball_khh {
	
	// TODO Auto-generated method stub
	// 게임 룰 : 컴퓨터가 3개(0~9)의 랜덤값을 가지고
	// 			사용자가 3개(0~9)의 숫자를 입력(중복불가능)
	//			컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데 
	//			숫자만 같으면 볼로 판정
	//			숫자와 위치까지 모두 같으면 스트라이크로 판정
	//			몇 스트라이크, 몇 볼인지 출력
	//			3 스트라이크시 몇 회만에 맞췄는지 출력하고 게임종료
	//			다시 게임 진행할 지 물어보고 (1: 리스타트, 0: 종료)
	
	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;
	
	
	//랜덤객체 필요하면 쓰세요.
	Random rand = new Random();
	//컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];
	
	//사용자 입력값 저장할 배열
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		while(true) {
			
			generateRandom();
			
			
			//컴퓨터 배열 확인
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
			
			while(true) {
				//계속 초기화 해주셔야 합니다.
				strike = 0;
				ball = 0;
				
				getUserInput();
				
				//사용자 입력값 확인
				System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
				
				if(judgetStrike()) {
					gameCnt += 1;
					break;
				} else {
					continue; 
					}
			}
				if(reGame()) {
					continue;
				} else {
					break;
				}
		
				
			}
	}
			
		
		
		//컴퓨터 랜덤 값 3개 생성해주는 메소드
		public void generateRandom() {
			for(int i=1;com.length < 3; i++) {
				com[i] = rand.nextInt(10);
			}
			
			
		}
		
		// 중복값 체크 메소드 
		public boolean checkDuplicate(int[] arr, int num) { // int num: 몇번 인덱스까지 검사할지 알려주는 변수
			boolean isDuplicated = false;
			
	
			if(num < 1) {
				System.out.println("1 이상의 인덱스 입력하세요.");
			} else {
				for(int i=0;i<num;i++) {
					for(int j=0;j<num;j++) {			
						if(i != j) {
							if(arr[i] == arr[j]) {
								System.out.println("중복입니다.");
								isDuplicated = true;								
							} else
								continue;								

						} else {
							continue;
						}
					}
					
				}			
			
			}
				
			return isDuplicated; //나중에 바꾸기
		}
		
		
		//유저의 입력값을 받아서 배열에 담아주는 메소드
		public void getUserInput(){

			for(int i=0;i<user.length;i++) {
				
				// 중복 체크:: 위의 중복값 체크 메소드 활용해보면 좋겠다.
				if(checkDuplicate(user,user.length)) {
					user[i] = sc.nextInt(i);
				} else {
					break;
				}
				
			}
			
			
		}
		
		//스트라이크 볼 판정하는 메소드
		public boolean judgetStrike() {
			boolean isStrike = false;

			// 볼 : 숫자만 같다.
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					if(com[i] == user[j]) {
						if(i==j) {
							isStrike = true;
							strike++;
						}
						else {
							isStrike = false;
							ball++;
						}
							
						
					}
					continue;
				}
			
			}
			
			
			return isStrike;
		
	}
		//재게임 여부
		public boolean reGame() {
			boolean regame_choice = false;
			System.out.println("다시 게임 진행할까요? (1: 리스타트, 0: 종료)");
			int regame = sc.nextInt();
			
			if (regame == 1) {
				regame_choice = true;
			} else if(regame == 0) {
				regame_choice = false;
			} else {
				System.out.println("잘못된 입력입니다.");
				
			}
			
			return regame_choice;
		}
		
			
	

}
