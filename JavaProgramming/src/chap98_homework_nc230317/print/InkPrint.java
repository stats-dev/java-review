package chap98_homework_nc230317.print;

public class InkPrint extends Print{

	//잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다
	public int ink=10;
	
	
	
	public void print() {
		System.out.println("-------------잉크젯프린터-------------");
		for(int i=0;i<page;i++) {
			remain--;
			ink--;
			System.out.println("인쇄용지를 1매 사용했습니다.");
			System.out.println("인쇄종이잔량은 " + remain + "입니다.");
			System.out.println("잉크잔량은 " + ink + " 입니다.");

		}
	}
	
	

}
