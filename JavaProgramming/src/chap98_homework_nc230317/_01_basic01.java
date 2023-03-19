package chap98_homework_nc230317;

import chap98_homework_nc230317.print.InkPrint;
import chap98_homework_nc230317.print.LaserPrint;
import chap98_homework_nc230317.print.Print;

public class _01_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print print = new Print();
//		InkPrint iprint = new InkPrint();
//		LaserPrint lprint = new LaserPrint();
//		
		print = new InkPrint();
//		InkPrint print1 = new InkPrint();
		print.page = 10;
		print.remain = 10;
		print.print();

		
		print = new LaserPrint();
		print.page = 10;
		print.remain = 10;
		print.print();

		
		
		
		

	}

}
