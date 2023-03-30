package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str7 = sc.next();
		String result7 = str7.equals("Yes") ? "예" : str7.equals("No") ? "아니오" : "잘못 입력하셨습니다.";
		System.out.println(result7);
		
		sc.close();


	}

}
