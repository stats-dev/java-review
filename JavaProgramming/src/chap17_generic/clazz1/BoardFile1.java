package chap17_generic.clazz1;

public class BoardFile1<T> {
	
	private int boardNo;
	private int type;
	private String fileNm;
	private T t; // 넣어준 클래스 형태 변수를 넣어서, 나중에 여러 보드들을 넣어서 사용할 수 있어 확장성에 용이함.
	
	//1. Getter setter
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
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	//2. toString
	@Override
	public String toString() {
		return "BoardFile1 [boardNo=" + boardNo + ", type=" + type + ", fileNm=" + fileNm + ", t=" + t + "]";
	}
	
	

}
