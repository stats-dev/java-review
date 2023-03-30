package chap98_homework_nc230328;

import chap98_homework_nc230328._08_inherit.ChildA;
import chap98_homework_nc230328._08_inherit.ChildB;
import chap98_homework_nc230328._08_inherit.Parent;

public class _08_inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pa = new Parent();
		ChildA ca = new ChildA();
		ChildB cb = new ChildB();
		
		pa.lastName = "홍";
		pa.bloodType = "A형";
		pa.height = 189;
		pa.skinColor = "흰색";
			
		ca.name = "test";
		cb.fingerPrint = "unknown";
		
		System.out.println(ca.name);

	}

}
