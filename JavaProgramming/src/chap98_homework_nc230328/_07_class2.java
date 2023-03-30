package chap98_homework_nc230328;

import chap98_homework_nc230328._07_class.Book;

public class _07_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 
//정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
		Book bk = new Book();
		
		bk.bookInfo("모모", "미하일 엔데", "비룡소", 10800);
		bk.printBookInfo();
		

	}

}
