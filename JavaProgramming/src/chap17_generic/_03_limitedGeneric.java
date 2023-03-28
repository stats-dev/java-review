package chap17_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_limitedGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> lList = new ArrayList<Long>();
		
		for(int i = 0; i < 10; i++) {
			lList.add((long) 5 * i);
		}
		
		System.out.println(_03_limitedGeneric.<Long>sumList(lList));
		
		List<Number> numList = new ArrayList<Number>();
		
		for(int i = 0; i < 10; i++) {
			numList.add((Integer) 5 * i);
		}
		
		System.out.println(_03_limitedGeneric.max(numList));

		System.out.println("----------------");

		
		//Map에서 max 찾기
		Map<String, Integer> map = new HashMap<String, Integer>();
		

		for(int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), //바로 String으로 변환해준 것이다.
					Integer.valueOf((int)(Math.random() * 100) + 1)); //이렇게 랜덤한 값을 넣어준다.
			System.out.println(map.get(String.valueOf(i)));
		}
		
		
		System.out.println(_03_limitedGeneric.maxKey(map)); //키 값의 최대값을 출력한다.
		
		
		
		
	}

	
	//리스트를 받아서 리스트 요소의 합계를 리턴
	//Number를 상속받아서, integer, long, double같은 클래스만 타입으로 가능하게 제한했다.
	public static <T extends Number> double 
	sumList(List<T> tList) { //타입의 리스트를 가져온다.
		//Number를 상속받은 것만 타입으로 지정하도록 제한을 걸 수 있다.
		double sum = 0.0;
		
		
		for(T t : tList) {
			sum += t.doubleValue(); // double 형태로 바꿔서 합한다.
		}
		
		return sum;
		
	}
	
	
	//와일드카드는 매개변수로만 사용가능하다.
	public static int max(List<? super Integer> list) { //와일드카드는 타입은 안되는 듯하다. Integer로 상속받게 한다.
		//와일드카드는 상속!
		//이렇게 해주면, Number 클래스 등 조상들은 다 사용 가능하다.
		int max = (int) list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if((int) list.get(i) > max) { //max보다 커지면 그걸 변경시켜줄 수 있음.
				max = (int)list.get(i);
			}
		}
		
		
		return max;	
		
	}
	
	public static <K, V extends Number> //double float long integer 같은 클래스만 받는다.
				int sumMapValue(Map<K, V> map) { // 타입 다 지정해줘야합니다. 뒤에서는 extends 안해도 됩니다.
		
		int sum = 0;
		
		for(V v : map.values()) { //v 타입에 넣어주고, 이걸 하나씩 더하게 한다.
			sum += (int) v;
			
		}
		
		return sum;
		
	}
	
	
	//Map의 value의 맥스값을 찾고 해당 키값을 리턴하는 메소드
	public static <K, V extends Number> K maxKey(Map<K, V> map) { //K 키값을 리턴형으로 받겠다.
		//map의 형태
		/*
		 * 
		 * 
		 * {
		 * 	"a" : 1,
		 *  "b" : 2,
		 *  "c" : 3
		 *    ...
		 *  }  
		 *   여기서 하나의 Entry<K, V> 꺼내면 
		 *   "a" : 1 꺼내오는 것이 Entry입니다. 
		 * 	map.entrySet()
		 * => {
		 * 
		 * 			{a: 1},
		 * 			{b: 2}
		 * 
		 * 
		 * 		}
		 * 
		 */
		
		
		
		K maxkey = null;
		V maxval = null;
		
		int index = 0; //Set<Entry<K, V>> : Set에 Entry가 담겨있는 형태이다. 
		
		//향상된 for문으로 하나씩 꺼낼 수 있다. Iteratr 없이도 가능하다.
		for(Entry<K, V> ent : map.entrySet()) { // set에 엔트리 하나씩
			
			if(index == 0) { //처음 들어오면 비교할 거 없으니 바로 key value 넣어준다.
				maxkey = ent.getKey();
				maxval = ent.getValue();
				
			} else {
				if(ent.getValue().doubleValue() > maxval.doubleValue()) {
					maxkey = ent.getKey();
					maxval = ent.getValue(); //현재값 반환
				}
			}
			
			index++;	//요거 때문에 다음에는 else 문을 만나게 된다.		
		}
		
		
		return maxkey; //Key를 반환. 가장 큰 값 가진 키를 보여준다.
		
		
	}
	
	public int add(List<?> inList) { //이렇게 와일드카드 넣어주면 끝.
		return 1;
	}
	
//	public int add(List<Long> loList) {
//		return 2; //매개변수 타입은 리스트입니다! 그래서 오버로딩안되고 에러가 발생함. 이럴때 와일드카드를 사용하면 좋다.
//	}
	
//	//제네릭
//	public <T> T getT(List<? extends T> list) { //이렇게 T를 상속받은 리스트로 지정해주는 메소드를 만들 수 있다?
//		return 1;
//	}
	
	
	
}
