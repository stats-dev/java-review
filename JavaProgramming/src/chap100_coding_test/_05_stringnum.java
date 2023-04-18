package chap100_coding_test;

public class _05_stringnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int answer = 0;
		        int n = 124;

		        String str = String.valueOf(n);

		        for(int i = 0; i < 3; i++) {
		        	int num = str.charAt(i);
		        	num = num - 48;
		        	answer += num;
//		        	System.out.println(num + ": " + answer);
		        }
		        
		        System.out.println(answer);


		        


	}

}
