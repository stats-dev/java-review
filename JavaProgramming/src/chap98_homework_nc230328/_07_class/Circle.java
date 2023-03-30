package chap98_homework_nc230328._07_class;

public class Circle {
//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 
	//생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
	public int radius;

	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
		// (넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
	}
	
	public double calArea() {
		double area = 2 * 3.14 * radius;
		return area;
	}

	public double calCircum() {
		double circum = 4 * 3.14 * radius;
		return circum;
	}

	

}

