package chap02_variables;

public class _09_constant {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		// DB 커넥션 풀의 최대 DB 연결 개수 = 20 지정
		final int MAX_CONNECTION = 20;
		// 이렇게 자주 사용하는 것 상수로 지정해서 호출해서 사용하면, 편하게 사용 가능하다!!
		
		//상수는 선언만 하고 나중에 값을 저장해도 된다.
		final int MAX_VALUE;
		MAX_VALUE = 10;
		
		//한 번 지정된 상수의 값은 변경할 수 없다.
		//MAX_CONNECTION = 30;
		
		// 회원의 카운트
		int userCnt = 0;
		
		
		while(true) {
			userCnt++;
			
			System.out.println("현재 사용자 수: " + userCnt);
			if(userCnt > MAX_CONNECTION) {
				break;
			}
			// tip: alt와 위아래 키로 코드블록을 옮길 수 있습니다.
			
			Thread.sleep(1000); // 에러가 뜨는데, throws InterruptedException 추가해서 해결
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // 1초에 한번씩 진행, 에러 처리됨.
		}
		
		
		
		System.out.println("DB 연결이 모두 사용중입니다.");
		
	}

}
