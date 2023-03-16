package chap98_homework_nc230315;

import java.util.Random;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//		   while문내에 조건문을 넣어주면 됨
		
		int i = 1;
		while(i <= 10) {
			i++;
			
			if(i % 2 != 0) 
				continue;
			
			System.out.println(i);
		}
		
//		2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
		
		/*
		 * int sum = 0; for(i=1; i<= 1000;i++) {
		 * 
		 * if(i % 2 == 0 && i % 7 == 0) { System.out.println(i); sum += i;
		 * 
		 * }
		 * 
		 * } System.out.println("숫자들의 합:" + sum);
		 */
		
		//문제가 됩니다! 2의 배수

//		3. 구구단을 이렇게 출력하세요
//		 2x1=2 3x1=3...9x1=9
//		 2x2=4
//		 ...
//		 2x9=18........9x9=81
		
		for(i=1; i<=9;i++) {
			for(int j=2;j<=9;j++) {
				
				System.out.printf("%dx%d=%d ", j,i, i*j);
			}
			System.out.println();
		}

//		4. 가위, 바위, 보 게임을 만드세요.
//		com에 0~2까지의 랜덤값을 발생시키고
//		(0:가위, 1:바위, 2:보) 0 < 1 < 2 < 0
//		사용자가 가위, 바위, 보를 입력하여
//		com과의 승무패를 출력하세요.
//		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
//		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
//		com=0, 사용자가 바위를 입력하면 => 이겼습니다.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		//int com = ((int) Math.random() * 2);
		int com = rand.nextInt(3);
		System.out.println("가위, 바위, 보를 입력하세요. (0:가위, 1:바위, 2:보)" + com);
		int input = sc.nextInt();
		
		
		if(com==input) {
			System.out.println("비겼습니다.");
		} else if(com > input) {
			if(input==0 && com==2)
				System.out.println("이겼습니다.");
			else
				System.out.println("졌습니다.");
		} else {
			System.out.println("이겼습니다.");
		}
		
		sc.close();
		
	}

}
