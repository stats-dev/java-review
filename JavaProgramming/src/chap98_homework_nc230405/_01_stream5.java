package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_stream5 {

	public static void main(String[] args) {
//
//5. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
//    문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
    
		List<String> strList = new ArrayList<String>();
		
        strList.add("Hello, World!");
        strList.add("안녕하세요");
        strList.add("Java8");
        strList.add("스트림");
        strList.add("Python");
        strList.add("1234");
        strList.add("ABC");
        strList.add("$$$");
        strList.add("C++");
        strList.add("JavaScript");
		
		
		Stream<Object> strStream = strList.stream().map(c -> c.matches(".*[a-zA-Z]+.*") ? c : "");
		
		strStream.forEach(c -> System.out.println(c));


		
	}

}
