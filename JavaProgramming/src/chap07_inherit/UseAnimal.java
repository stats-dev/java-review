package chap07_inherit;

import chap07_inherit.animal.Animal;
import chap07_inherit.animal.Whale;

public class UseAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		
		Whale whale = new Whale();
		
		whale.age = 15;
		whale.size = 100;
		whale.legCnt = 0;
		whale.color = "pink";
		
		whale.printPattern();
		
		
		
		
		
		
		

	}

}
