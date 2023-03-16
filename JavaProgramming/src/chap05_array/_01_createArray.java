package chap05_array;

public class _01_createArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열의 선언
		int[] numArr = new int[5];
		
		//2. 배열 요소의 값 대입(초기화)
		numArr[0] = 14;
		numArr[1] = 16;
		
		//3. 배열의 사용
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		//초기화하지 않은 요소의 사용
		System.out.println(numArr[2]);
		System.out.println("----------------------");
		
		//4. 길이가 큰 배열의 선언
		int[] bigArr = new int[1000];
		
		//5. 반복문을 이용한 배열의 초기화
		for(int i = 0; i < bigArr.length; i++) {
			bigArr[i] = i+1;
		}
		
		//6. 길이가 큰 배열의 사용
		System.out.println(bigArr[2]);
		
		for(int j = 0; j < bigArr.length; j++) {
			if(bigArr[j] % 3 == 0) {
				System.out.println(bigArr[j]); // 배열 내 값에 3의 배수만 출력하게 만들 수 있다.
			}
		}
		
		System.out.println("----------------------");

		
		//7. 배열선언과 동시에 초기화
		//길이가 4이면서 값이 10 20 30 40 초기화된 배열 생성
		int[] valueArr = {10, 20, 30, 40};
		
		
		//8. 배열의 사용
		System.out.println(valueArr[0]);
		System.out.println(valueArr[2]);
		
		//인덱스를 초과한 요소 접근
		//최대 인덱스보다 큰 인덱스에 접근하면
		//java.lang.ArrayIndexOutOfBoundsException 에러 발생
		//System.out.println(valueArr[5]); 		//error : Index 5 out of bounds for length 4

		//최대 인덱스보다 큰 수를 넣어서 발생하는 에러입니다.
		//따라서, 마지막 인덱스는 무조건 length - 1 해줍니다.
		
		for(int k = 0;k <= valueArr.length; k++) {
			System.out.println(valueArr[k]);
		}
		


	}

}
