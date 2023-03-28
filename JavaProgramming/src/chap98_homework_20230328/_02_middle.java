package chap98_homework_20230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		_02_middle.printKVDesc(map);
	}
	
	
//	
//	1. key와 value 모두 Number를 상속받은 클래스의 타입을 가지고 key, value의 곱이 가장 큰
//    Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	
	public static <K extends Number, V extends Number> Map.Entry<K, V> getMaxMul(Map<K, V> map) {
	    if (map == null || map.isEmpty()) {
	        return null;
	    }

	    Map.Entry<K, V> maxEntry = null;
	    for (Map.Entry<K, V> entry : map.entrySet()) {
	    	
	        if (maxEntry == null ||
	        		entry.getKey().doubleValue() * entry.getValue().doubleValue() > maxEntry.getKey().doubleValue() * maxEntry.getValue().doubleValue()) {
	            maxEntry = entry;
	        }
	    }
	    
	    return maxEntry;
	}

	
//	2. Map을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 제네릭 메소드를
//	   구현하세요.
	
	public static <K, V> void printKVDesc(Map<K,V> map) {
		
		for(Entry<K, V> ent : map.entrySet()) {
			System.out.print(ent.getKey() + " ");
		}
		
		List<?> listVal = new ArrayList<>(map.values());
		
		for(int i = 0; i < listVal.size(); i++) {
			System.out.print(listVal.get(listVal.size() - i -1) + " ");
		}
		
		
//		3.  T 배열을 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 Calculator 제네릭 클래스를 구현하세요.
//	    각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
//	    (Math.round()로 소수점 두자리까지만 표출)
		Integer[] nums = {2, 3, 4};
		Calculator<Integer> calculator = new Calculator<>(nums);
		System.out.println(calculator.add()); // 9.0
		System.out.println(calculator.sub()); // -5.0
		System.out.println(calculator.mul()); // 24.0
		System.out.println(calculator.div()); // 0.17

		
		
	}
	

}
