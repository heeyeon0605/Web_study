package zoo;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("¿Ð¿Ð");
	}
	
}
