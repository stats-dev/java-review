package chap100_coding_test;

public class _02_common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] common = new int[4];
		
		for(int i = 0; i < common.length; i++) {
			common[i] = i+1;
		}
		
		
        int diff = 0;
        int ratio = 0;
        int last_common = 0;
        
        diff = common[1] - common[0];
        
        if(common[0] != 0) {
        	ratio = common[1] / common[0]; //0으로 나눠지면 안되므로, 제약조건을 넣는다.        	
        }

        if(common[1] == common[0] + diff) {
        	last_common = common[common.length-1] + diff;
        } else {
        	last_common = common[common.length-1] * ratio;
        };

        
        System.out.println(last_common);

	}

}
