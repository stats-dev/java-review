package chap98_homework_nc230317_answer;

public class UseOfPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazerjetPrinter lj = new LazerjetPrinter();
		InkjetPrinter ij = new InkjetPrinter();
		
		lj.print();
		lj.print();
		
		ij.print();
		ij.print();
		ij.print();
	}

}
