package chap04_controlstatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "A";
		
		switch(grade) {
			case "A":
				System.out.println("점수는 90점이상입니다.");
				break; // 일치하는 조건을 만나면 switch 문 종료
			case "B":
				System.out.println("점수는 90점 미만 80점이상입니다.");
				break;
			case "C":
				System.out.println("점수는 80점 미만 70점이상입니다.");
				break;
				
			default:
				System.out.println("점수는 70점미만입니다.");
				break;
			
				
				
		}
		/*
		 * break 문을 빼게되면, 그 밑에 모든 함수가 다 실행된다. 따라서, break 넣어서 switch 문 종료필요 점수는 90점 미만
		 * 80점이상입니다. 점수는 80점 미만 70점이상입니다. 점수는 70점미만입니다.
		 */

	}

}
