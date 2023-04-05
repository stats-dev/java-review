package chap20_lambda;

import java.util.function.Function;

public class _09_referMultiMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Function<String, String> func = s -> {
//			String result = s.concat("aa");
//			result = s.toUpperCase(s);
//			return result;
//		};

		
		Function<String, String> func = String :: toUpperCase;
		func = func.andThen(s -> s.concat("AA"));
		
		String result = func.apply("bbb");
		
		System.out.println(result);
		
	}

//    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
//        Objects.requireNonNull(after);
//        return (T t) -> after.apply(apply(t));
//    }
}


