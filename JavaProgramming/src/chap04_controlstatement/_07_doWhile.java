package chap04_controlstatement;

public class _07_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do{} 블록의 소스코드는 무조건 1ㅚ 실행
		//조건식이 true면 다시 반복 실행
		do {
			System.out.println("무조건 1회 실행");
		} while(1 < 0); // 조건을 false로 둬도, 무조건 실행
		
		
		int i = 1;
		
		do {
			if(i % 3 == 0) // 한번 더 조건을 걸 수도 있다!! 20가지 중 3의 배수만 구해볼 수 있음.
				System.out.println(i); // 1은 무조건 한번 찍히고, 그 뒤로 증감연사자 수행.
		} while(++i <= 20); // 조건이 true라면 다시 반복실행됩니다!!

	}

}
