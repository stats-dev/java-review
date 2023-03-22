package chap98_homework_nc230320;

public class ArrayUtility2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayUtility2 au = new ArrayUtility2();
		
		int[] s1 = {1,2,3,4,6};
		int[] s2 = {3,4,5,6};
		
		int[] test = au.concat(s1, s2);
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
		
		
		System.out.println("remove 시작!");
		int[] test2 = au.remove(s1, s2);
		
		for(int i=0;i<test2.length;i++) {
			System.out.println(test2[i]);
		}

	}

}
