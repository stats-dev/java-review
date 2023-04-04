package chap98_homework_nc230403;

import java.util.Random;
import java.util.Scanner;

public class _05_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//	    반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//	    추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
//		int cnt = 0;
		
		Random rand = new Random();
		int rand1 = rand.nextInt(20) + 1;
		
		for(int i = 0; i < rand1; i++) {
			input += "bit";
//			cnt++;
		}
		
		int length = input.length() - input.replace("bit", "").length();
		
		
		System.out.println(input + "\n" + length / 3 + "번 반복했습니다.");
		System.out.println(rand1);
		
		
//		2. 사용자가 입력한 정수의 약수들의 총합을 출력하세요.
		System.out.println("정수를 입력하세요.");
		int inputInt = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= inputInt; i++) {
			if(inputInt % i == 0) {
				sum += i;				
			}
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
