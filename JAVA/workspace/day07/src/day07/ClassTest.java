package day07;

public class ClassTest {

	public static void main(String[] args) {
		// null : �ּҰ��� �ʱⰪ
		Car mycar = new Car();
		System.out.println(mycar.brand);
		
		mycar.brand = "Ferrari";
		mycar.color = "Red";
		mycar.price = 65000;
		System.out.println(mycar.brand);
		mycar.engineStart();
		
 	}
	
}

class Car {
	String brand;
	String color;
	int price;
	
	void engineStart() {
		System.out.println("�õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println("�õ� ����");
	}
}