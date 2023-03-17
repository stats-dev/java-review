package chap98_homework_nc230316_answer;

public class _05_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
			
		}
		
		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.println(nums[j]); //홀수는 정답 출력
			} else {
				System.out.println(nums[nums.length - 2 - j]); //짝수는 역순으로 18번 들어가게끔 해서 처리..
				//System.out.println(nums[18 - j]);
			}
		}
	}

}
