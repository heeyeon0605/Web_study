package casting;

public class Road {
	public static void main(String[] args) {
		Car[] garage = {
				new SuperCar("Ferrari", "Red", 65000),
				new Car("K7", "White", 7000),
				new SuperCar("Porsche", "Yellow", 25000)
		};
	
		for (int i = 0; i < garage.length; i++) {
//			garage[i].engineStart();
			if (garage[i] instanceof SuperCar) {
				((SuperCar)garage[i]).roofOpen();
			}
			else {
				System.out.println(i + "번 자동차는 업캐스팅이 아닙니다.");
			}
		}
	}
}
