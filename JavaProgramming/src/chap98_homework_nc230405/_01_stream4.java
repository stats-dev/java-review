package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_stream4 {

	public static void main(String[] args) {
//
//4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
//    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		List<Character> charList = new ArrayList<Character>();

		charList.add('a');
		charList.add('B');
		charList.add('c');
		charList.add('D');
		charList.add('e');
		charList.add('F');
		charList.add('g');
		charList.add('H');
		charList.add('i');
		charList.add('J');
		
		

		charList.stream().map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c): Character.toUpperCase(c))
						.forEach(c -> System.out.println(c));
	
		
	}

}
