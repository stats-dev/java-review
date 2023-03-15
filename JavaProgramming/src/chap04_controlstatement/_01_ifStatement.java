package chap04_controlstatement;

public class _01_ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 10000;
		
		if(lunchPrice >= 10000) {
			System.out.println("비싸다");
		} else if (lunchPrice >= 8000) {
			System.out.println("조금 비싸다");
		} else if (lunchPrice >= 6000) {
			System.out.println("적정하다");
		} else {
			System.out.println("싼 편이다");
		}
//아올 돈까스집?

	}

}
