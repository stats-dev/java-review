package chap18_enum.enums;

import java.util.ArrayList;
import java.util.List;

public enum Season_KHH {
	SPRING("봄") {
		//봄은 3, 4, 5월입니다.
		public void printSeasonMonth() {
			String[] season = {"봄", "여름", "가을", "겨울"};
			int[] months = new int[12];
			
			for(int i = 0; i < 12; i++) {
				months[i] = i+1;
			}
			
			
			for(String s : season) {
				if(s.equals(this.getKoreaSeason())) {
					System.out.println(this.getKoreaSeason() + "은 " + months[2] +", " + months[3] +", "+ months[4] + "월 입니다.");
				} 
			
			}
			
		}
		
	}, SUMMER("여름"){
		//여름은 6, 7, 8월입니다.
		public void printSeasonMonth() {
			String[] season = {"봄", "여름", "가을", "겨울"};
			int[] months = new int[12];
			
			for(int i = 0; i < 12; i++) {
				months[i] = i+1;
			}
			
			
			for(String s : season) {
				if(s.equals(this.getKoreaSeason())) {
					System.out.println(this.getKoreaSeason() + "은 " + months[5] +", " + months[6] +", "+ months[7] + "월 입니다.");
				} 
			
			}
			
		}
	}, FALL("가을"){
		//가을은 9, 10, 11월입니다.
		public void printSeasonMonth() {
			String[] season = {"봄", "여름", "가을", "겨울"};
			int[] months = new int[12];
			
			for(int i = 0; i < 12; i++) {
				months[i] = i+1;
			}
			
			
			for(String s : season) {
				if(s.equals(this.getKoreaSeason())) {
					System.out.println(this.getKoreaSeason() + "은 " + months[8] +", " + months[9] +", "+ months[10] + "월 입니다.");
				} 
			
			}
			
		}
	}, WINTER("겨울"){
		//겨울은 12, 1, 2월입니다.
		public void printSeasonMonth() {
			String[] season = {"봄", "여름", "가을", "겨울"};
			int[] months = new int[12];
			
			for(int i = 0; i < 12; i++) {
				months[i] = i+1;
			}
			
			
			for(String s : season) {
				if(s.equals(this.getKoreaSeason())) {
					System.out.println(this.getKoreaSeason() + "은 " + months[11] +", " + months[0] +", "+ months[1] + "월 입니다.");
				} 
			
			}
			
		}
	};
	
	private String koreaSeason;
	

	
	Season_KHH(String koreaSeason) {
		this.koreaSeason = koreaSeason;
	}

	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	//몇월까지인지 출력하면 된다.
	public abstract void printSeasonMonth();
	

}
