package chap98_homework_nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요: ");
		for(int i = 0;i<5; i++) {
			intList.add(sc.nextInt());
		}
		
		System.out.println(intList);
		
		
//		2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		System.out.println("정수 5개를 입력하세요: ");
		
		for(int i = 0;i<5; i++) {
			lList.add(i,sc.nextInt());
		}
		
		lList.set(3,100);
		lList.set(4, 200);
		
		System.out.println(lList);
		
		sc.close();
		
//		3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		for(int i = 65; i < 70; i++) {
			map.put("Key " + (char) i, i);
		}
		
		System.out.println(map);
		
		
	}

}
