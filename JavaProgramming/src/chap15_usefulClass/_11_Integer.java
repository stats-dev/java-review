package chap15_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer 생성시 자바 9버전부터는 사용불가
//		Integer num1 = new Integer(100);
		
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		//Character
		
		//주소값 비교 같은 객체를 바라보는지 확인
		System.out.println(num1 == num2); // true 주소로 객체를 바라보는지 확인
		//equals 메소드가 오버라이딩되어 있어 값만 비교한다.
		System.out.println(num1.equals(num2)); // Integer에 오버라이드 -> 값만 비교해줍니다!
		
		
		
		//String compareTo와 비교해서 생각하기
		//Integer 같으면 0, 작으면 -1, 크면 1
		System.out.println(num1.compareTo(num2));
		
		//문자열을 정수형으로 변환
		String numStr = "1000";
		int convertNum = Integer.parseInt(numStr); // 문자열 -> 정수형 메소드
		System.out.println(convertNum);
		
		//int의 최대값, 최소값을 상수인 멤버변수로 지정해놔서
		//멤버변수를 호출하면 확인가능하다.
		System.out.println(Integer.MAX_VALUE); // 2147483647 21억까지 가질 수 있음.
		System.out.println(Integer.MIN_VALUE); //상수로 지정. -21억
		
		//문자열로 변환
		String convertStr = num1.toString();
		System.out.println(convertStr.getClass().getName()); // java.lang.String
		System.out.println(convertNum); // 1000
		System.out.println(Integer.valueOf(convertNum).getClass().getName()); // java.lang.Integer
		
		
		//문자열을 정수형으로 변환
//		System.out.println(Integer.parseInt("FF")); // 숫자포맷아니라서 에러 발생
		System.out.println(Integer.parseInt("FF", 16)); // 이건 16진수값 FF를 정수형으로 변환 -> 255
		
		
		
		//사이즈, 바이트, 타입 확인
		System.out.println("size = " + num1.SIZE); // 4 * 8 = 32 바이트
		System.out.println("byte= " + num1.BYTES);
		System.out.println("type = " + num1.TYPE);
		
		

	}

}

