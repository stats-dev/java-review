package chap98_homework_nc230317.print;

public class Print {
//	1. 다음 상속구조를 설계하세요
//	모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수,
//	인쇄 종이 잔량을 나타내는 정보를 가진다
//	print()메서드를 갖는다.
	public String model;
	public String company;
	public String inter;
	public int page;
	public int remain;	
	
	
	public void print() {
		for(int i=0;i<page;i++) {
			remain--;
			System.out.println("인쇄용지를 1매 사용했습니다.");
			System.out.println("인쇄종이잔량은 " + remain + "입니다.");
		}
			System.out.println("인쇄를 마쳤습니다.");
		
	}
	
	
	
	

	
	//	잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다
//	레이저프린터는 토너 잔량이라는 추가 정보를 가진다
//	print()메서드는 각 프린터 타입에 맞게 구현한다
//	편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다
//	클래스들을 설계하고
//	적절한 필드, 생성자, 메서드를 작성하세요
//	그리고 실행 프로그램을 작성해서 동작시키세요
	

}
