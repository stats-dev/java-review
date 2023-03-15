package chap04_controlstatement;

import java.util.Scanner;

public class _06_infiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 객체를 사용한다.
		Scanner sc = new Scanner(System.in); // System.in 키보드 입력장치 값을 받는다. 
		// Tip: ctrl + shift + o 자동으로 필요한 라이브러리 호출한다.
		//스캐너를 사용할 때
		//next 메소드를 혼용하여 사용하는 것은 좋지 않다.
		//nextInt, nextLine 이렇게 사용하면 형도 바뀌고 안좋다.
		//하나의 next메소드만 사용하여 형변환을 해주는 것이 낫다.
		while (true) {
			System.out.print("1은 종료. 나머지는 계속 반복 : ");
			String inputStr = sc.nextLine(); // next 시리즈가 여러가지 있다. 다음에 올 것을 쓴다.
			
			if(inputStr.equals("1")) {
				break;
			}
			
			
			System.out.println(inputStr); // 1이 아닐 때는 그냥 출력해본다.
		}
		
		
		

	}

}
