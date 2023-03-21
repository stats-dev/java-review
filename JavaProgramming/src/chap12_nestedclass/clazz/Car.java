package chap12_nestedclass.clazz;

public class Car {
	public void speedUp() {
		// 메소드 안에 지역 중첩 클래스 입니당.
		class Engine {
			int fuelAmount;
			
			public Engine(int fuelAmount) {
				this.fuelAmount = fuelAmount;
			}
			
			public void useFuelAmount() {
				this.fuelAmount -= 10; // 10씩 빠집니당.
			}
			
		}
		
		Engine eg = new Engine(100); // 100만큼 차있다고 선언.
		eg.useFuelAmount(); // 10 빠짐
		
		System.out.println("연료가 " + eg.fuelAmount + "% 남았습니다.");
		
		
		
	}
}
