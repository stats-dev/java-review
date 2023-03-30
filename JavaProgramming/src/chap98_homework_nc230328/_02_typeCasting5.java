package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.

		Scanner sc = new Scanner(System.in);
		int iNum = 10;
		long lNum = 20;
		
		System.out.println(iNum +"," + lNum);
		
		long iNum_copy = lNum;
		lNum = iNum;
		iNum = (int) iNum_copy;
		System.out.println(iNum +"," + lNum);

		sc.close();

	}

}
