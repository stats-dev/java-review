package chap15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_regex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "010.*-[0-9]{4}.*-[0-9]{4}"; // 내 휴대폰번호 정규식 제작 가능. 0부터 9까지 네자리를 가지고, 마지막도 동일한 패턴. 
		String test = "010-1111-2222"; //테스트
		
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(test); //이렇게 테스트를 매쳐 객체로 만든다.
		
		if(m.matches()) {
			System.out.println("전화번호 양식이 맞았습니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
		
		
		
		

	}

}
