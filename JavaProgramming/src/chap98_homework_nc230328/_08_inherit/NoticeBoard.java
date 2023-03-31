package chap98_homework_nc230328._08_inherit;

public class NoticeBoard implements Board {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("공지게시판에 게시글을 저장했습니다.");

	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("공지게시판에 게시글을 수정했습니다.");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("공지게시판에 게시글을 삭제했습니다.");

	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("공지게시판에 게시글을 조회한 결과입니다.");

	}

}
