package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		System.out.println("5개의 정수를 입력하세요.");
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("5개의 정수의 합계: " + sum);
		System.out.println(" 평균: " + (sum / arr.length));		

	
	    sc.close();
	    
	}
	
	

}
