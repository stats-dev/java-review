package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------연산자--------------------
//
		Scanner sc = new Scanner(System.in);
	
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.

		System.out.println("문자열을 입력해주세요.");
		String str = sc.next();
		
		if(str.equals("Hello")) {
			System.out.println("입력한 문자열은 " + str + "이고 Hello와 일치합니다.");
		} else {
			System.out.println("입력한 문자열은 " + str + "이고 Hello와 일치하지 않습니다.");
		}

		sc.close();

	}
}
