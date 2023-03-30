package chap98_homework_nc230328;

public class _06_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------배열--------------------
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.

		int[] iArr1 = new int[10];
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i] = i+1;
		}
		
		for(int i=0;i<iArr1.length;i++) {
			System.out.println(iArr1[i]);
		}
		
	
	}

}
