package chap98_homework.nc230406.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
		
		strList.stream()
				.filter(str -> str.length() >= 5)
				.forEach(str -> System.out.println(str));
		
		
		
		List<HistoricPerson> hpList =
				new ArrayList<HistoricPerson>();
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		Stream<HistoricPerson> hpStream = hpList.stream();
		
		
		System.out.println("업적을 검색하세요.");
		String inputAchievement = sc.nextLine();
		
		hpStream.map(hp -> hp.getPersonInfo(inputAchievement))
				.forEach(hp -> {
					if(hp != null) {
						System.out.println(hp.getName() + ", " 
								+ hp.getAchivement() + ", " + hp.getCountry());
									}
			
								});
		
		
		System.out.println("검색할 나라를 검색하세요.");
		String inputConutry = sc.nextLine();
		
		hpStream = hpList.stream();

		
		hpStream.filter(hp -> 
			hp.getSameCountryPerson(inputConutry))
				.forEach(hp -> System.out.println(hp.getName()
						+ ", " + hp.getAchivement() + ", "
						+ hp.getCountry()));
		
		
		//성이 이씨인 사람을 찾는다.
		hpStream = hpList.stream();
		
		hpStream.filter(hp -> hp.getName().charAt(0) == '이') //char는 그냥 조건문 쓰면 되네요. 굳이 String 아니어도 됨.
				.forEach(hp -> System.out.println(hp.getName()
						+ ", " + hp.getAchivement() + ", "
						+ hp.getCountry())); //성씨가 이인 사람만 구한다.
		
		
		
		//5. 성씨가 명확한 근거가 없어서 성씨에 해당하는 배열을 만들어준다.
		hpStream = hpList.stream();
		
		String[] firstName = {"제갈", "을지", "독고", "황보", "남궁", "동방", "선우"};
		
		hpStream.filter(hp -> {
					for(String fName : firstName) {
						return hp.getName().contains(fName);
					}
					return false; //밖으로 나오면 false로 처리해줘야 마무리가 된다.
				})
				.forEach(hp -> System.out.println(hp.getName()
						+ ", " + hp.getAchivement() + ", "
						+ hp.getCountry()));
		
		
		
		sc.close();
	}

}
