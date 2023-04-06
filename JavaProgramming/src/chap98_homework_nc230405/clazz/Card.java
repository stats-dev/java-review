package chap98_homework_nc230405.clazz;

public class Card implements CardVali{
//	6. 클래스 Card를 만들고 String cardName; int validYear; 멤버변수를 생성하고 getter/setter 및 유효기간을 연장하는 void validEnlong을 만듭니다.

	private String cardName;
	private int validYear;
	
	
	public Card(String cardName, int validYear) {
		this.cardName = cardName;
		this.validYear = validYear;
		
	}
	
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public int getValidYear() {
		return validYear;
	}
	
	public void setValidYear(int validYear) {
		this.validYear = validYear;
	}
//	8. 6번에서 만든 validEnlong에서 연장할 유효기간과 CardVali를 매개변수로 받아서 현재 유효기간 + 매개변수로 받아온 유효기간으로 변경해주고
//    함수형 인터페이스 CardVali의 enlong을 호출합니다.
	public void validEnlong(int year, CardVali cv) {
		validYear += year;
		cv.enlong(year);
	}


	@Override
	public void enlong(int year) {
		// TODO Auto-generated method stub
		System.out.println("유효기간이 " + year + "년 연장되었습니다!");
	}	
	
	


}
