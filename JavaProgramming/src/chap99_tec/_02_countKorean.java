package chap99_tec;

public class _02_countKorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 및 초기화
		String str = "가A나B다C라D";
		// 하나씩 꺼내쓸 캐릭터 하나 넣어준다. 문자 하나씩 꺼내서 한글 판별할 변수
		char ch; 
		// 한글 개수 셀 변수 선언
		int kCnt =0; 
		
		//2. 로직 처리
		//반복문으로 문자 하나씩 꺼내서 한글여부 판별
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch >= 44032 && ch <= 55203) {
				kCnt++;
				//kCnt += 1;
				//kCnt = kCnt + 1;
			}
		}
		
		System.out.println(kCnt);
		
//		
//		
//		for(int i=0;i <str.length();i++){
//			ch = str.charAt(i);
//			if(ch >= 44032 && ch <= 55203)
//				kCnt++;
//		}
//		
//		System.out.println(kCnt);
//		
		
//		int kCnt1 = 0;
//		for(int i=0;i<str.length();i++) {
//			ch = str.charAt(i);
//			if(!(ch >= 'A' && ch <= 'Z'))
//				kCnt1++;
//			
//		}
//		System.out.println("----");
//		System.out.println(kCnt1);


	}

}
