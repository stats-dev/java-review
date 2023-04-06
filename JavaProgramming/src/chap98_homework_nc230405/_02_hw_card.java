package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap98_homework_nc230405.clazz1.Card;

public class _02_hw_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Card> cardList = new ArrayList<Card>();

		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 1));
		cardList.add(new Card("c", 0));
		cardList.add(new Card("d", 1));
		cardList.add(new Card("e", 2));
		cardList.add(new Card("f", 5));
		
		
//		Stream<Card> cardStream = cardList.stream();
//		
//		cardStream = cardStream.filter(c -> c.getValidYear() <= 1);
//		
//		
//		//람다식과 스트림을 합쳐보았습니다.
////		//함수형 인터페이스의 구현체를 여기서 만들어주는 것이다!! year자리에 람다식
//		cardStream.forEach(c -> c.validEnlong(3, year -> {
//			System.out.println(year + "년 연장되었습니다.");
//			System.out.println(c.toString());			
//		}));
		

		cardList.stream()
				.filter(c -> c.getValidYear() <= 1)
				.forEach(c -> c.validEnlong(3, year -> {
					System.out.println(c.getCardName() + " : " + year + "년 연장되었습니다.");
					c.setValidYear(c.getValidYear() + year); //이렇게도 가능합
					System.out.println(c.toString());
				}));
		
		
		
		
	}

}
