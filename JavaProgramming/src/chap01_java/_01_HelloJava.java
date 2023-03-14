package chap01_java;

public class _01_HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System : 현재 사용중인 운영체제
		// out : 운영체제에서 사용중인 출력장치 (모니터)
		// println() : 괄호안의 내용을 출력한다. 출력한 후 라인을 변경해라.
		// 		다음 명령은 다음줄부터 표출됩니다.
		// 		ln => line의 약자입니다.
		// print() : 내용 출력후 줄바꿈 없음.
		// printf() : 형식 지정 출력 방식 ex) %d 정수
		// 형식 : %d => 정수, %f => 실수, %c => character, 문자 하나, %n => 줄바꿈
		// 			숫자 붙이면 자리수 제한도 가능(잘 안쓴다.)
		System.out.println("Hello Java");
		System.out.printf("%d %n %f %n %c", 
				1, 3.14, 'H');
		// 각각 1, 3.14 H가 담겨서 출력하게 됩니다.
		// 실행 : ctrl + f11 혹은 Run as Java
		// 컴파이러가 동작함 -> bin 폴더 안에 class 파일이 생성된 걸 확인할 수 있다.

	}

}
