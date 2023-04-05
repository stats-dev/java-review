package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_parallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i); //바로 추가
		}
		System.out.println();
		
		
		//병렬처리 스트림 얻기 : parallelSteram() 사용
						//이게 스레드풀을 만들어서 여러개 스레드 만들고 거기서 하나씩 실제로 뿌려서 확인하실 수 있다.
		//병렬처리 스트림은 스레드 풀을 생성해서
		//여러개 스레드를 사용해서 작업을 병렬처리할 수 있도록 한다.
		Stream<Integer> intStream = intList.parallelStream();
		intStream.forEach(num -> {
			System.out.println(num + " : " + Thread.currentThread().getName());
		});

//		6 : main
//		5 : main
//		8 : main
//		9 : main
//		2 : ForkJoinPool.commonPool-worker-1
//		7 : ForkJoinPool.commonPool-worker-2
//		0 : ForkJoinPool.commonPool-worker-2
//		3 : ForkJoinPool.commonPool-worker-4
//		1 : main
//		4 : ForkJoinPool.commonPool-worker-3
		

	}

}
