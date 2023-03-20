package chap08_static.clazz;

public class Weight {
	public void twoWeightSum() {
		int a = 76;
		int b = 65;
		
		
//		//static 없으면? 객체를 만들고, 그것에 맞게 호출 필요.
//		Add ad = new Add();
//		ad.add(a, b, "kg);
		
		
		//이렇게 공통적으로 많이 쓰이는 기능은 static으로 사용하면 좋습니다!
		String sum = Add.add(a,  b,  "kg"); 
		System.out.println(sum);
		sum = Add.add(a, b, "g"); // 단위 변경 가능하다!
	}
	
	
	public void twoWeightGramSum() {
		int a = 76;
		int b = 65;
		String sum = Add.add(a*1000, b, "g");
		System.out.println(sum); //이렇게 공통적으로 자주 사용하는 것만 클래스 변수와 메소드로 지정해서 사용한다.
		
	}
	
	
	
	
}
