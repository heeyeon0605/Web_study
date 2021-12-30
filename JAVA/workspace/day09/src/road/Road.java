package road;

public class Road {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Ferrari", "Red", 65000);
		mycar.engineStart();
		mycar.roofOpen();
		Car momcar = new Car("K7", "White", 7000);
		momcar.engineStart();
		
		mycar.engineStop();
	}
}
