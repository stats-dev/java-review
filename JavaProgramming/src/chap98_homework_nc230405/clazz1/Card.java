package chap98_homework_nc230405.clazz1;

public class Card {
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
	

	
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", validYear=" + validYear + "]";
	}

	public void validEnlong(int year, CardVali cardVali) {
//		this.validYear += year;
		cardVali.enlong(year);
	}
	
}
