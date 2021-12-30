package road;

public class Home {
	public static void main(String[] args) {
		
		// mycar1 = 100번지(SuperCar 생성자로 만든 필드의 주소값)
		SuperCar mycar1 = new SuperCar("Ferrari", "Red", 65000, "abcd");
		
		// mycar2 = 100번지(SuperCar 생성자로 만든 필드의 주소값) : 업캐스팅
		// 업캐스팅
		Car mycar2 = mycar1;
		mycar2.engineStart();
		// mycar3 = 200번지(SuperCar 생성자로 만든 필드의 주소값) : 업캐스팅
		// Car mycar3 = new SuperCar(null, null, 0);
		
		// 다운캐스팅
		
		SuperCar downObj = (SuperCar)mycar2;
		downObj.roofOpen(); // ((SuperCar)mycar2).roofOpen();
		
		// 업캐스팅과 다운캐스팅 활용 예시
		
//		SuperCar mycar = new SuperCar("Ferrari", "Red", 65000, "abcd");
//		Car momcar = new Car("K7", "White", 7000);
//		SuperCar dadcar = new SuperCar("Porsche", "Yellow", 25000, "abcd");
		
		// 원래는 다 다른 클래스 타입이라서 배열 안에 담을 수 없는데, 업캐스팅 덕분에 가능.
		
		Car[] garage = {	
				new SuperCar("Ferrari", "Red", 65000, "abcd"), // 자동 업캐스팅
				new Car("K7", "White", 7000),
				new SuperCar("Porsche", "Yellow", 25000, "abcd") // 자동 업캐스팅
		};
		
		for (int i = 0; i< garage.length; i++) {
			garage[i].engineStart(); // 오버라이딩 된 메소드는 업캐스트 했더라도 잘 나옴.
		}
		
		// 근데 이제 오버라이딩 되지 않은 자식 클래스의 메소드 사용하고 싶을 때 다운캐스팅!
		((SuperCar)garage[0]).roofOpen();
		((SuperCar)garage[1]).roofOpen();
		
		
	}
}
