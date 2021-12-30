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
		System.out.println(this.brand + " 열쇠로 시동 켜기");
	}
	
	void engineStop() {
		// 같은 이름의 지역 변수가 없다면 this 생략 가능
		System.out.println(brand + " 열쇠로 시동 끄기");
	}
}
