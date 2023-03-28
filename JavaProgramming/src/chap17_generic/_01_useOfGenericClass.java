package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 게시글에 대한 첨부파일
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>(); // 생성자 호출할 때도 타입을 명시해줘야 한다.
		
		
		
		//아래 방식으로도 선언할 수 있고
		fBoardFile.setT(new FreeBoard()); // 객체 생성해서 이 t자리에 새로 생성된 객체를 넣어줄 수 있게된다. 다만 모든 정보가 null 처리가 된다.
		fBoardFile.getT().setfBoardNo(1); //이렇게 바로 넣을 수도 있음.
		fBoardFile.getT().setfBoardTitle("test");
		fBoardFile.getT().setfBoardContent("test입니다."); //객체를 꺼내버리는 것이다.
		
		
		fBoardFile.setBoardNo(
				fBoardFile.getT().getfBoardNo() // 첨부파일에 게시글 번호로 넣어주게 된다.
				);
		
		
		//타입
		fBoardFile.setType(
				fBoardFile.getT()
						   .getClass()
						   .getSimpleName()
						   .equals("FreeBoard")
				? 1 : 2);
		
		
		
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fBoard);
		
		
		//공지사항 게시글에 대한 첨부파일
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		// 번호도 2번, 타입도 2번
		nBoardFile.setT(new NoticeBoard());
		nBoardFile.getT().setnBoardNo(2);
		nBoardFile.getT().setnBoardTitle("test");
		nBoardFile.getT().setnBoardContent("test입니다.");
		
		nBoardFile.setBoardNo(
				nBoardFile.getT().getnBoardNo()
				);
		
		nBoardFile.setType(
				nBoardFile.getT()
						   .getClass()
						   .getSimpleName() //그냥 name은 패키지명도 나오지만 이 simplename은 클래스명까지만 나온다.
						   .equals("FreeBoard")
							? 1 : 2);
				
				
		
		
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		
//		fBoardFile.setT(fBoard); // generic 변수로 잡는다.
//				
////		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo()); // T가 freeboard임. 그래서 거기에 있는 게터세터 사용 가능함.
//		
//		fBoardFile.setBoardNo( //set으로 보드 넘버를 바꿔줍니다.
//				fBoardFile.getT().getfBoardNo()); // T에 담긴 게시판 번호를 꺼내온다.
//		
//		
//		//Type?
//		fBoardFile.setType(
//				fBoardFile.getT().getClass()
//							.getSimpleName()
//							.equals("FreeBoard") 
//							? 1 : 2 //1 자유게시판, 2 공지사항인지 이렇게 타입을 정할 수도 있다!!
//					
//				) ;
//		
//		fBoardFile.setBoardFileNm("첨부파일");
//		
////		System.out.println(fBoardFile.toString());
//		
//		System.out.println(fBoardFile);
		
		
		

	}

}
