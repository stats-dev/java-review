package chap02_variables;

public class _08_varVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. var 변수 선언 및 초기화
		// var 변수는 항상 선언과 동시에 초기화가 진행돼야 함.
		var str = "Hello";
		// 선언만 하고 초기화 안해주면 에러가 발생한다.
		//var str2;
		
		//str은 자료형 추론에 의해 String 타입으로 결정이 나있는 상태
		//자료형 추론이 끝난 변수에 다른 타입의 값을 저장하면 에러 발생
		//str = 100; // String 추론 끝나서 int 넣으면 에러
		
		// 연산 결과의 자료형을 확신할 수 없을 때 var 변수를 사용하면,
		// 결과값에 따라 자료형이 결정되기 때문에
		// 자료형을 직접 지정하는 것보다 var변수를 사용하는 것이 낫다.
		// 정확한 값을 알고프면 써볼만하다.
		
//		var tesq1 = 3.14159234234 + 1;
//		System.out.println(tesq1);

	}

}
