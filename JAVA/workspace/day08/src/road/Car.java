package road;

public class Car {
	
	String brand;
	String color;
	int price;
	static int wheel = 4; // 각 객체마다 생기는 것이 아님. 모든 객체가 공유.
	
	// Alt + Shift + S 누르고 o 누르면 자동으로
	// 원하는 필드(매개변수)만 선택해서 생성자 만들어줌.
	
	// 생성자 오버로딩
	public Car(){}
	
	// 또 다른 생성자
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// 또 다른 생성자, price만 매개변수로 들어온 경우
	Car(int price) {
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(this.brand + "시동 켜기");
	}
	
	void engineStop() {
		// 같은 이름의 지역 변수가 없다면 this 생략 가능
		System.out.println(brand + "시동 끄기");
	}
}
