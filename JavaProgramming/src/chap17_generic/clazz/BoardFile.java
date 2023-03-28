package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T> { // 제네릭 선언시, 어떤 클래스도 될 수 있습니다.
	//T == FreeBoard라면 boardNo == fBoardNo
	//T == NoticeBoard라면, boardNo == nBoardNo
	private int boardNo;
	//1: 자유게시판, 2:공지사항
	
	private int type;
	private String boardFileNm;
	
	
	private T t; // = FreeBoard fBoard
	
	//리스트로 넣을 수 있다. t 여러개
	private List<T> tList; // 객체를 여러개 사용할 수 있겠죠?
	
//	ResponseEntity<T> // 요청에 대한 응답을 받아올 때 이런 객체를 받아와서 사용한다.


	public int getBoardNo() {
		return boardNo;
	}


	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getBoardFileNm() {
		return boardFileNm;
	}


	public void setBoardFileNm(String boardFileNm) {
		this.boardFileNm = boardFileNm;
	}


	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}


	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", boardFileNm=" + boardFileNm + ", t=" + t + "]";
	}


	
	
	
	

}
