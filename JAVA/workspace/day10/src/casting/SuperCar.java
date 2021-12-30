package casting;

public class SuperCar extends Car {
	
	String pw;
	
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	// @ : 어노테이션
	@Override
	void engineStop() {
// 		super.engineStop();
		System.out.println(brand + " 지문으로 시동 끄기");
	}
	
	@Override
	void engineStart() {
// 		super.engineStart();
		System.out.println(brand + " 지문으로 시동 켜기");
	}
	
	void roofOpen() {
		System.out.println(brand + " 뚜껑 열기");
	}
	
	void roofClose() {
		System.out.println(brand + " 뚜껑 닫기");
	}
	
}
