package chap98_homework_nc230328;

import chap98_homework_nc230328._08_inherit.Board;
import chap98_homework_nc230328._08_inherit.FreeBoard;
import chap98_homework_nc230328._08_inherit.NoticeBoard;

public class _08_inherit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
//	    원하는 대로 구현하세요.
		Board bd = new FreeBoard();
		bd.save();
		bd.edit();
		bd.delete();
		bd.search();
		
		bd = new NoticeBoard();
		bd.save();
		bd.edit();
		bd.delete();
		bd.search();
		
		



	}

}
