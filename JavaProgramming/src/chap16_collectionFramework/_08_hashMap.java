package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import chap06_class.car.Car;

public class _08_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> carMap = new HashMap<String, String>();
		
		//key, value의 쌍 저장
		carMap.put("company", "현대");
		carMap.put("model", "소나타");
		carMap.put("color", "검정색");
		carMap.put("price", "4000");
		
		System.out.println(carMap);
		
		
		//Map에 어떤 데이터가 들어있는지 확인할 대
		//Entry의 Set을 생성하고 Iterator를 꺼내서 Key, Value를 하나씩 확인한다.
		Set<Entry<String, String>> carSet = carMap.entrySet(); // Set 내부에 있는 Entry를 먼저 선언한다.
		
//		System.out.println(carSet);
		
		//Set 내부 확인
		Iterator<Entry<String, String>> it = carSet.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = it.next(); //새로 선언만 해주면 펴니
			System.out.println(ent.getKey()); //key
			System.out.println(ent.getValue()); // value 모두 확인하는 방법
			
		}
		
		//value의 형태를 Object로 지정하면 어떤 형태의 데이터도 받을 수 있다.
		Map<String, Object> objMap = new HashMap<String, Object>();
		
		List<Car> carList = new ArrayList<Car>(); //carList
		
		for(int i = 0; i < 5; i++) {
			Car car = 
					new Car("현대", "소나타20" + (10 + i),
							"검정", 3000);
			carList.add(car);
		}
		
		objMap.put("carList", carList);
		
		/*
		 * list<objMap> : [
		 * 					{
		 * 				carList : [
		 * 							car : {
		 * 
		 * 
		 * 
		 * 								   }
		 * 							car : {
		 * 
		 * 
		 * 
		 * 
		 * 								  }		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 							]
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 			 },
		 * 			 {
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 			},
		 * 			]
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		

	}

}
