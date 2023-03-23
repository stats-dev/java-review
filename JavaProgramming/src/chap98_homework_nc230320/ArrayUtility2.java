package chap98_homework_nc230320;

import java.util.Arrays;

public class ArrayUtility2 {

//2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
//  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	
	public static int[] concat(int[] s1, int[] s2) {
		int[] s3 = new int[s1.length + s2.length];
		
		for(int i=0;i<s1.length;i++) {
			s3[i] = s1[i];
			for(int j=0;j<s2.length;j++) {
				s3[s1.length+j] = s2[j];
			}
		}
		
		return s3;
		
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		int[] s3 = new int[s1.length];
		int sum = s1.length;
		//int[] indexArr = 
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s1.length;j++) {
				if(s1[i] == s2[j]) {
					sum--;
					break;
				} else {
					s3[i] = s1[i];
				}
			}
		}
		System.out.println(sum);
		
		int[] s4 = new int[sum];
		
		for(int i=0;i<sum;i++){
<<<<<<< HEAD
    	  s4[i] = s3[i];
=======
    	  s4[i]=s3[i];
>>>>>>> 5d648f7d6a5479a98f970f1721867a8766f55208
      }
	   return s4;
	}
	

		
//		for(int i=0;i<s1.length;i++) {
//			for(int j=0;j<s1.length;j++) {
//				if(s1[i] == s2[j]) {
//					sum++;
//					break;
//				} else {
//					s3[i] = s1[i];	
//				}
//			}
//		}
		
		
//		int[] result = Arrays.stream(s3)
//				.boxed()
//				.filter((a)->((a!=0)))
//						.sorted()
//						.mapToInt(Integer::intValue)
//						.toArray()
//						;
//		
//		System.out.println(Arrays.toString(s3));
//		
				
//		
//		
//		return s3;
//			
//		
//	}

	
	
}
