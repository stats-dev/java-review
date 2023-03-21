package chap98_homework_nc230320.arrayutils;

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		double[] returnArr = new double[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = source[i]; // 여기는 자동형변환이라 딱히 문제 없음.
		}
		
		return returnArr;
	}
	
	public static int[] doubleToInt(double[] source) {
		int[] returnArr = new int[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = (int)source[i]; // 여기는 명시해야함.
		}
		
		return returnArr;
	}
}
