package chap99_etc.game;

import java.util.Scanner;

public class NumBaseball {
	//게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고 
	//        사용자가 3개의 숫자를 입력(중복불가능)
	//		  컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를
	//        비교하는 데 숫자만 같으면 볼로 판정
	//        숫자와 위치까지 모두 같으면 스트라이크로 판정
	//        몇 스트라이크 몇 볼인지 출력
	//        3 스트라이크시 몇 회만에 맞췄는지 출력하고 게임종료
	//        다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)
	//스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;
	
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
			System.out.println(com[0] + ", " 
					+ com[1] + ", " + com[2]);
			
			while(true) {
				strike = 0;
				ball = 0;
				
				getUserInput();
				
				//사용자 입력값 확인
				System.out.println(user[0] + ", "
						+ user[1] + ", " + user[2]);
				
				if(judgetStrike()) {
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
		
		//중복체크
	}
	
	//중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
		
		
		
		return false;
	}
	
	//유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		
		//중복체크
	}
	
	//스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		
		return false;
	}
	
	
	//재게임 여부
	public boolean reGame() {
		return false;
	}
	
	
}
