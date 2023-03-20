package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//1~45까지 7개의 난수(중복제거)
	
	//7번째 숫자는 보너스 번호

	public static int[] Lotto() {
		Random rand = new Random();	
		int[] lotto = new int[7];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rand.nextInt(45) + 1;}
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if (lotto[i] == lotto[j]) {
					break;
				} else {
					continue;
				}

		
			}
			System.out.println(lotto[i]);
		}

		
		return lotto;
	}
	

	
	//사용자가 1~45까지; 6게 숫자 산텍(중복제거)
	public static int[] User() {
		Scanner sc = new Scanner(System.in);
		int[] user = new int[6];
		
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<user.length;j++) {
				if (user[i] >= 1 && user[i] <= 45) {
					if (user[i] == user[j]) {
						user[i] = sc.nextInt();
						System.out.println("중복입니다. 다시 선택해주세요.");
						continue;
					} else {
						break;
					}	
				} else {
					System.out.println("잘못된 입력입니다.");
					System.out.println(user[i]);
					continue;
				}
				
				
					
				}
		};
		
		return user;
	}



			
			

	
}
	
	//1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을 때
	//2등 : 보너스 번호와 5개 번호가 일치할 때
	//3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
	//4등 보너스 번호를 제외한 4개의 숫자가 일치할 때
	//5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때 
	//나머지는 꽝
	
	//몇 등인지 출력

	
	

