package road;

public class Home {
	public static void main(String[] args) {
		
		// mycar1 = 100����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�)
		SuperCar mycar1 = new SuperCar("Ferrari", "Red", 65000, "abcd");
		
		// mycar2 = 100����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�) : ��ĳ����
		// ��ĳ����
		Car mycar2 = mycar1;
		mycar2.engineStart();
		// mycar3 = 200����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�) : ��ĳ����
		// Car mycar3 = new SuperCar(null, null, 0);
		
		// �ٿ�ĳ����
		
		SuperCar downObj = (SuperCar)mycar2;
		downObj.roofOpen(); // ((SuperCar)mycar2).roofOpen();
		
		// ��ĳ���ð� �ٿ�ĳ���� Ȱ�� ����
		
//		SuperCar mycar = new SuperCar("Ferrari", "Red", 65000, "abcd");
//		Car momcar = new Car("K7", "White", 7000);
//		SuperCar dadcar = new SuperCar("Porsche", "Yellow", 25000, "abcd");
		
		// ������ �� �ٸ� Ŭ���� Ÿ���̶� �迭 �ȿ� ���� �� ���µ�, ��ĳ���� ���п� ����.
		
		Car[] garage = {	
				new SuperCar("Ferrari", "Red", 65000, "abcd"), // �ڵ� ��ĳ����
				new Car("K7", "White", 7000),
				new SuperCar("Porsche", "Yellow", 25000, "abcd") // �ڵ� ��ĳ����
		};
		
		for (int i = 0; i< garage.length; i++) {
			garage[i].engineStart(); // �������̵� �� �޼ҵ�� ��ĳ��Ʈ �ߴ��� �� ����.
		}
		
		// �ٵ� ���� �������̵� ���� ���� �ڽ� Ŭ������ �޼ҵ� ����ϰ� ���� �� �ٿ�ĳ����!
		((SuperCar)garage[0]).roofOpen();
		((SuperCar)garage[1]).roofOpen();
		
		
	}
}
