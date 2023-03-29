package chap18_enum.enums;

public enum RGB_khh2 {
	//상수명 RED("red", 255, 0, 0), 
	//	   GREEN, 
	//     BLUE
	RED("red", 255, 0, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			System.out.println(color[1] + ", " + color[2] + " 색상이 부족합니다.");
//			System.out.println(color[2] + "가 부족합니다.");
		}
	},
	GREEN("green", 0, 255, 0){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			System.out.println(color[0] + ", "  + color[2] + " 색상이 부족합니다.");
//			System.out.println(color[2] + "가 부족합니다.");
		}
	},
	BLUE("blue", 0, 0, 255){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			System.out.println(color[0] +", "  + color[1] + " 색상이 부족합니다.");
//			System.out.println(color[1] + "가 부족합니다.");
		}
	};
	
	private String colorStr;
	private int red;
	private int green;
	private int blue;
	
	RGB_khh2(String colorStr, int red, int green,
			int blue) {
		this.colorStr = colorStr;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getColorStr() {
		return colorStr;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	
	
	// 추상메소드
	public abstract void makeWhite();
	
	
	// 구현된 기능을 쓸 수 있는게 참조타입, 기능이 없는게 원시타입이다.
	
}
