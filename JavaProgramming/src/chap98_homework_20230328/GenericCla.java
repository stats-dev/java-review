package chap98_homework_20230328;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GenericCla<T> {
	
	
	private T t;
//	2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이 들어오던 문자열
//	결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static <T> String add(T t1, T t2) {
		
		String result = t1.toString() + t2.toString();
		
		return result;
	}
	
	//chat GPT
	
//	public static <T> String add(T t1, T t2) {
//	    return String.valueOf(t1) + String.valueOf(t2);
//	}
	
	

//3. public static Integer add(List<?> list) 와일드 카드를 이용한 메소드를 구현하세요.
	public static Integer add(List<?> list) {
	
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			result += (int)list.get(i);
		}
		
		return result;	
		
	}
	
	
	//4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
	public static void printArr(List<?> list) {
		
		for(int i = 0; i < list.size(); i++) {
			if(i % 3 == 0)
				System.out.println(list.get(i));
			
		}
		
	}
	

	//5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
	public static <T extends Number> T getMin(T[] array) {
		
		T min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i].doubleValue() < min.doubleValue()) {
				min = array[i];
			}
		}
		
		return min;
		
	}
	
	
	
//	6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드
//    void printOverTen을 구현하세요.
	
	public static <K,V> void printOverTen(Map<K, V> map) {
		
		int index = 0;
		
		for(Entry<K, V> ent : map.entrySet()) {
			if(ent.getValue().toString().length() >= 10) {
				System.out.println(ent.getKey());
			} else {
				break;
			}
			
		}
		
	}
	

	//Map의 value의 맥스값을 찾고 해당 키값을 리턴하는 메소드
//	public static <K, V extends Number> K maxKey(Map<K, V> map) { //K 키값을 리턴형으로 받겠다.
//		
//		K maxkey = null;
//		V maxval = null;
//		
//		int index = 0; //Set<Entry<K, V>> : Set에 Entry가 담겨있는 형태이다. 
//		
//		//향상된 for문으로 하나씩 꺼낼 수 있다. Iteratr 없이도 가능하다.
//		for(Entry<K, V> ent : map.entrySet()) { // set에 엔트리 하나씩
//			
//			if(index == 0) { //처음 들어오면 비교할 거 없으니 바로 key value 넣어준다.
//				maxkey = ent.getKey();
//				maxval = ent.getValue();
//				
//			} else {
//				if(ent.getValue().doubleValue() > maxval.doubleValue()) {
//					maxkey = ent.getKey();
//					maxval = ent.getValue(); //현재값 반환
//				}
//			}
//			
//			index++;	//요거 때문에 다음에는 else 문을 만나게 된다.		
//		}
//		
//		
//		return maxkey; //Key를 반환. 가장 큰 값 가진 키를 보여준다.
//		
//		
//	}
	

}
