package zoo;

public class Cat extends Animal{

	public Cat() {
		super();
	}

	public Cat(String name, int age, String gender, String breed) {
		super(name, age, gender, breed);
	}

	@Override
	void howl() {
		System.out.println(name + "��(��) ���� ��� �ֽ��ϴ�.");
	}
	
}
