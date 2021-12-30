package zoo;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void makeSomeNoise();
	
	// �ڽĿ��� ������ �Ұ���
	final void init() {
		System.out.println("���� �����Դϴ�.");
	}
}
