package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import chap98_homework_nc230405.clazz.Card;

public class _01_stream6 {

	public static void main(String[] args) {

//		6번 ~ 13번까지 한 문제
//
//
//		9. 메인메소드에서 Card의 List를 생성하고 {"a", 3}, {"b", 1}, {"c", 0}, {"d", 1}, {"e", 2}, {"f", 5} 같은 데이터를 저장합니다.
//
		
		List<Card> cardList = new ArrayList<Card>();
		
	
		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 1));
		cardList.add(new Card("c", 0));
		cardList.add(new Card("d", 1));
		cardList.add(new Card("e", 2));
		cardList.add(new Card("f", 5));
		
		
		
		
//		10. cardList를 스트림으로 변경하고 유효기간이 1년 이하인 카드들만 저장된 스트림을 만듭니다.
//
		Stream<Card> cardStream = cardList.stream().filter(c -> c.getValidYear() <= 1);
		
		
//		11. 위에서 만든 스트림에서 validEnlong호출해서 3년씩 연장된 새로운 스트림을 만들고 "3년 연장되었습니다"라는 문구를 출력하세요.
		
//		Stream<Card> enlongStream = cardStream.map(c -> {c.validEnlong(3, c.getValidYear());
//															
//															return c;
//														});
//		
//		enlongStream.forEach(c -> System.out.println("3년 연장되었습니다."));
//		
////
//		12. 연장된 카드들의 정보를 "c카드의 유효기간은 3년입니다."라고 출력하세요.
//
//		enlongStream.forEach(c -> System.out.println(c.getCardName() + "카드의 유효기간은 3년입니다."));
		
		
		
//		13. 위에서 스트림을 사용한 것을 체이닝 기법으로 변경하세요.


		
	}

}
