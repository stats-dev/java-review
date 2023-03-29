package chap18_enum.enums;

public enum MethodMonth_KHH {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	
	private int monthVal;
	
	private MethodMonth_KHH(int monthVal) {
		// TODO Auto-generated constructor stub
		this.monthVal = monthVal;
	}
	
	//getter까지만 가져온다.

	public int getMonthVal() {
		return monthVal;
	}
	
	
	public static void printMonth(int month) { // static으로 만들어서 객체를 바로 가져옴
		MethodMonth_KHH[] monthArr = values();
		for(int i = 0; i < monthArr.length; i++) {
			if(monthArr[i].getMonthVal() == month) {
				System.out.println("입력한 달은 " + monthArr[i].getMonthVal() + "월 입니다.");
			}
			else {
				System.out.println("입력한 달과 값이 맞지 않는다.");
			}
			
		}
	}
	
	
	public void printAddMonth(int month) {
		if(this.getMonthVal() + month <= 12) {
			System.out.println(month + "개월 뒤는 "
					+ (this.getMonthVal() + month) 
					+ "월입니다.");
		} else {
			int remain = this.getMonthVal() + month - 12;
			
			while(remain > 12) {
				remain -= 12;
			}
			
			System.out.println(month + "개월 뒤는 "
					+ (JAN.monthVal + remain - 1) 
					+ "월입니다.");
		}
	}
	

}
