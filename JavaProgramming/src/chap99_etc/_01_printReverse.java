package chap99_etc;

public class _01_printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AbcDeF";
		
		//대소문자 변환된 문자열
		String capStr = ""; // 빈칸으로 초기화해주시고,
		String capStr1 = ""; // 빈칸으로 초기화해주시고,
		
		
		//fEdCBa
		for(int i = 0; i < str.length(); i++) { //변수 길이보다 1 작을때까지 작업
			
			char ch = str.charAt(i); // charAt을 쓰면 문자 하나를 뽑아낼 수 있다.
			// 컴퓨터는 숫자를 0부터 센다고 생각해서, 0부터 5, 길이는 6이 되겠다.
			
			char capCh = ch >= 'A' && ch <= 'Z' ?
					(char) ((int)ch + 32): // 대문자는 소문자로 변경? 32가 차이가 난다.
					(char) ((int)ch - 32); // 소문자는 대문자 변경? 32 빼서 소문자로도 만든다.
					
			
			//capStr = capStr + capCh; 와 같은 의미이다.
			//현재값에서 capCh 더한 값을 다시 저장해주는 것입니다.
			//capStr = a;
			//capStr = a + B; => aB;
			//capStr = aB + C; => aBC;
			//..
			//capStr = aBCdE + f; => aBCdEf
			// 1. 정석
			capStr += capCh;
//			System.out.println(capStr);
//			System.out.println(capCh);

			// 2.역순으로 담기
			//capStr1 = a + "";
			//capStr1 = B + a;
			//capStr1 = C + Ba;
			capStr1 = capCh + capStr1;
			
		}
		
		System.out.println(capStr1);
		
		String rcapStr = "";
		
		//반대로 출력 : 5,4,3,2,1,0
		// i를 5로 잡는다. length 6 - 1 = 5로 잡는다. 이러면 마지막 인덱스를 잡을 수 있다.
		//capStr = "aBCdEf"; -> 이걸 반대로 출력하면 종료..
		for(int i = capStr.length() - 1; i >= 0; i--) {
//			System.out.println(capStr.charAt(i));
			rcapStr += capStr.charAt(i);
		
			
		}
		
		System.out.println(rcapStr);

	}

}
