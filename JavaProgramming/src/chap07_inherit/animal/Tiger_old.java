package chap07_inherit.animal;

public class Tiger_old {
	public String meat;
	public boolean swimming;
	public boolean hasPattern;
	public String color;
	
	public void eat() {
		System.out.println(meat + "를 먹는다.");
		
	}
	
	
	public void swim() {
		if(swimming)
			System.out.println("현재 수영중 입니다.");
		else 
			System.err.println("현재 사냥중 입니다.");
	}
	
	
	public void printPattern() {
		if(hasPattern)
			System.out.println("이 호랑이는 무늬를 가지고 있습니다.");
		else
			System.out.println("이 호랑이는 무늬를 가지고 있지 않습니다.");
		
	}

}
