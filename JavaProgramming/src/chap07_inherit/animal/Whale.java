package chap07_inherit.animal;

public class Whale extends Animal {
	public String meat;
	public boolean isSwimming;
	public boolean hasPattern;
	public String color;
	
	
	public Whale() {
		
	}
	
	public Whale(String meat, boolean isSwimming, boolean hasPattern, String color, int age,
			int size, int legCnt, boolean hasWing) {
		super(age, size, legCnt, hasWing);
		
		this.age = age;
		this.size = size;
		this.isSwimming = isSwimming;
		this.hasPattern = hasPattern;
		this.color = color;
		
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
		
	}
		
			
		public void swim() {
			if(isSwimming)
				System.out.println("현재 수영중 입니다.");
			else 
				System.out.println("현재 사냥중 입니다.");
		}
		
		
		public void printPattern() {
			if(hasWing)
				System.out.println("이 곰은 날개를 가지고 있습니다.");
			else
				System.out.println("이 곰은 날개를 가지고 있지 않습니다.");
		}
			
		
		
		
	
	

	

}
