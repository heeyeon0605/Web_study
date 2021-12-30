package road;

public class SuperCar extends Car {
	
	String pw;
	
	public SuperCar() {
		// super : �θ� Ŭ������ �̸� (Car)
		// Car(); �� �� ���̳� �ٸ��� ����
		super();
	}
	
	// Alt + Shift + S ������ c : �θ� Ŭ������ �ִ� ������ �޾ƿͼ� ������ ������ִ� ����Ű
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price); // Car �����ڷ� �Ѿ
		// this ���� ��ſ� super�� ��� �� �ٷ� ������
	}
	
	// pw�� ���Ե� ������
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		
		this.pw = pw; // �θ� Ŭ������ �Ҽӵ��� ���� ������ ���� ����
	}
	
	// @ : ������̼�
	@Override
	void engineStop() {
// 		super.engineStop();
		System.out.println(brand + " �������� �õ� ����");
	}
	
	@Override
	void engineStart() {
// 		super.engineStart();
		System.out.println(brand + " �������� �õ� �ѱ�");
	}
	
	void roofOpen() {
		System.out.println(brand + " �Ѳ� ����");
	}
	
	void roofClose() {
		System.out.println(brand + " �Ѳ� �ݱ�");
	}
	
}
