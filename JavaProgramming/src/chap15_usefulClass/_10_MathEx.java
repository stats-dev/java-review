package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 5개 정수 입력 => 배열에 저장
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5]; 

		for(int i=0;i<numArr.length;i++) {
			numArr[i] = sc.nextInt();
	}

		int max = numArr[0];
		int min = numArr[0];
		
		//Math.max와 Math.min을 이용하여
//		//최소값, 최대값 구하기
//		아 그냥 첫값이랑 계속 비교시키면 해결이 된다.
		for(int i = 0; i < numArr.length;i++) {
			max = Math.max(max,  numArr[i]);
			min = Math.min(min,  numArr[i]);
		}
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
		
				
		
//		int[] inputNum = new int[5]; 

		
//		for(int i=0;i<inputNum.length;i++) {
//			inputNum[i] = sc.nextInt();
//		}
//		
//		//Math.max와 Math.min을 이용하여
//		//최소값, 최대값 구하기
//		int max_result=0;
//		int min_result=1000000;
//		
//		for(int i=0;i<inputNum.length;i++) {
//			max_result = Math.max(inputNum[i], max_result);
//		}
//		
//		for(int i=0;i<inputNum.length;i++) {
//			min_result = Math.min(inputNum[i], min_result);
//		}
//		
//		System.out.println(max_result);
//		System.out.println(min_result);
		

		

	}

}
