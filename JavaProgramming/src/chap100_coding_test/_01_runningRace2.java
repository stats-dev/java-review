package chap100_coding_test;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class _01_runningRace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] result = {"mumu", "kai", "mine", "soe", "poe"};
		
		
		String temp = "";
		

		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i] == players[j]) {
					temp = players[j-1];
					players[j-1]=players[j];
					players[j] = temp;
				}
			}
		}
		
		
		
		for(String p : players) {
			System.out.printf("%s, ", p);
			
		}
		
		
		
		
		
	}

}
