package road;

public class Car {
	String brand;
	String color;
	int price;
	static int wheel = 4; 
	
	// ������ �����ε�
	public Car(){}
	
	// �� �ٸ� ������
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// �� �ٸ� ������, price�� �Ű������� ���� ���
	Car(int price) {
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
