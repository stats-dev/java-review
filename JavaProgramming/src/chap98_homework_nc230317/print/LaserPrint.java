package chap98_homework_nc230317.print;

public class LaserPrint extends Print{
	
	public int toner=10;

	
	public void print() {
		System.out.println("-------------레이저프린터-------------");
		for(int i=0;i<page;i++) {
			remain--;
			toner--;
			System.out.println("인쇄용지를 1매 사용했습니다.");
			System.out.println("인쇄종이잔량은 " + remain + "입니다.");
			System.out.println("토너잔량은 " + toner + " 입니다.");

		}		
	}
	
	

}
