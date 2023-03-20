package chap98_homework_nc230320;

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
	
	public static int[] remove(int[] s4, int[] s5) {
		int[] s6 = new int[s4.length];
		
		for(int i=0;i<s4.length;i++) {
			for(int j=0;j<s5.length;j++) {
				if(s4[i] == s5[j]) {
					break;
				} else {
					s6[i] = s4[i];	
				}
			}
		}
		return s6;
			
		
	}

	
	
}
