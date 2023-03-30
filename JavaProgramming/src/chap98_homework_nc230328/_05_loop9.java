package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop9 {

	public static void main(String[] args) {
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		Scanner sc = new Scanner(System.in);
		String str9;

		int sum9 = 0;
		
		while(true) {
			System.out.println("정수를 입력하세요. (종료: q)");
			str9 = sc.nextLine();
			if(str9.equals("q")) {
				break;
			} 
			
			try {
				int num = Integer.parseInt(str9); 
				sum9 += num;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다.");
			} 
		}
		
		System.out.println("입력된 정수의 총합은 : " + sum9 + "입니다.");
		sc.close();
	}

}
