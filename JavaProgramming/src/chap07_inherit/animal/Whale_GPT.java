package chap07_inherit.animal;

public class Whale_GPT extends Animal {
    // 속성
    public String food;
    public String habitat;
    public String species;
    public int teeth;
    public boolean hasOffspring;

//    // 기능
//    public void sprayWater() {
//        System.out.println("Spraying water...");
//    }
//
//    public void moveInHerd() {
//        System.out.println("Moving in herd...");
//    }
    
    public Whale_GPT() {
    	
    } // 신기하게 저 위의 클래스와 동일한 이름이어야 반환타입 없이 생성이 가능합니다.

    // 생성자
    public Whale_GPT(int age, int size, int legCnt, boolean hasWing, //이걸 부모클래스에서 호출하려면 받아와야합니다.
    		String food, String habitat, String species, int teeth, boolean hasOffspring) {
    	
    	super(age, size, legCnt, hasWing);
    	
    	
        this.food = food;
        this.habitat = habitat;
        this.species = species;
        this.teeth = teeth;
        this.hasOffspring = hasOffspring;
        
        
    }

  
}

