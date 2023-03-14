package chap02_variables;

public class _10_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동형변환1 - 바이트 크기가 작은 변수를
		//바이트 크기가 큰 변수에 대입할 때 자동으로
		//크기가 큰 변수의 자료형으로 변경된다.
		short sNum1 = 10;
				
		//short형인 sNum1이 int형으로 변환된 후
		//iNum1에 대입
		int iNum1 = sNum1;
		
		//2. 자동형변환2 - 좀 더 세밀한 표현범위를 갖는
		//타입에 대입될 때 자동 형변환이 일어난다.
		long lNum1 = 1000000000L;
		//long 타입의 변수인 lNum1이 바이트 크기는 크지만
		//float가 더 세밀하고 넓은 표현범위를 갖기 때문에
		//lNum1이 float로 변환된 후 fNum1으로 대입
		float fNum1 = lNum1; // long이 바이트 크기가 크지만, float 세밀함.
		
		
		//3. 강제 형변환1 - 바이트 크기가 큰 변수를 바이트
		//크기가 작은 변수로 형변환해야할 때 변환될 자료형을
		//명시해준다.
		int uniCode = 65;
		char ch = (char)uniCode; //유니코드값을 강제로 문자로 형변환 시키는 케이스가 있다.
		//System.out.println(ch);
		
		
		//4. 강제형변환에서 범위를 초과한 값을 변환했을때
		// short는 아마 32767까지 표출이 가능할 것이므로, 이렇게 범우 ㅣ초과하는 것을 확인해볼 수 있다.
		long lNum2 = 32770L;
		short sNum2 = (short)lNum2;
		
		
		//32,767을 초과하면 -32,768부터 다시 시작된다.
		//32,770은 3이 남기때문에 32,767부터 3칸을 
		//더 이동한다 -> 그 결과 -32,768, -32,767, -32,766 이렇게 이동한다.
		System.out.println(sNum2); // -32766

		//5. 연산에서의 형변환
		// 5-1 묵시적, 자동 형변환 케이스
		//피연산자중 바이트 크기가 작은 변수가
		//바이트 크기가 큰 자료형으로 변환된 후
		//연산이 진행된다.
		long result = lNum2 + iNum1;
		// 이 경우 iNum1도 long으로 변환 후 연산되어 long으로 나옵니다.1

		// 5-2. 명시적, 강제 형변환 케이스
		//강제형변환을 통해 크기가 큰 변수를
		//크기가 작은 자료형으로 변환하여 연산할 수도 있다.
		int result2 = (int)lNum2 + iNum1; 

		
		//6. 문자열 결합 연산에서의 형변환
		//문자열과 다른 모든 타입들 + 연산하면,
		//다른 모든 타입들이 문자열로 형변환 후
		//문자열 결합 연산 진행된다.
		
		String str = "java";
		int version = 11;
		
		
		System.out.println(str + version); // java11 이라는 문자열이 나타나게 됩니다.

		
		

	}

}
