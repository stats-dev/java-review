package chap08_static.clazz;

// 상속 관계는 아니다.
public class Height {
	public void twoHeightSum() {
		int a = 180;
		int b = 176;
		
		
		String sum = Add.add(a, b, "cm"); //측정단위 상관없이 이 더하기 static 메소드를 어디서든 쓸 수 있다.
		
		System.out.println(sum);
		
	}

}
