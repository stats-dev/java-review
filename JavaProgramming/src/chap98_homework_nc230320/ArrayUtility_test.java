package chap98_homework_nc230320;

public class ArrayUtility_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {1,2,3,4,5};
		
		ArrayUtility sc = new ArrayUtility();
		
		
		for(int i=0;i<source.length;i++) {
			System.out.print(sc.intToDouble(source)[i] + " ");
		}
		
		System.out.println();
		
		double[] test = sc.intToDouble(source);
		
		for(int i=0;i<source.length;i++) {
			System.out.print(sc.doubleToInt(test)[i] + " ");
		}


	}

}
