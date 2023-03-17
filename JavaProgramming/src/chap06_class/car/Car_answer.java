package chap06_class.car;

public class Car_answer {
	
	public String company;
	public String model;
	public String color;
	public int price;
	
	
	// 블록 범위를 보면, CarInfo()메소드보다 더 넓으니 바로 가져다 쓸 수 있다.
	public void carInfo() {
		System.out.println("제조사: "+ company);
		System.out.println("모델: "+ model);
		System.out.println("색상: "+ color);
		System.out.println("가격: "+ price);
	}

}
