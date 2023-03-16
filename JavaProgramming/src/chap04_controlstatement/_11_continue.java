package chap04_controlstatement;

import java.util.ArrayList;
import java.util.List;

public class _11_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문의 continue
		// 증감식으로 돌아가는 역할
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				//0~4 까지는 출력되지 않고
				//증감식 돌아가서 i를 1증가시키고
				//다시 조건을 판별한다.
				continue; // 5,6,7,8,9,10

			}
				
			
			System.out.println(i);
		}
		
		
		
		//2. while의 continue
		// while 문은 증감식이 없어서 조건식으로 돌아간다.
		int num = 0;
		while(num <= 20) {
			num++;
			
			if(num % 3 == 0) {
				continue;
			}
			
			System.out.println(num);
			
		}
		
		// 비밀글은 삭제하지 않는다..
		//3.
		List<String> memberList = 
				new ArrayList<String>(); // list 임포트
		
		//모든 회원 아이디에 a를 붙이는 작업
		for(int i = 0; i < memberList.size(); i++) { // 리스트에서는 size로 채울 수 있다.
			//아이디가 admin인 회원은 제외한다.
			if(memberList.get(i).equals("admin")) {
				continue;
			}
				
			String newmemberId = memberList.get(i) + "a"; // 모든 멤버에 a 붙여서 업데이트 한다. 근데 관리자 제외하려면, continue 넣는다.
			
		}
		

	}

}
