package chap98_homework_nc230321.car;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 올립니다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 낮춥니다.");

	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 채웁니다.");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("전기차 배터리를 충전합니다.");

	}


}
