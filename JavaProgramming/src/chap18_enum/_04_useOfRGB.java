package chap18_enum;

import chap18_enum.enums.Calculator;
import chap18_enum.enums.RGB;
import chap18_enum.enums.Season_KHH;

public class _04_useOfRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = Enum.valueOf(RGB.class, "BLUE");
		
		
		System.out.println("빨간색은 " + red.getRed() + 
		", " + red.getGreen() + ", " + red.getBlue());
		
		System.out.println("초록색은 " + green.getRed() + 
				", " + green.getGreen() + ", " + green.getBlue());
				
		System.out.println("파란색은 " + blue.getRed() + 
				", " + blue.getGreen() + ", " + blue.getBlue());
		
//		red.makeWhite();
//		green.makeWhite();
		blue.makeWhite();
		
		
		
//		RGB[] makeArr = RGB.values();
//		for(RGB r : makeArr) {
//			r.makeWhite();
//		}
		
		Season_KHH spring = Season_KHH.SPRING;
		Season_KHH summer = Season_KHH.SUMMER;
		Season_KHH fall = Season_KHH.FALL;
		Season_KHH winter = Season_KHH.WINTER;
		
		spring.printSeasonMonth();
		summer.printSeasonMonth();
		fall.printSeasonMonth();
		winter.printSeasonMonth();
				

	}

}
