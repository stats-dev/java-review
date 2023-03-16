package chap05_array;

public class _06_shallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr1 = {1,2,3,4,5};
		
		//얕은 복사 수행
		int[] intArr2 = intArr1;
		
		
		System.out.println(intArr1); // 		[I@3d012ddd 참고: @뒤가 주소값!
		System.out.println(intArr2); // 		[I@3d012ddd
		System.out.println(intArr1 == intArr2); // 같은지 확인
		
	
		//값을 변경하면 서로 영향 미친다.
		intArr1[0] = 20;
		intArr1[4] = 30;
		
		System.out.println(intArr1[4]);
		System.out.println(intArr2[0]);
		

	}

}
