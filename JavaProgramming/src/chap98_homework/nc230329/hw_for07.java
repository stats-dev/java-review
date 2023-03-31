package chap98_homework.nc230329;

import java.util.Scanner;

public class hw_for07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//삼항연산자로도 해결 가능. 최소공배수
		int min = num1 > num2 ? num2 : num1;
		
		int gcd = 1; //결국 gcd는 아무도 나눠떨어지지 않으면 1이 되므로!
		
		
		for(int i = 1; i < min; i++) { // i가 0이면 분모 zero 오류가 뜬다!
			//min까지 계속 실행하면, 최소공배수 도달 가능
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i; //마지막에 담기는게 최대공약수이다.
			}
		}
		
		
		//공식대로 두 수의 곱을 최대공약수로 나눠주면, 그게 최소공배수이다.
		int lcm = num1 * num2 / gcd; 
		
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + lcm);
		
		sc.close();

	}

}
