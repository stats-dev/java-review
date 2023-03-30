package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//     요."를 출력하세요.(switch~case~default 사용)
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str3 = sc.next();
		
		switch (str3) {
		case "java":
			System.out.println("좋아하는 언어입니다.");
			break;
		case "Python" :
			System.out.println("공부중인 언어입니다.");
		default:
			System.out.println("다른 언어를 공부해보세요.");
			break;
		}
		
		sc.close();


	}

}
