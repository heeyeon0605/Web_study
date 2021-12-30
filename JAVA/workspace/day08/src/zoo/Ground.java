package zoo;

import road.Car;

public class Ground {
	public static void main(String[] args) {
		
		Animal monkey = new Animal("mon", 5, "male", "monmon");
		Animal dog = new Animal("doggy", 10, "male", "puddle");
		Animal cat = new Animal("cata", 7, "female", "gil");
		
		monkey.sleep();
		dog.eat();
		cat.move();
		
	}
}
