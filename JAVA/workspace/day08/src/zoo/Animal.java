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
		System.out.println(this.name + "이(가) 먹고 있습니다.");
	}
	
	void sleep() {
		System.out.println(this.name + "이(가) 자고 있습니다.");
	}
	
	void move() {
		System.out.println(this.name + "이(가) 움직이고 있습니다.");
	}
	
	void howl() {
		System.out.println(this.name + "이(가) 울고 있습니다.");
	}
	
	
}
