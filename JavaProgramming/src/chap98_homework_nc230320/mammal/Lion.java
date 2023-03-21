package chap98_homework_nc230320.mammal;

public class Lion extends Cat{
	Lion(String race) {
		//super(race);
		super("사자");
	}
	
	public void hunt() {
		System.out.println(this.race + "는(은) 사냥을 합니다.");
	}
}
