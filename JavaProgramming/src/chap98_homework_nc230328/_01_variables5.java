package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables5 {

	public static void main(String[] args) {

//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요.");
		
		int[] iArr = new int[3];
		int max;
		int mid;
		int min;
		
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i] = sc.nextInt();
		}
		
		max = Math.max(iArr[0], Math.max(iArr[1], iArr[2]));
		min = Math.min(iArr[0], Math.min(iArr[1], iArr[2]));
		mid = iArr[0] + iArr[1] + iArr[2] - max - min; 
		
		System.out.println("최소값 : " + min + " 중간값 : " + mid + " 최대값 : " + max);
	
	    sc.close();
	    
	}
	
	

}
