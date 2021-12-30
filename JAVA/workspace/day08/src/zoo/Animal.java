package zoo;

public class Animal {
	
	String name;
	int age;
	String gender;
	String breed;
	
	public Animal() {}
	
	public Animal(String name, int age, String gender, String breed) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.breed = breed;
	}

	void eat() {
		System.out.println(this.name + "��(��) �԰� �ֽ��ϴ�.");
	}
	
	void sleep() {
		System.out.println(this.name + "��(��) �ڰ� �ֽ��ϴ�.");
	}
	
	void move() {
		System.out.println(this.name + "��(��) �����̰� �ֽ��ϴ�.");
	}
	
	void howl() {
		System.out.println(this.name + "��(��) ��� �ֽ��ϴ�.");
	}
	
	
}
