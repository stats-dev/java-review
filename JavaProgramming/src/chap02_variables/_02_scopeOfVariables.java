package chap02_variables;

public class _02_scopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 지역 변수
		// 메인 메소드의 지역 변수, 메인 메소드에서만 사용이 가능하다.
		int mainNum = 10;
		int sum = 0;
		
		
		if(sum==0) {
			int ifNum = 20;
			sum = mainNum + ifNum; // ifNum은 if 중괄호 안에서만 사용 가능
		} else {
//			ifNum = 30; // 이거는 못쓴다.
			// if{} 이 끝나서 if문으 ㅣ지역변수인
			// ifNum이 사라져서 ifNum 재선언 할 수 있다!!
			int ifNum = 30; // 다른 중괄호에서 재선언이 가능하다!!
			sum = mainNum + ifNum;
		}
		// if {}, else {} 블록 밖에서
		// ifNum을 사용하면 없는 변수로 인식하여 에러 발생 - 로컬 변수의 함저잉다.
//		System.out.println(ifNum); // 블록 밖에서는 없는 변수, 생성안된변수로 취급되어 에러가 뜹니다.
		
		// getSum 메소드 안의 지역변수는
		// getSum 메소드가 호출됐을 때 생성됐다가
		// 메소드 실행이 끝나면 삭제된다.
		getSum();
		
		// 메소드 실행 종료 시점
		// 없는 변수로 인식하여 에러 발생한다.
//		System.out.println(localResult); // 없는 변수로 에러를 보인다.

	}
	
	
	
	// 메소드를 만들어본다.
	public static void getSum() {
		// 메소드 내에서 선언된 변수, 호출했을 때만 존재하게 됩니다.
		int localVal1 = 10;
		int localVal2 = 20;
		int localResult = localVal1 + localVal2;
		
		System.out.println(localResult);
	}
	

}
