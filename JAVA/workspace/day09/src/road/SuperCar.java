package road;

public class SuperCar extends Car {
	
	String pw;
	
	public SuperCar() {
		// super : 부모 클래스의 이름 (Car)
		// Car(); 을 한 것이나 다름이 없음
		super();
	}
	
	// Alt + Shift + S 누르고 c : 부모 클래스에 있는 생성자 받아와서 생성자 만들어주는 단축키
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price); // Car 생성자로 넘어감
		// this 쓰는 대신에 super로 묶어서 한 줄로 끝내기
	}
	
	// pw도 포함된 생성자
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		
		this.pw = pw; // 부모 클래스에 소속되지 않은 변수는 따로 선언
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
