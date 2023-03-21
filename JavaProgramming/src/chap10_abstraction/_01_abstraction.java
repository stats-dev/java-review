package chap10_abstraction;

public class _01_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스는 인스턴스화 불가능
		//Academy ac = new Academy();
		Academy ac = new EnglishAcademy();
		
		ac.teach();
		ac.solveHomework();
		ac.rest();
		ac.attend(); // 부품만 갈아끼우자.
		
		
		System.out.println("-----------------------");
		
		ac = new ComputerAcademy();
		
		ac.teach();
		ac.solveHomework();
		ac.rest();
		ac.attend();
	}

}
