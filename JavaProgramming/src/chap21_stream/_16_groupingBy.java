package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap21_stream.clazz.CreditCard;

public class _16_groupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. groupingBy메소드로
		// Map<company, List<CreditCard>>로 매핑한다. 회사와 값들로 구성함.
		// collect로 묶어서 리스트로 반환.
		List<CreditCard> cardList = 
				new ArrayList<CreditCard>();
		
		cardList.add(new CreditCard("a", "A", 100));
		cardList.add(new CreditCard("a", "B", 300));
		cardList.add(new CreditCard("a", "C", 600));
		cardList.add(new CreditCard("b", "D", 500));
		cardList.add(new CreditCard("b", "E", 800));
		cardList.add(new CreditCard("c", "F", 200));
		cardList.add(new CreditCard("c", "G", 500));
		
		//1. groupingBy메소드로
		// Map<company, List<CreditCard>>로 매핑한다. 회사와 값들로 구성함.
		Map<String, List<CreditCard>> companyCardMap = 
				cardList.stream()
						.collect(
								Collectors.groupingBy(
										//키를 구하는 메소드 구현하면 끝!! 매우 편리하다.
										card -> card.getCompany()
										)
								);
						

		System.out.println(companyCardMap.toString());
		
		
													
		//2. groupingBy메소드로
		// 	Map<company, average(limitMoney)>
		Map<String, Double> avgLimMoneyMap = 
				cardList.stream()
						.collect(
								Collectors.groupingBy(
										//키를 구하는 메소드 구현
										card -> card.getCompany(),
										//Value를 구하는 메소드 구현
										Collectors.averagingDouble(card -> card.getLimitMoney()) //map형태가 double이어야 합니다.
										)
								);
		
		
		System.out.println(avgLimMoneyMap.toString());
						
		

	} // main method 탭 한칸

} // class 0칸
