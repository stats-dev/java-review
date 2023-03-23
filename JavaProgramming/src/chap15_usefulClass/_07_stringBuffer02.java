package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(100);
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		sb1.append("navercloud");
		
		//capacity()와 length()의 차이점
		System.out.println(sb1.capacity()); // 100 지정한거 나옴. 버퍼의 크기.
		System.out.println(sb1.length()); // navercloud 문자 길이만큼 나올 것이다.10?
		
		
		//delete()와 insert()
		StringBuffer sb3 = sb2.delete(3, 7); // camp 날려보기 -> bit만 나온다.
		System.out.println(sb3);
		
		
		sb3 = sb3.insert(3, "camp");
		System.out.println(sb3);
		
		//reverse()
		sb1 = sb1.reverse(); // navercloud 뒤집기.
		System.out.println(sb1);
		
		//setCharAt()
		sb3.setCharAt(3, 'C'); //3번을 대문자 C로 바꾼다.
		System.out.println(sb3);
		
		
		//setLength()
		sb3.setLength(10); // 공백이 3개 생길 것입니다.
		System.out.println(sb3);
		
		
		
		
		


	}

}
