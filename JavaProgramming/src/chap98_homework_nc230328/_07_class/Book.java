package chap98_homework_nc230328._07_class;

public class Book {
//	2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.

	public String title;
	public String author;
	public String publisher;
	public int price;
	
	public void bookInfo(String title, String writer, String publisher, int price) {
		this.title = title;
		this.author = writer;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println("도서의 제목: " + title);
		System.out.println("도서의 저자: " + author);
		System.out.println("도서의 출판사: " + publisher);
		System.out.println("도서의 가격: " + price);
	}
	

}
