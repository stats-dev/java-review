package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap98_homework_nc230405.clazz.Student;

public class _01_stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------스트림--------------------
//		2. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
//	    List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)
//	    를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
		
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student(1, "홍길동", 100));
		stuList.add(new Student(2, "임꺽정", 75));
		stuList.add(new Student(3, "장길산", 86));
		stuList.add(new Student(4, "정도전", 97));
		stuList.add(new Student(5, "이순신", 95));
		
		
		Stream<Student> stuStream = stuList.stream();
		
		Stream<Student> superStream = stuStream.filter(stu -> stu.getScore() >= 95);
		
		superStream.forEach(stu -> System.out.println(stu.getScore()));



	}

}
