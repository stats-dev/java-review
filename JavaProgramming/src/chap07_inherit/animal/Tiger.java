package chap07_inherit.animal;

public class Tiger extends Animal {
	public String meat;
	public boolean isSwimming;
	public boolean hasPattern;
	public String color;
	
	public Tiger() {
		
	}
	
	public Tiger(String meat, boolean isSwimming, boolean hasPattern, String color, int age, int size,
			int legCnt, boolean hasWing) { 
		
		//부모클래스에 생성자가 있다면?
		//위의 방식보다는 부모클래스의 생성자를 호출하는 게 편하다.
		//부모클래스를 자식클래스에서 사용하는 방법.
		//super라는 키워드를 사용한다.
		//super 자체는 부모클래스를 의미
		//생성자들은 super(); 호출.
		//super(); // 이러면 클래스이다. 괄호치면 생성자로 외우기.
		super(age, size, legCnt, hasWing);
		
		
		//부모의 속성도 매개변수로 가져올 수 있다.
		this.meat = meat;
		this.isSwimming = isSwimming;
		this.hasPattern = hasPattern;
		this.color = color;
		
		//부모의속성 초기화
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
		
		


		
		
	}
}
