package chap98_homework_nc230404;

import java.util.Scanner;

import chap98_homework_nc230404.enums.Months;

public class _01_enum3 {
//	3. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 사용자가 년도를 입력하면 
//  해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		Months ms = Months.APR; //이건 랜덤하게 한다.
		ms.sumDays(year);
		
		
		sc.close();
		
	}
		

}
