package chap98_homework_nc230404;

import chap98_homework_nc230404.threads.NumberPrinter;

public class _03_thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter np = new NumberPrinter();
		
		np.numPrint1(10);
		np.numPrint2(10);
		
		System.out.println("Finish!");

	}

}
