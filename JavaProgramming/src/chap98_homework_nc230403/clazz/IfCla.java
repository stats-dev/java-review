package chap98_homework_nc230403.clazz;

import java.util.Scanner;

public class IfCla {
//	--------------------클래스--------------------
//	1. IfCla 라는 클래스를 정의하고 멤버변수로는 ElseCla라는 클래스 타입의 변수를 가지고 있게 구현하고
//	     makeIf(int num)를 만들어서 사용자가 입력한 정수(1 ~ 10)를 매개변수로 받아서 1과 같은지 비교해서 같으면 "정답입니다."를 출력하는 메소드를 구현하고
//	     그 안에서 ElseCla에 존재하는 makeElse(int num) 메소드를 호출하여 1이 아닐때는 "오답입니다"라고 출력하세요.

	Scanner sc = new Scanner(System.in);
	public int num = sc.nextInt();
	ElseCla ec = new ElseCla();
	
	public void makeIf(int num) {
		this.num = num;
		if(num == 1) {
			System.out.println("정답입니다.");
		} else {
			ec.makeElse(num);
		}
		
	}

	
	public class ElseCla {
		public void makeElse(int num) {
			
			System.out.println("오답입니다.");		
		}
	}
	

}
