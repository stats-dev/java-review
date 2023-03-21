package chap98_homework_nc230320.arrayutils;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int[] returnArr = new int[s1.length + s2.length];
		
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			returnArr[index++] = s1[i];
		}
		
		for(int i = 0; i < s2.length; i++) {
			returnArr[index++] = s2[i];
		}
		
		return returnArr;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		int[] returnArr = new int[s1.length + s2.length];
		
		int[] indexArr = new int[s1.length];
		
		int index = 0;
		int dupCnt = 0;

		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					indexArr[index++] = i; // 겹치면, 겹친 숫자의 인덱스를 넣어준다.
					dupCnt++;				// 중복된 개수를 세준다.
					break;
				}
			}
		}
		
		boolean isDup = false;
		
		index = 0; // 리턴에 다시 넣게 초기화한다.
		
		for(int i = 0; i < s1.length; i++) {
			for(int j =0 ; j < dupCnt; j++) {
				if(i == indexArr[j]) {
					isDup = true;
					break;
				}
			}
			
			if(isDup) {
				continue;
			}
			
			returnArr[index++] = s1[i]; //중복되지 않은 개수만 나타난다.
		}
		
		return returnArr;
	}
}
