package zoo;

public class Monkey extends Animal{

	public Monkey() {
		super();
	}

	public Monkey(String name, int age, String gender, String breed) {
		super(name, age, gender, breed);
	}
	
	@Override
	void howl() {
		System.out.println(name + "��(��) ���� ��� �ֽ��ϴ�.");
	}
}
