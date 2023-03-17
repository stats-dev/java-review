package chap07_inherit.car;

public class HyundaiCarInherit extends Car{

	// extends : 상속을 의미한다.
	// 부모클래스와 콩통된 부분 제거.
	public void speedUp() {
		System.out.println("스피드 업");
	}
	
	public void speedDown() {
		System.out.println("스피드 다운");
	}
	
}
