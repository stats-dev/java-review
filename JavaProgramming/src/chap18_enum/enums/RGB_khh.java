package chap18_enum.enums;

public enum RGB_khh {
	
	//상수명 RED("red", 255,0,0), 
	//Green,BLUE
	
	RED("red",255,0,0){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					//세가지 중 하나
					if(index == 0) {
						System.out.println(s + ", ");
					} else {
						System.out.println(s + " ");
						
					}
					
				}
				
				index++;
			}
			
			System.out.println("색상이 부족합니다.");
		}
	},
	GREEN("green",0,255,0){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					//세가지 중 하나
					if(index == 0) {
						System.out.println(s + ", ");
					} else {
						System.out.println(s + " ");
						
					}
					
				}
				
				index++;
			}
			
			System.out.println("색상이 부족합니다.");
		}
	},
	BLUE("blue",0,0,255){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					//세가지 중 하나
					if(index == 0) {
						System.out.println(s + ", ");
					} else {
						System.out.println(s + " ");
						
					}
					
				}
				
				index++;
			}
			
			System.out.println("색상이 부족합니다.");
		}
	}; //더 선언할거면 comma를 주고, 종결시 semi-colon 넣기!

	private String color;
	private int rVal;
	private int gVal;
	private int bVal;
	

	private RGB_khh(String color, int rVal, int gVal, int bVal) {
		this.color = color;
		this.rVal = rVal;
		this.gVal = gVal;
		this.bVal = bVal;
	}
	
	
	public String getColor() {
		return color;
	}

	public int getrVal() {
		return rVal;
	}
	
	public int getgVal() {
		return gVal;
	}
	public int getbVal() {
		return bVal;
	}
	
	
	
//	private RGB(String color) {
//		// TODO Auto-generated constructor stub
//		this.color = color;
//	}

	
	

	

}
