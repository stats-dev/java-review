package chap20_lambda.clazz;

public class MoneyConvertor {
	public static int convert(int money, char c) { //첫번째는 static으로!
		int convertMoney = 0;
		
		switch(c) {
			case '$':
				convertMoney = money / 1300;
				break;
			case '\\':
				convertMoney = money * 1300;
				break;
			default:
				convertMoney = -1;
				break;
		}
		
		return convertMoney;
	}
	
	//나머지는 그냥 인스턴스로 사용한다.	
	public int instanceConvert(int money, char c) {
		int convertMoney = 0;
		
		switch(c) {
			case '$':
				convertMoney = money / 1500;
				break;
			case '\\':
				convertMoney = money * 1500;
				break;
			default:
				convertMoney = -1;
				break;
		}
		
		return convertMoney;
	}
}
