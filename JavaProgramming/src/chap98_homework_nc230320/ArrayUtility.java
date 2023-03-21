package chap98_homework_nc230320;

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		//int 배열을 double 배열로 변환
		double[] convertArr = new double[source.length];

		for(int i =0;i<source.length;i++) {
			convertArr[i] = (double) source[i];
//			System.out.println(convertArr[i]);

		}
						
		return convertArr;
	}
	
	public static int[] doubleToInt(double[] source) {
		//double 배열을  int 배열로 변환
		int[] convertArr = new int[source.length];

		for(int i =0;i<source.length;i++) {
			convertArr[i] = (int) source[i];
//			System.out.println(convertArr[i]);
		}
						
		return convertArr;
		
	}
	
	
	
	
}
