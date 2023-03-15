package chap03_operator;

public class _04_threeOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 삼항 조건 연산자
		int num1 = 111;
		int num2 = 10;
		int result = num1 / num2 > 8 ?
				num1 - 11 :
				num2 - 11;
		
		System.out.println(result); // num1 - 11 = 100 
		
		//2. 삼항 조건 연산자의 중첩
		result = num1 / num2 > 8 
				?
					num1 - 11 == 100 ? // true이면 들어가서 다시 조건 비교
							num1 * 2 :
							num1 / 2
				:
				
					num2 - 11 < 0 ? // false이면 다시 조건을 보게 된다.
								num2 * 2 :
								num2 / 2;
		
		System.out.println(result); // 222
		
		
		
	
		

	}

}


