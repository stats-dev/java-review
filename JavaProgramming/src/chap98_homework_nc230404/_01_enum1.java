package chap98_homework_nc230404;

import java.util.Scanner;

import chap98_homework_nc230404.enums.Country;

public class _01_enum1 {
//	--------------------열거형--------------------
//	1. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
//	   public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요.
//	   country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. (각 국의 음식은 한국=불고기, 중국=짜장면,
//	   일본=초밥, 미국=햄버거)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나라를 입력하세요.");
		String country = sc.nextLine();
		
		Country kor = Country.KOR;
		Country chi = Country.CHI;
		Country jap = Country.JAP;
		Country usa = Country.USA;
		
		
		if(country.equals(kor.getCountry())) {
			kor.notifyFood(country);
		} else if (country.equals(chi.getCountry())) {
			chi.notifyFood(country);
		} else if (country.equals(jap.getCountry())) {
			jap.notifyFood(country);
		} else if (country.equals(usa.getCountry())) {
			usa.notifyFood(country);
		} else {
			System.out.println("잘못된 입력이다.");
		}
		
		sc.close();
		
		
	}
	
	

	
	
}
