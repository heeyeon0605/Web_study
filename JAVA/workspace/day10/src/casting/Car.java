package casting;

public class Car {
	String brand;
	String color;
	int price;
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(this.brand + " ����� �õ� �ѱ�");
	}
	
	void engineStop() {
		// ���� �̸��� ���� ������ ���ٸ� this ���� ����
		System.out.println(brand + " ����� �õ� ����");
	}
}
