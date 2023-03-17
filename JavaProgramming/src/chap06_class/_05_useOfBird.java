package chap06_class;

import chap06_class.animal.Bird_ans;

public class _05_useOfBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird_ans bird = new Bird_ans("참새", "모이");
		Bird_ans eagle = new Bird_ans("독수리", "뱀");
		Bird_ans dakdulgi = new Bird_ans("닭둘기", "잡식");
		
		
		//메소드 정의 부분
		bird.name = "참새";
		bird.food = "모이";
		
		//메소드 호출 부분: 2번 출력하도록 한다.
		//bird.fly(1, 3, "aa");
		//bird.cry();
		bird.eat();
		eagle.eat();
		dakdulgi.eat();
		
	}

}
