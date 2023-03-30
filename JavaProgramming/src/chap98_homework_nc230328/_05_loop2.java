package chap98_homework_nc230328;


public class _05_loop2 {

	public static void main(String[] args) {

//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력

		int sum2 = 2;
		String str2 = "2";
		for(int i = 1; i <= 10; i++) {
			sum2 *= 2;
			str2 += " * 2";
			System.out.print(str2);
			System.out.printf(" = %d \n", sum2);
		}
		
		
	}
}
