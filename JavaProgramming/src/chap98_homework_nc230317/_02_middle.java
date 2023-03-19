package chap98_homework_nc230317;

import chap98_homework_nc230317.calc.Add;
import chap98_homework_nc230317.calc.Calc;
import chap98_homework_nc230317.calc.Div;
import chap98_homework_nc230317.calc.Mul;
import chap98_homework_nc230317.calc.Sub;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Calc[] calcArr = new Calc[4];
		
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].setValue(4, 3);
		calcArr[1].setValue(4, 3);
		calcArr[2].setValue(4, 3);
		calcArr[3].setValue(4, 3);

		
		calcArr[0].calculate();
		calcArr[1].calculate(); 
		calcArr[2].calculate(); 
		calcArr[3].calculate();
		
		//확
		System.out.println(calcArr[0].calculate());
		System.out.println(calcArr[1].calculate());
		System.out.println(calcArr[2].calculate());
		System.out.println(calcArr[3].calculate());

		
		

	}

}

//Add, Sub, Mul, Div모두 공통된 필드와 메서드가 존재하므로
//Calc를 정의하고 이들이 Calc를 상속받게 하세요
//그리고 Calc의 배열에 자식 객체들을 담고
//calculate를 실행시키세요