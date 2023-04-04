package chap98_homework_nc230403.clazz;

public class ElseIfCla extends IfCla{

//--------------------상속--------------------
//1. 위에서 선언한 IfCla와 ElseCla를 상속받는 ElseIfCla 클래스를 선언하고 makeIf(int num)을 오버라이드하여 사용자가 입력한 숫자가 5보다 큰지 비교하여 
//     5보다 크면 "5보다 큽니다."를 출력하고 makeElseIf(int num)이라는 메소드를 새로 만들어서 사용자가 입력한 숫자가 5와 같은지 비교하여 같으면 "5입니다."를 출력하고
//     makeElse(int num)을 오버라이드 하여 "5보다 작습니다."를 출력하세요.
	@Override
	public void makeIf(int num) {
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}
	}

	
	public void makeElseIf(int num) {
		if(num == 5) {
			System.out.println("5입니다.");
		} else {
					
		}
	}

	
	
	
}
