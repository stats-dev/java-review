package chap98_homework_nc230314;

public class _03_advanced_khs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 삼항 조건 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
		String str = "dBEfIZ";
		String rstr = "";
//		String ans = "";
		
		// DbeFiz 대문자 변경
		for (int i=0;i < str.length();i++) {
			
			char chr = str.charAt(i);
			
			char capCh = (chr == 90) ? 97 : (chr >= 'A' && chr <= 'Z') ? (char) (chr + 33) : (char)(chr - 33);
			
		// ziFebD 순서 반대로 입력
			rstr = capCh + rstr;
					
		}
		
		System.out.println(rstr); // ziFebD

		
		
		// ZIfEBd
		// ziFebD
		// DziFeb ajEfcC
		// asciiCode를 응용해보자.
//		
//		for (int i=0; i < rstr.length(); i++) {
//			
//			char rchr = rstr.charAt(i);
//			char capCh1 = rchr == 122 ?
//					(char) ((int)rchr - 25):
//				rchr == 'i' || rchr == 'e' || rchr == 'b'  ?
//					(char) ((int)rchr + 1):
//					(char) ((int)rchr - 1);
//		
//			
//			ans += capCh1;
//					
//	}
//		
//		System.out.println(ans); // ajEfcC
//
//
		
//		System.out.println('z' - 'a'); // 25 
//		System.out.println('i' - 'j'); // -1
//		System.out.println('F' - 'E'); // 1
//		System.out.println('e' - 'f'); // -1
//		System.out.println('b' - 'c'); // -1
//		System.out.println('D' - 'C'); // 1
		

		
	}

}




