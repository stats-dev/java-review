package chap98_homework_nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _09_collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
//    List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
//    출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)

		Map<String, Integer> hyundaiCar = new HashMap<String, Integer>();
		Map<String, Integer> kiaCar = new HashMap<String, Integer>();
		
		hyundaiCar.put("아반떼", 1000);
		hyundaiCar.put("소나타", 10000);
		hyundaiCar.put("그랜저", 5000);
		
		kiaCar.put("k5", 2000);
		kiaCar.put("k7", 4000);
		kiaCar.put("k9", 6000);
		
		List<Map<String, Integer>> carMapList = new ArrayList<Map<String, Integer>>();
		
		carMapList.add(hyundaiCar);
		carMapList.add(kiaCar);
		
		Set<Entry<String, Integer>> carSet = new HashSet<Entry<String, Integer>>();
		Iterator<Entry<String, Integer>> it = carSet.iterator();
		
		String maxCar = null;
		int maxVal = 0;
		

		while(it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			System.out.println(ent.getKey());
			
		}
		System.out.println(carMapList);
		


		
		
	}

}
