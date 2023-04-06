package chap98_homework_nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import chap98_homework_nc230405.clazz1.Student;

public class _01_hw {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int) (Math.random() * 10) + 1);
		}
		
		System.out.println(intList);
		
		
//		Stream<Integer> intStream = intList.stream();
//		
//		Stream<Integer> newStream = intStream.map(num -> num * 3); //괄호가 없으면 바로 리턴된다.
//		
//		newStream.forEach(num -> System.out.println(num + ", "));
		
//		//체이닝기법
//		intList.stream()
//				.map(num -> num * 3)
//				.forEach(num -> System.out.println(num + ", "));
//		
//		
		
		
		System.out.println("----------------------------");
		
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student(1, "홍길동", 100));
		sList.add(new Student(2, "임꺽정", 75));
		sList.add(new Student(3, "장길산", 86));
		sList.add(new Student(4, "정도전", 97));
		sList.add(new Student(5, "이순신", 95));
		
//		Stream<Student> sStream = sList.stream();
//		
//		//조건을 가지고 자른다.
//		Stream<Student> aPlusStream = sStream.filter(student -> student.getScore() >= 95);
//
//		//출력하게되면 밑에서 사용을 못하게 된다.
//		//스트림을 한번 사용한것으로 하게 되어 에러가 남. 출력으 ㄴ한번만 하게 만든다.
////		aPlusStream.forEach(student -> System.out.println(student.toString()));
//		
//		Stream<Student> aStream = aPlusStream.map(student -> {
//			student.setGrade("A+");
//			return student; //변경한 친구를 다시 반환해야 합니다. 그래서 리턴을 쓰고 두줄 이상 중괄호 쓴다.
//			});
//		
//		
//		aStream.forEach(student -> System.out.println(student.toString()));

		
		//체이닝기법
//		sList.stream()
//			 .filter(s -> s.getScore() >= 95)
//			 .map(s -> {
//				 s.setGrade("A+");
//				 return s;
//			 }).forEach(s -> System.out.println(s.toString()));

		System.out.println("----------------------------------");
		
		//4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
//	    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		//새로운 스트림, Map을 사용한다.
		Scanner sc = new Scanner(System.in);
		List<Character> charList = 
				new ArrayList<Character>();
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자 하나를 입력하세요.");
			String input = sc.nextLine(); //string으로 받는군.
			charList.add(input.toCharArray()[0]); //어쩌피 영문자 하나만 들어간다 가정.
		}
		
		System.out.println(charList);
		
//		Stream<Character> chStream = charList.stream();
//	
//		Stream<Character> convStream = chStream.map(ch -> {
//			if(ch >= 'A' && ch <= 'Z') {
//				ch = (char) (ch + 32);
//			} else if(ch >= 'a' && ch <= 'z') {
//				ch = (char) (ch - 32);
//			}
//			
//			return ch;
//		});
//		
//		convStream.forEach(ch -> System.out.print(ch + ", "));
	
		
		//체이닝 기법
//		charList.stream()
//				.map(ch -> {
//					if(ch >= 'A' && ch <= 'Z') {
//						ch = (char) (ch + 32);
//					} else if(ch >= 'a' && ch <= 'z') {
//						ch = (char) (ch - 32);
//					}
//					
//					return ch;
//				}).forEach(ch -> System.out.print(ch + ", "));
		
		System.out.println("----------------------------------");

		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열 입력하세요.");
			strList.add(sc.nextLine());
			
		}
		
		System.out.println(strList);
		
//		Stream<String> strStream = strList.stream();
//		
//		Stream<String> strStream2 = strStream.filter(str -> {
//		
//			//리턴해야함.
//			//true로 나온 친구들만 str에만 추가를 시키는 방법이다.
//			//filter는 true false로만 넣어줘야지, false이면 아예 빼버리는 방법이다.
//			//boolean을 사용하는 좋은 예제이다.
//			for(int i = 0; i < str.length(); i++) {
//				if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
//					|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
//					return true;
//				}
//			}
//			return false;
//		}); 
//		
//		
//		strStream2.forEach(str -> System.out.println(str));
//		
		
		//체이닝기법
		strList.stream()
				.filter(str -> {
					for(int i = 0; i < str.length(); i++) {
						if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
								|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
							return true;
						}
					}
					
					return false;
				})
				.forEach(str -> System.out.println(str));
		
		
		System.out.println("----------------------------------");

		
		sc.close();
		
		
		
		
		
	}
}
