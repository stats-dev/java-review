package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("세 개의 정수를 입력하세요.");

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
