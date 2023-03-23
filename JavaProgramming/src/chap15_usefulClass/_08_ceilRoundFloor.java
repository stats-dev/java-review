package chap15_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 123.45678;
		
		System.out.println(Math.ceil(num)); // 무조건 정수로 올림.
		System.out.println((double)Math.round(num));
		System.out.println(Math.floor(num));
		
		// 소수점 두자리까지 지정하고 싶다면? 반환타입이 long임에 유의하라!
		System.out.println((double)Math.round(num * 100) / 100); //이러면 소수점 두자리 되겠지?
		System.out.println((double)Math.round(num * 1000) / 1000); //이러면 소수점 세자리 되겠지?
		// round는 long으로 나와서 double로 지정해줘야 제대로 나온다!
		

	}

}
