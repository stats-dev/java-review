package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
		Scanner sc = new Scanner(System.in);
		int a4 = sc.nextInt();
		
		switch (a4 % 3) {
		case 0:
			System.out.println("3의 배수입니다.");
			break;
		default:
			System.out.println("3의 배수가 아닙니다.");
			break;
		}
		
		
//
//5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//
//		int a5 = sc.nextInt();
//		if(a5 % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
//6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		int[] iArr = new int[5];
//		int max = 0;
//		
//		for(int i = 0; i < iArr.length; i++) {
//			System.out.println("정수를 입력하세요.");
//			iArr[i] = sc.nextInt();
//		}
//		
//		for(int i = 1; i < iArr.length; i++) {
//			if(iArr[i] > iArr[0]) {
//				max = iArr[i];
//			} else {
//				max = iArr[0];
//			}
//			
//		}
//		
//		System.out.println("입력한 정수 중 가장 큰 수는 " + max + "입니다.");
//		
//
//7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//		System.out.println("문자열을 입력해주세요.");
//		String str7 = sc.next();
//		String result7 = str7.equals("Yes") ? "예" : str7.equals("No") ? "아니오" : "잘못 입력하셨습니다.";
//		System.out.println(result7);
//		
		
//8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//
//		System.out.println("두 개의 정수를 입력하세요.");
//		int a8 = sc.nextInt();
//		int b8 = sc.nextInt();
//		
//		String result8 = (a8 == b8) ? "두 수가 같습니다." : (a8 > b8) ? "첫 번째 수가 더 큽니다." : "두 번째 수가 더 큽니다.";
//		System.out.println(result8);
		
		
		
//9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

		System.out.println("세 개의 정수를 입력하세요.");
//		int a3 = sc.nextInt();
//		int b3 = sc.nextInt();
//		int c3 = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		int[] iArr9 = new int[3]; 
		
		for(int i = 0; i < iArr9.length; i++) {
			iArr9[i] = sc.nextInt();
		}
		
		for(int i = 0; i < iArr9.length; i++) {
			if(iArr9[i] % 2 == 0) {
				even++;  
			} else {
				odd++;
			}
		}
		
		String result9 = (even == iArr9.length) ? "모두 짝수입니다." : 
						 (odd == iArr9.length) ? "모두 홀수입니다." : 
						 "짝수 : " + even +"개, " + "홀수 : " + odd + "개 입니다.";
		System.out.println(result9);
		
		
		sc.close();


	}

}
