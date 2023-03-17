package chap06_class.animal;

public class Bird {
	
	//속성 정리
	//날개(int wing),
	//색깔(String color),
	//새이름(String name),
	//크기(int size),
	//식습관(String food)

	public int wing;
	public String color;
	public String name;
	public int size;
	public String food;
	

	//날다(void fly)
	//독수리(name)는 날개를 이용하여 하늘을 납니다.
	public void fly(String a, String b) {
		System.out.println(a + "는 날개를 이용하여 하늘을 날고 " + b + "를 먹는다.");
	}
	
	
	
	//운다(void cry), 
	//독수리는 나무에 앉아 웁니다.
	public void cry() {
		System.out.println(name + "는 나무에 앉아 웁니다.");
	}
	
	
	//걷는다(void walk),
	//독수리는 땅을 걷는다.
	public void walk() {
		System.out.println(name + "는 땅을 걷는다.");
	}
	
	//먹이를 먹는다(void eat),
	//독수리는 고기(food)를 먹는다.
	public void eat() {
		System.out.println(name + "는 " + food + "를 먹는다.");
	}
	
	
	public static void main(String[] args) {
		// 부품 선언
		Bird bird = new Bird();
		
		//입력
		bird.name = "독수리";
		bird.food = "고기";
		
		//출력함수 호출
		bird.fly("독수리","고기");
		bird.cry();
		bird.walk();
		bird.eat();
	}
	
}
