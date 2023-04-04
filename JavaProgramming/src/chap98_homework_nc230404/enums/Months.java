package chap98_homework_nc230404.enums;

public enum Months {
//	3. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 사용자가 년도를 입력하면 
//    해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
	
	JAN(31,31), FEB(28,29), MAR(31,31), APR(30,30), MAY(31,31), 
	JUN(31,31), JUL(30,30), AUG(31,31), SEP(30,30), OCT(31,31), 
	NOV(30,30), DEC(31,31);
	
	
	private int daysNormal;
	private int daysLeap;
	
	
	Months(int daysNormal, int daysLeap) {
		this.daysNormal = daysNormal;
		this.daysLeap = daysLeap;
	}
	
	public void sumDays(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
			System.out.println(JAN.getDaysLeap() + FEB.getDaysLeap() + MAR.getDaysLeap() + APR.getDaysLeap() + MAY.getDaysLeap());
		} else {
			System.out.println("윤년이 아닙니다.");
			System.out.println(JAN.getDaysNormal() + FEB.getDaysNormal() + MAR.getDaysNormal() + APR.getDaysNormal() + MAY.getDaysNormal());
		}
	}

	public int getDaysNormal() {
		return daysNormal;
	}

	public int getDaysLeap() {
		return daysLeap;
	}
	
	
	

}
