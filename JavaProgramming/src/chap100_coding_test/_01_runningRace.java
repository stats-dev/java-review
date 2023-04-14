package chap100_coding_test;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class _01_runningRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 예를 들어
		 * 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인
		 * "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.
		 * 
		 * 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가
		 * 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를
		 * 완성해주세요.
		 */
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] result = {"mumu", "kai", "mine", "soe", "poe"};
		
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < players.length; i++) {
			pMap.put(players[i], i);
		}
		
		System.out.println(pMap);
		System.out.println(pMap.values());
//		{mine=4, kai=3, mumu=0, poe=2, soe=1}
//		[4, 3, 0, 2, 1]
//
//		
		//순서(value값)을 모두 변경한다.
		for(String c : callings) {
			int idx = pMap.get(c); //각 선수의 순위값 저장
			if (idx > 0) { //1등이 아니면,
				String temp = players[idx - 1]; //앞의 순위 선수
				players[idx - 1] = players[idx]; //앞의 선수는 현재 선수가 된다.
				players[idx] = temp;//현재 순위는 앞의 선수가 다시 뒤로 밀려남.
				
				pMap.put(players[idx - 1], idx - 1);
//				pMap.put(players[idx], idx); //그 바뀐 앞, 뒤 선수의 순서와 이름을 모두 반영한다.
				
				
			}
			
		}
		
		
		for(String p : players) {
			System.out.println(p); 
		}
		
		
		
		
		
	}

}
