package chap98_homework_nc230321;

import chap98_homework_nc230321.calc.Calculator;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Calculator.Add add = calc.new Add();
		Calculator.Sub sub  = calc.new Sub();
		Calculator.Mul mul = calc.new Mul();
		Calculator.Div div = calc.new Div();
		
		add.setA(10);
		add.setB(20);
		add.setResult(add.getA() + add.getB());
		System.out.println(add.getResult());
		
		
		sub.setA(15);
		sub.setB(35);
		sub.setResult(sub.getA() - sub.getB());
		System.out.println(sub.getResult());
		

		
		mul.setA(20);
		mul.setB(30);
		mul.setResult(mul.getA() * mul.getB());
		System.out.println(mul.getResult());
		
		
		div.setA(10);
		div.setB(35);
		div.setResult(div.getA() / div.getB());
		System.out.println(div.getResult());
//		
		
	}

}
