package chap98_homework_nc230328;


public class _07_class3 {

	public static void main(String[] args) {
//3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
		
		
		System.out.println(twoStr("나는 ", "사람이다."));

	}
	
	public static String twoStr(String a, String b) {
		String newStr;
		
		newStr = a + b;
		
		return newStr;
	}
	

}
