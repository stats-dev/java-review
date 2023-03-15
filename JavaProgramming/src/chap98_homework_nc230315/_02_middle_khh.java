package chap98_homework_nc230315;

public class _02_middle_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항조건 연산자 A ? B : C; 
		// A가 true일 경우 B가 실행, A가 false일 경우 C가 실행
		int age = 29;
		
		
//		// 1. 삼항 조건 연산자를 이용하여 int age = 29; 일 경우 20대 안이면,
//	    20대입니다. 를 출력하고 age가 일 경우 
//	    20대가 아닙니다.를 출력하세요.
		String condition = (age >= 20 && age < 30) ? "20대입니다." : 
			age >= 30 ? "20대가 아닙니다." : "잘못 입력했습니다." ;
		
		System.out.println(condition);
			

		
//		2. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			}
		}
//		20대입니다.
//		6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90, 96, 		

	}

}
