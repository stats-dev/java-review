package chap98_homework_nc230328;

import chap98_homework_nc230328._07_class.Circle;

public class _07_class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 
		//원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
		Circle ci = new Circle(3);
		
		System.out.println("원의 넓이: " + ci.calArea());
		System.out.println("원의 둘레: " + ci.calCircum());
		
		

		
		

	}

}
