package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import chap21_stream.clazz.CreditCard;

public class _04_pipeLineEx_kh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CreditCard> cardList = new ArrayList<CreditCard>();
		
		/*
		 * 카카오, 라이언카드, 1000
		 * 삼성카드, 탭탭카드, 2000
		 * 신한카드, 드림카드, 3000
		 * 삼성카드, ID카드, 5000
		 * 현대카드, 더블랙, 100000
		 * 아멕스, 블랙카드, 30000
		 */
		
		//스트림으로 한도가 5000이상인 카드의 회사와 카드이름 출력
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 10000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 30000));
		
		
		Stream<CreditCard> cardStream = cardList.stream();
		
		//방법 1.
//		Stream<CreditCard> filterStream = cardStream.filter(c -> c.getLimitMoney() >= 5000);
//				
//		filterStream.forEach(card -> System.out.println(card.getCompany() + " : " + card.getCardName())); //하나씩 주입할 명칭 하나를 정해야 한다.
//
//		
//		//방법 2.
//		cardList.stream() //CreditCard 객체 여러개가 저장된 스트림
//				//Stream<CreditCard>
//				//List<CreditCard> -> Stream<CreditCard>
//				.filter(card -> 
//						card.getLimitMoney() >= 5000)
//				//Stream<CreditCard> = [{삼성, id, 5000},
////										{현대, 더블랙, 10000},								
////										{아멕스, 블랙, 30000}]
////										
////				
//				.forEach(c -> System.out.println(c.getCompany() + " : " + c.getCardName()));
//		
		
		//map() : 새로운 스트림을 만들어서 리턴. 
		//		  실행코드의 결과값으로 새로운 스트림 생성
		cardList.stream()
				.map(c -> {
					c.setCompany("삼성카드");
					c.setLimitMoney(c.getLimitMoney() + 3000);
					return c;
				})
				.forEach(card -> 
					System.out.println(card.toString()));
		
		List<Integer> intList = 
				new ArrayList<Integer>();
		
		for(int i = 1; i <= 30; i++) {
			intList.add(i);
		}
		
		int sum = intList.stream()
							.reduce((result, num) -> result + num)
							.get();
		
		System.out.println(sum);
		
//		Stream<CreditCard> limitStream = cardStream.filter(card -> card.getLimitMoney() >= 5000);
//		
//		
//		limitStream.forEach(card -> System.out.println(card.getCompany() + ", " + card.getCardName()));
		
//		
//		
//		cardList.stream()
//				   .filter(card -> card.getLimitMoney() >= 5000)
//				   .forEach(card -> System.out.println(card.getCompany() + ", " + card.getCardName()));
//				   
////		삼성카드, ID
//		현대카드, 더블랙
//		아멕스, 블랙카드

		
		
	}

}
