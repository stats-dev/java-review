package chap06_class.animal;

public class Bird_ans {
	
	//멤버변수
	public int wing;
	public String color;
	public String name;
	public int size;
	public String food;
	
	
	public Bird_ans(String name) {
		this.name = name;
	}
	
	public Bird_ans(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	
	//괄호 안에는 매개변수가 들어간다.
	public void fly(int num, int num2, String str) { //매개변수 타입과 개수 정의 -> 호출할때는 변수만 넣어도 된다. 초기화 된경우.
		// 호출할 때는 맞춰주는게 좋다.
		for(int i = 0; i < num; i++)
			System.out.println(name + "는 날개를 이용하여 납니다.");
	}
	
	public void cry() {
		System.out.println(name + "는 나무에 앉아 웁니다.");
	}
	
	public void walk() {
		System.out.println(name + "는 땅을 걷는다.");
	}

	public void eat() {
		System.out.println(name + "는 " + food + "를 먹는다.");
	}

	
}
