package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		System.out.println("정수를 입력해주세요.");
		int num6 = sc.nextInt();
		
		String result6 = (num6 > 100) ? "100보다 큼" : (num6 < 100) ? "100보다 작음" : "100";
		System.out.println(result6);
		
		sc.close();

	}
}
