package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------연산자--------------------
//
		Scanner sc = new Scanner(System.in);

//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		System.out.println("하나의 문자열과 하나의 정수를 입력하세요.");
		String str8 = sc.next();
		int num8 = sc.nextInt();
		
		System.out.printf("입력한 문자열 %s이고, 입력한 숫자는 %d입니다.", str8, num8);
		sc.close();

	}

}
