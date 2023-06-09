package chap98_homework.nc230404;

import chap98_homework.nc230404.clazz.EvenNumPrinter;
import chap98_homework.nc230404.clazz.IntArrUtils;
import chap98_homework.nc230404.clazz.MaxMinMid;
import chap98_homework.nc230404.clazz.StbCombine;

public class _04_lambda4 {

	static int[] intArr = new int[20];

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action1((arr)-> {
			for(int i : arr) {
				if(i % 2 == 0)
					System.out.println(i);
			}
		});
		System.out.println("-----------------------");
		action2((sb1, sb2) -> {
			StringBuilder returnSb = sb1.append(sb2);
			return returnSb.reverse();
		});
		
		System.out.println("---------------------------");
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 20) + 1;
			System.out.print(intArr[i] + ", ");
		}
		
		System.out.println();
		action5(IntArrUtils :: getMax);
		action5(IntArrUtils :: getMin);
		action5(IntArrUtils :: getMid);
	}
	
	public static void action1(EvenNumPrinter enp) {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		enp.printEvenNum(arr);
	}
	
	public static void action2(StbCombine sc) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("DEF");
		
		System.out.println(sc.combineStrBuilder(sb1, sb2));
	}
	
	public static void action5(MaxMinMid mmm) {
		
		
		System.out.println(mmm.maxOrMinOrMid(intArr));
	}
	
	
}
