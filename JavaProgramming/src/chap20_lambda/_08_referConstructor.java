package chap20_lambda;

import chap20_lambda.clazz.Academy;
import chap20_lambda.clazz.ComAcademy;
import chap20_lambda.clazz.EngAcademy;

//				생성자 참조
public class _08_referConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		comLectureInfo((str,num) -> new Academy(str, num)); //매개변수는 이름 아무거나 써도 됨. 타입만 맞으면 된다.
//		=>
		comLectureInfo(Academy :: new); //이렇게도 선언 가능.

		
//		engLectureInfo(str -> new Academy(str));
		engLectureInfo(Academy :: new);
		
		// 이게 있어서 실행이 된다고 한다!
//		public Academy(String subject) {
//			this.subject = subject;
//		}
		
		
	}
	

	public static void comLectureInfo(ComAcademy ca) {
		Academy ac = ca.getComAcademy("컴퓨터", 50);
		
		ac.setLecTime(10);
		
		ac.lectureInfo();
	}
	
	public static void engLectureInfo(EngAcademy ea) {
		Academy ac = ea.getEngAcademy("영어");
		
		ac.lectureInfo();
		
		
	}


}
