package chap07_inherit.animal;

public class Bear extends Animal {
	String honey;
	String hasPattern;
	boolean isSwimming;
	boolean toenail;
	
	
	
	public Bear() {
		
	}
	
	public Bear(String honey, String hasPattern, boolean isSwimming, boolean toenail,
			int age, int size, int legCnt, boolean hasWing) {
		
		super(age, size, legCnt, hasWing);
		
		this.honey = honey;
		this.hasPattern = hasPattern;
		this.isSwimming = isSwimming;
		this.toenail = toenail;

		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
				
		
	}
	
	public void eat() {
		System.out.println(honey + "를 먹는다.");
		
	}
	
	
	public void swim() {
		if(isSwimming)
			System.out.println("현재 수영중 입니다.");
		else 
			System.err.println("현재 사냥중 입니다.");
	}
	
	
	public void printPattern() {
		if(hasWing)
			System.out.println("이 곰은 날개를 가지고 있습니다.");
		else
			System.out.println("이 곰은 날개를 가지고 있지 않습니다.");
	}
		
	
	
	

}
