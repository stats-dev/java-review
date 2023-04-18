package chap100_coding_test;

public class _04_parallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
//        [[3, 5], [4, 1], [2, 4], [5, 10]]
        
//        [a-b, c-d],[a-c, b-d],[a-d, b-c]
		int answer = 0;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
        
        result1 = ((double)(dots[0][0] - dots[1][0]) / (double)(dots[0][1] - dots[1][1]))
                == ((double)(dots[2][0] - dots[3][0]) / (double)(dots[2][1] - dots[3][1])) ? 1 : 0;
        
        result2 = ((double)(dots[0][0] - dots[2][0]) / (double)(dots[0][1] - dots[2][1]))
                == ((double)(dots[1][0] - dots[3][0]) / (double)(dots[1][1] - dots[3][1])) ? 1 : 0;
    
        result3 = ((double)(dots[0][0] - dots[3][0]) / (double)(dots[0][1] - dots[3][1]))
                == ((double)(dots[2][0] - dots[1][0]) / (double)(dots[2][1] - dots[1][1])) ? 1 : 0;
        
        answer = result1 == 1 ? 1 : result2 == 1 ? 1 : result3 == 1 ? 1 : 0;
        
        System.out.println(answer);
        
        
        
	}

}
