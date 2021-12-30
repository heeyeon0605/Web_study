package zoo;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void makeSomeNoise();
	
	// 자식에서 재정의 불가능
	final void init() {
		System.out.println("나는 동물입니다.");
	}
}
