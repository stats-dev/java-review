package chap05_array;

public class _07_deepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. clone()을 이용한 깊은 복사
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1 == arr2); //같은 객체를 바라보는지 확인한다.
		System.out.println(arr1.equals(arr2)); //같은 객체를 바라보는지 확인한다.(주소 비교)
		
		// 값을 비교하려면?
		
		/*
		 * [I@3d012ddd [I@626b2d4a false 10 20
		 */
		
		
		//깊은 복사는 값을 변경해도 서로에게 아무런
		//영향을 끼치지 않는다.
		arr1[0] = 10;
		arr2[0] = 20;
		
		System.out.println(arr1[0]); // 10
		System.out.println(arr2[0]); // 20
		
		//각자 갈 길을 간다.
		
		//2. System.arraycopy
		int[] arr3 = new int[5];
		//  arraycopy(원본배열, 원본배열에서 복사를 시작하는 위치의 인덱스, 복사된 배열을 받을 배열, 복사된 배열에서 값을 넣을 위치의 인덱스, 복사된 배열의 길이?)
		//System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		
		// 인덱스를 지정해서 원하는 만큼만 복사할 수도 있습니다!!
		//System.arraycopy(arr1, 2, arr3, 0, arr1.length - 2); //{3,4,5} 뽑고 싶음
		//System.arraycopy(arr1, 0, arr3, 2, arr1.length - 2); //{2,3} 뽑고 싶음
		

		for(int i : arr3) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		System.out.println(arr1); // [I@3d012ddd
		System.out.println(arr3); // [I@5e91993f
		System.out.println(arr1 == arr3); // false 주소 달라요.
		
		arr1[1] = 13;
		arr3[1] = 33;
		
		System.out.println(arr1[1]); //13 값 변경해도 영향 안 줍니다.
		System.out.println(arr3[1]); //33
		
		
		//2번부터 
		
		
		

	}

}
