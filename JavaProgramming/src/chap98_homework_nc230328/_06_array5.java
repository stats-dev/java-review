package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array5 {

	public static void main(String[] args) {

//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
//
		int[] iArr = new int[10];
		int max = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < iArr.length; i++) {
			if(iArr[0] >= iArr[i]) {
				max = iArr[0];
			} else if (max < iArr[i]) {
				max = iArr[i];
			}
			
			if(iArr[0] <= iArr[i]) {
				min = iArr[0];
			} else if (iArr[0] > iArr[i]) {
				min = iArr[i];
			}
		}

		System.out.println("최소값은 " + min + " 최대값은 " + max);
		
		sc.close();
		
		
	}

}
