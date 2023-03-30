package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------변수--------------------
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.println("성별을 입력하세요: ");
		String sex = sc.next();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + sex);
		

		sc.close();    
	}
	
	

}
