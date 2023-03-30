package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables6 {

	public static void main(String[] args) {
	
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18 
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 9 사이의 정수 중 하나를 입력하세요.");
		int gugu = sc.nextInt();
		for(int i = 1;i < 10 ; i++) {
			System.out.printf("%d * %d = %d \n", gugu, i, (gugu * i) );
		}
	
	    sc.close();
	    
	}
	
	

}
