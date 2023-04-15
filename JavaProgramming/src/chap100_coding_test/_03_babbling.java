package chap100_coding_test;

public class _03_babbling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]
		String[] babbling = new String[5];
		
		babbling[0] = "ayaye";
		babbling[1] = "uuuma";
		babbling[2] = "ye";
		babbling[3] = "yemawoo";
		babbling[4] = "ayaa";
		
		int idx = 0;

		
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replaceFirst("aya", "");
			babbling[i] = babbling[i].replaceFirst("ye", "");
			babbling[i] = babbling[i].replaceFirst("woo", "");
			babbling[i] = babbling[i].replaceFirst("ma", "");
		
			if(babbling[i].equals("")) {
				idx++;
			}
		}
		
		System.out.println(idx);
		
		
	}

}
