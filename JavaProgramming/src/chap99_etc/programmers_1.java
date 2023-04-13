package chap99_etc;

import java.util.HashMap;
import java.util.Map;

public class programmers_1 {
//	players	callings	result
//	["mumu", "soe", "poe", "kai", "mine"]	["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] result = {"mumu", "kai", "mine", "soe", "poe"};
		
//		String[] players_raw = players;
		String[] answer = {};
		
		for(int i = 0; i < callings.length; i++) {
//			System.out.println(callings[i]);
			for(int j = 0; j < players.length; j++) {
				if(callings[i] == players[j]) {
					String tmp = players[j];
					players[j] = players[j-1];
					players[j-1] = tmp;
				}
			}
		
		}
//		
//        String temp = players[idx];
//        players[idx] = players[idx - 1];
//        players[idx - 1] = temp;
		
		answer = players;
		
		for(String a : answer) {
			System.out.println(a);
		}
		
		

	}

}
