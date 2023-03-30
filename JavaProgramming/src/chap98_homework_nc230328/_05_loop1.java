package chap98_homework_nc230328;


public class _05_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		-------------------반복문--------------------
//		1. 1부터 10까지의 정수의 합을 출력하세요.

		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.println("1부터 10까지의 정수의 합은 " + sum1 + "입니다.");
		

	}
}
