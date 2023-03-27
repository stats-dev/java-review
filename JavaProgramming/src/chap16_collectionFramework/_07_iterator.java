package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap06_class.car.Car;

public class _07_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, String> map :: 이 친구는 EntrySet을 활용해서 iterator를 만든다.
		List<Car> cList = new ArrayList<Car>();
		
		Car car = new Car("현대", "제네시스", "은색", 5000);
		cList.add(car);
		
		car = new Car("현대", "아반떼", "은색", 3000);
		cList.add(car);
		
		car = new Car("현대", "소나타", "검정색", 4000);
		cList.add(car);
		
		car = new Car("기아", "ev6", "파란색", 4000);
		cList.add(car);
		
		car = new Car("기아", "모하비", "빨간색", 5000);
		cList.add(car);
		System.out.println(cList.size());
		
		//Iterator로 요소들 받아오기
		Iterator<Car> it = cList.iterator(); //java.util.iterator;
		
		while(it.hasNext()) {
//			Car c = (Car)it.next();
			Car c = it.next();
			c.carInfo();	// 출력은 다 함.
			if(c.company.equals("현대"))
				it.remove();
		}
		
		//삭제 후 크기도 다시 확인해보기.
		System.out.println(cList.size());
		
		
		ListIterator<Car> lit = cList.listIterator();
		lit.next();
		
		while(lit.hasPrevious()) { // prev로 3가지 다 맞춰줘야 한다.
			lit.previous();
			
			Car c = new Car("쉐보레","카마로","노란색", 4000);
			
			lit.set(c);
//			if(lit.previousIndex() == 1) { //1일때만해서 바뀌지 않게 함.
//			}
		}
		
		for(Car c: cList) {
			c.carInfo();
		}

	}

}
