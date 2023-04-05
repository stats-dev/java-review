package chap98_homework.nc230404;

import chap98_homework.nc230404.clazz.EvenNumPrinter;

public class _04_lambda {

//	--------------------람다식--------------------
//	1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action1((arr) -> {
			for(int i : arr) {
				if(i % 2 == 0)
					System.out.println(i);
			}
		});

	}
	
	
	public static void action1(EvenNumPrinter enp) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1; //1부터 10까지 랜덤하게
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		enp.printEvenNum(arr);
		
		
	}

}
