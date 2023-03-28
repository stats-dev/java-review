package chap98_homework_20230328;

public class Calculator<T extends Number> {
//	3.  T 배열을 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 Calculator 제네릭 클래스를 구현하세요.
//    각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
//    (Math.round()로 소수점 두자리까지만 표출)
	
    private T[] nums;

    public Calculator(T[] nums) {
        this.nums = nums;
    }

    public double add() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public double sub() {
        double diff = nums[0].doubleValue();
        for (int i = 1; i < nums.length; i++) {
            diff -= nums[i].doubleValue();
        }
        return Math.round(diff * 100.0) / 100.0;
    }

    public double mul() {
        double product = 1;
        for (T num : nums) {
            product *= num.doubleValue();
        }
        return Math.round(product * 100.0) / 100.0;
    }

    public double div() {
        double quotient = nums[0].doubleValue();
        for (int i = 1; i < nums.length; i++) {
            quotient /= nums[i].doubleValue();
        }
        return Math.round(quotient * 100.0) / 100.0;
    }
}
