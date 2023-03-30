package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop4 {

	public static void main(String[] args) {
//		4. 사용자가 입력한 정수의 약수를  출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나를 입력하세요.");
		int num4 = sc.nextInt();
		
		System.out.println("정수의 약수는 다음과 같습니다.");
		for(int i = 1; i < num4; i++) {
			if(num4 % i == 0) {
				System.out.print(i + ", ");
		
			}
			
		}
		
		sc.close();

	}
}