package chap15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _14_regex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[a-zA-Z0-9]{8,20} a~z, A~Z, 0~9의 조합 8~20자리까지
		//[.문자] : .뒤의 문자를 하나이상 포함
		//@[a-zA-Z0-9.-] .하나 이상을 포함하는 a~z, A~Z, 0~9의 조합
		//\.[a-zA-Z]{2,} .+ a~z, A~Z의 조합, 두 자리이상 (닷넷, 닷컴 등)
//		String pattern = "[a-zA-Z0-9]{8,20}+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		String pattern = "[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
				//@는 무조건 나와야할 문자열 .이 한개이상 문자열이 포함되면 - (하이푼)쓴다.
				//그다음은 두자리 이상{2,} 문자열 나오도록 합니다.
		String email = "제 이메일주소는 aaa12345@b-bb.ccc 입니다.";
		
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(email);
//		BigInteger
		//find() : pattern과 일치하는 경우 true, false -> true가 되면 반환한다.
 		while(m.find()) {
			System.out.println("이메일 주소 : " + m.group()); // 패턴에서 찾은 일치하는 구역만 리턴하는 것. 
			//group() : find()로 찾은 일치부분을 리턴.
		}
 		
		//전체문자열이 패턴이랑 일치하는지 검사해주는. matches()
		if(m.matches()) {
			System.out.println("올바른 형식입니다.");
		} else {
			System.out.println("잘못된 형식입니다.");
		}
		
		

	}

}
