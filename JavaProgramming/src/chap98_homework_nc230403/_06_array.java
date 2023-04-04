package chap98_homework_nc230403;

public class _06_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------배열--------------------
//		1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//		   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
		
		char[] chaArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String str4 = "";
		
		for(int i = 0; i < chaArr.length; i++) {
			if(i % 4 == 0) {
				str1 += String.valueOf(chaArr[i]);
			} else if (i % 4 == 1) {
				str2 += String.valueOf(chaArr[i]);
			} else if (i % 4 == 2) {
				str3 += String.valueOf(chaArr[i]);
			} else {
				str4 += String.valueOf(chaArr[i]);
			}
			
		}
		System.out.print(str1 + ", ");
		System.out.print(str2 + ", ");
		System.out.print(str3 + ", ");
		System.out.print(str4);
		
		
		

	}

}
