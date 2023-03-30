package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 정수를 입력하세요.");
		int a8 = sc.nextInt();
		int b8 = sc.nextInt();
		
		String result8 = (a8 == b8) ? "두 수가 같습니다." : (a8 > b8) ? "첫 번째 수가 더 큽니다." : "두 번째 수가 더 큽니다.";
		System.out.println(result8);
		
		sc.close();


	}

}
