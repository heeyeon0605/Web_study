package zoo;

public class Dog extends Animal{

	public Dog() {
		super();
	}

	public Dog(String name, int age, String gender, String breed) {
		super(name, age, gender, breed);
	}

	@Override
	void howl() {
		System.out.println(name + "이(가) 월월 울고 있습니다.");
	}
	
}
