package road;

public class Road {
	public static void main(String[] args) {
		
		Car mycar = new Car("Ferrari", "Red", 65000);
		// mycar.brand = "Ferrari";
		mycar.engineStart();
		
		Car momcar = new Car("K7", "Yellow", 10000);
		// momcar.brand = "K7";
		momcar.engineStart();
		
		// Car dadcar = new Car(null, null, 28000);
		Car dadcar = new Car(28000);
		
		Car[] garage = {
				new Car("Ferrari", "Red", 65000),
				new Car("K7", "White", 7000),
				new Car(28000)
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
		}
		
		// 새로운 객체들을 배열 사용해서 쉽게 만드는 과정
//		Car[] garage2 = new Car[3];
//		for (int i =0; i < garage2.length; i++) {
//			garage[i] = new Car();
//		}
		
//		garage2[0].engineStart();
		
		mycar.wheel--;
		System.out.println(momcar.wheel);
		
	}
}
