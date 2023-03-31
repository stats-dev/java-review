package chap98_homework_nc230328;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _09_collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> food = new HashMap<String, Integer>();
		
		food.put("칼국수", 5000);
		food.put("비빔밥", 9000);
		food.put("빈대떡", 10000);
		
		System.out.println("음식의 이름과 수량을 입력하세요.");
		String foodName = sc.next();
		int amount = sc.nextInt();
		
		System.out.println("최종금액: " + food.get(foodName) * amount);
		
		sc.close();

	}

}
