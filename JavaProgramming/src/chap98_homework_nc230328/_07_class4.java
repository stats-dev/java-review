package chap98_homework_nc230328;


public class _07_class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
		
		System.out.println(mulTwodec(3, 2.1443));
		

	}
	
	public static double mulTwodec(int a, double b) {
//		double result;
//		result = ;
		
		return Math.round((b * a) * 100) / 100.0; // 나눌때는 .0을 붙여줘야 합니다.ㅠㅠ		
	}

}
