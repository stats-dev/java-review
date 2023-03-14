package chap02_variables;

public class _01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수란
		// 좋아요 기능 예시
		//좋아요 개수
		int likeCnt; // 이렇게 변수 이름을 잘 작성해주면 좋습니다.
		// 로그인한 사용자가 좋아요 눌렀는지 여부
		boolean isUserLike; // true false이므로 불리언을 넣으면 좋죠
		// 이래서 변수가 필수적입니다.
			// 게시글 board
			// 조회수 visit cnt 등..
		// 어떤 변수로 만들지 잘 설계하는게 프로그래밍에서 중요한 부분입니다.
		
		
		// 2. 변수의 선언
		// 2-1. 첫 글자는 문자, $, _ 만 허용합니다.
		int $price;
		int _bit;
		int naverCloud;
		
		// 불가능
//		int %bit;
//		int 2023year;
//		int @coding;

		
		// 한줄 주석, ctrl + /
		
		/*
		 여러 줄 주석, ctrl + shift + /
		 */
		

		// 카멜케이스 + 직관적 변수명
		// 좋아요 개수
		int likeCnt2; //Count 약어 Cnt, 좋아요 like 더함
		// 게시물 개수
		int boardCnt; // 카멜케이스: 첫글자 무조건 소문자, 뒷단어 첫글자만 대문자로 합니다.
		// OS 출력장치의 출력횟수
		int osOutPrintCnt;
		
		// 나만 아는 변수명을 쓰면 유지보수 측면에서 불리하다. ex)책: 유지보수하기 어렵게 코딩하는 방법
		int nuri; // 본인만 알 수 있는 변수명은 좋지 않다.
		
		// 변수명 대소문자 구분
		// 대소문자 구분을 통해 같은 의미의 변수를 
		// 여러개 생성할 수 있다.
		int lunchTime;
		int LunchTime;
		int luNchTime;
		
		
		// 3. 변수의 사용
		// 변수의 값 대입 (저장)
		// 최초 값 저장은 초기화라고 한다. 위에서 선언했기 때문에 초기화만 해주면 된다.
		likeCnt = 125;
		
		//변수의 선언과 동시에 초기화
		int studentCnt = 30;
		
		//상수를 제외한 변수는 값의 변경이 가능하다.
		studentCnt = 189; // 30 -> 159로 변경이 가능하다.
		
		// 초기화되지 않은 변수 사용하려면 에러가 발생한다.
		int errorVal;
		
		
		//팁: syso 입력 후 ctrl + space 누르면 자동완성이 되어 빠르다.
		// 변수가 초기화되지 않았다라는 에러가 발생된
//		System.out.println(errorVal);
		
		// 변수의 사요은 변수명을 통해 메모리에 저장된 값을 가져와서 사용한다.
		System.out.println(likeCnt);
		System.out.println(studentCnt);
		
		
		// 4. 이스케이프 문자
		// 큰 따옴표나 작은따옴표를 변수의 값으로 저장하거나 출력하고 싶을 때는 이스케이프 문자 사용
		System.out.println("리터럴은 \"초기화\" 코드에 자주 등장한다."); // 큰따옴표 자체를 리터럴로 만들어주는 것입니다.
		System.out.println("이스케이프 문자는 '특수기능' 을 수행합니다.");
		System.out.println('\'');
//		리터럴은 "초기화" 코드에 자주 등장한다.
//		이스케이프 문자는 '특수기능' 을 수행합니다.
//		'
		
		
		//error with 작은 따옴표 세개
//		System.out.println(''');
		
		
		String tempStr = "aaaa \"bbbbb\""; // 역슬래쉬를 잘 넣어주어야 이 따옴표도 잘 저장이 됩니다.
		
		//탭 키만큼 공백을 줄 때 \t
		//줄바꿈이 ㅣ필요할 때는 \n
		System.out.println("12시 50분부터 \t 점심시간 입니다. \n 맛점하세요. \n");
//		12시 50분부터 	 점심시간 입니다. 
//		 맛점하세요. 
		
		
				
		
		
	}

}
