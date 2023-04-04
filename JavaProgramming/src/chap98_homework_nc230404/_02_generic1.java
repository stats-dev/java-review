package chap98_homework_nc230404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _02_generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------제네릭--------------------
//		1. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
//		   매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 50; i<= 60; i++) {
				map.put(i, i-35);
		}
		

        List<Entry<Integer, Integer>> overHundred = getOverHundr(map);
        for (Entry<Integer, Integer> entry : overHundred) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
		
		
		
		public static List<Entry<Integer, Integer>> getOverHundr(Map<Integer, Integer> map) {
			List<Entry<Integer, Integer>> result = new ArrayList<>();
			for(Entry<Integer, Integer> ent : map.entrySet()) {
				int mul = ent.getKey() * ent.getValue();
				if(mul > 1000) {
					result.add(ent);
				}
			}
			return result;
		
		}


}


