package chap06_class.car;

public class Car_answer {
	
	public String company;
	public String model;
	public String color;
	public String[] option; // 옵션별로 가격이 달라질 수 있음.
	public int price;
	
	
	
	// 오버로딩: 객체는 같아도, 크기가 다를 수 있음. -> 오버로딩을 이용해서 생성자가 만들어지는 것이다!?
	//기본 생성자
	//매개변수가 없다.
	public Car_answer() {
//		company = "현대"; // 이렇게 기본으로 넣어줄 수 있다.
//		model = "아반떼";
		//null 값이 싫다면 기본으로 가능
		
		//String은 null로 초기화되기 때문에
		//데이터에 null이 존재하면 예외가 발생할 확률이 높아지므로 
		//""(빈 문자열)로 초기화해준다.
		company = "";
		model = "";
		color = "";
		System.out.println("기본 생성자 호출");
	}
	
	//매개변수가 있는 생성자 <- 이 매개변수는 쉽게 c 처럼 쓸 수 있다. 값만 받아줄 친구기 때문이다.
	public Car_answer(String c) {
		//해당 변수 초기화 진행
		company = c;
		System.out.println("매개변수 하나인 생성자 호출");
	}
	
	public Car_answer(String c, String m) {
		company = c;
		model = m;
		System.out.println("매개변수 두 개인 생성자 호출"); //매개변수 추가 가능
	}
	
	
	// 매개변수명은 어떤 멤버변수를 초기화할지 명확하게 하기위해 멤버변수명과 일치시킨다.
	// 어디에 들어가는지 명확하기 위해 매개변수 이름을 멤버변수와 같게 하는게 좋다.
	public Car_answer(String company, String model, String color) {
		
		//생성되는 객체 자체를 가르키는 this 키워드 사용해서 멤버변수를 지칭하도록 한다.
		this.company = company;
		//생성된 객체 내  	// 매개변수로 받아온 company
		this.model = model;
		this.color = color;
		System.out.println("매개변수 세 개인 생성자 호출");
	}
	
	
	public Car_answer(String company, String model, String color, int price) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		System.out.println("매개변수 네 개인 생성자 호출");
		
	}
	
	
	
	// 블록 범위를 보면, CarInfo()메소드보다 더 넓으니 바로 가져다 쓸 수 있다.
	public void carInfo() {
		System.out.println("제조사: "+ company);
		System.out.println("모델: "+ model);
		System.out.println("색상: "+ color);
		System.out.println("가격: "+ price);
	}

}
