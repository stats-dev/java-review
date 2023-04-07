package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap21_stream.clazz.CreditCard;

public class _15_collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// collect로 수집후 리스트로 변환
		List<CreditCard> cardList = 
				new ArrayList<CreditCard>();
		
		cardList.add(new CreditCard("a", "A", 100));
		cardList.add(new CreditCard("a", "B", 300));
		cardList.add(new CreditCard("a", "C", 600));
		cardList.add(new CreditCard("b", "D", 500));
		cardList.add(new CreditCard("b", "E", 800));
		cardList.add(new CreditCard("c", "F", 900));
		cardList.add(new CreditCard("c", "G", 500));
		
		//1. 특정 카드사의 카드만 뽑아서 collect로 수집 후 리스트로 변환
		//카드리스트 받아줄 리스트 제작
		//a 카드사의 카드만 뽑는 방법들, 리스트를 활용해서 한방에 출력.
		List<CreditCard> aCompanyCardList = cardList.stream()
													.filter(card -> 
													card.getCompany().equals("a"))
													.collect(Collectors.toList());
		
		System.out.println(aCompanyCardList.toString());
		
		//기존 방법이라면 복잡함. 위처럼 편하게 리스트 변환이 가능하다!!
//		for(CreditCard c : cardList) {
//			if(c.getCardName().equals("a")) {
//				aCompanyCardList.add(c);
//			}
//		}
							
		
		//2. Map<cardname, limitmoney> 들어갈 수 있게 맵으로 변환한다.
		Map<String, Integer> cardMap = cardList.stream()
												.collect(
														Collectors.toMap(
																//여기는 중괄호 없이도 잘 작동하는데, 키와 값만 적었기 때문이라 생각한다.
																//키 입력
																card -> card.getCardName(),
																//값 입력
																card -> card.getLimitMoney())
														);
		
		System.out.println(cardMap.toString());
		
		//500 이상 한도인 친구들만 뽑을 수 있습니다. filter를 건다.
		cardMap = cardList.stream()
				.filter(card -> card.getLimitMoney() >= 500)
				.collect(
						Collectors.toMap(
								//여기는 중괄호 없이도 잘 작동하는데, 키와 값만 적었기 때문이라 생각한다.
								//키 입력
								card -> card.getCardName(),
								//값 입력
								card -> card.getLimitMoney())
						);
		
		System.out.println(cardMap.toString());
		
													
		

	}

}
