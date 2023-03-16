package chap98_homework_nc230314;

public class _06_advancedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + ifelse 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
		String str = "dBEfIZ";
		String rstr = "";

		
		
		/*
		 * for (int i=0;i < str.length();i++){
		 * 
		 * char chr = str.charAt(i);
		 * 
		 * if (chr == 90) { char capCh = 97; rstr = capCh + rstr;
		 * 
		 * } else if (chr >= 'A' && chr <= 'Z') {
		 * 
		 * char capCh = (char)(chr + 33); rstr = capCh + rstr; } else {
		 * 
		 * char capCh = (char)(chr - 33); rstr = capCh + rstr;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(rstr);
		 */
		
		
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			char convertCh = ch >= 'A' && ch <= 'Z'
//					?
//					(ch + 33) > 'z' ?
//							(char) (('a' - 1) + ((ch + 33) - 'z')) : // 3을 더해서 c가 될 수 있게, 96을 만듭니다. 'a' - 1
//							(char) (ch + 33) // 96에서 네칸 떨어져있는 d를 잡아내기 위함이다.
//					:
//					(ch - 33) < 'A' ?
//							(char)(('Z' + 1) - ('A' - (ch - 33))) : // 다시 Z부터 시작할 수 있게 그만큼 빼주는 연산이다.
//							(char)(ch - 33);
//			System.out.println(convertCh);
//			rstr = convertCh + rstr;
//		}
//		
//		System.out.println(rstr);
		
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char convertCh;
			if(ch >= 'A' && ch <= 'Z') {
				if((ch+33) > 'z') {
					convertCh = (char)(('a' - 1 ) + ((ch + 33) - 'z'));
				} else {
					convertCh = (char)(ch+33);
				}
								
			} else {
				if((ch - 33) < 'A') {
					
					convertCh = (char)(('Z' + 1) - ('A' - (ch - 33)));
				} else {
					convertCh = (char)(ch - 33);
				} 
			}
			
			result = convertCh + result;
			
		} 
	
		System.out.println(result);
		
	}

}
