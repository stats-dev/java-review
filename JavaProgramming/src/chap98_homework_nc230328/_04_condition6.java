package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition6 {

	public static void main(String[] args) {

//6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[5];
		int max = 0;
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("정수를 입력하세요.");
			iArr[i] = sc.nextInt();
		}
		
		for(int i = 1; i < iArr.length; i++) {
			if(iArr[i] > iArr[0]) {
				max = iArr[i];
			} else {
				max = iArr[0];
			}
			
		}
		
		System.out.println("입력한 정수 중 가장 큰 수는 " + max + "입니다.");
		
		sc.close();


	}

}
