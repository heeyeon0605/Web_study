package zoo;

import road.Car;

public class Ground {
	public static void main(String[] args) {
		
		// ���� ������ ���� ����ϱ�
		// �̸� ���� ���� ��
		// �Ա� �ڱ� �����̱� ���
		// �����Ҹ��� ���� �ٸ��� �ϱ�
		
		Monkey monkey1 = new Monkey("mon", 5, "male", "monmon");
		Dog dog1 = new Dog("doggy", 10, "male", "puddle");
		Cat cat1 = new Cat("cata", 7, "female", "gil");
		
		monkey1.sleep();
		dog1.eat();
		cat1.move();
		
		Animal [] animal_list = {monkey1, dog1, cat1};
		
		while (true) {
			for (int i = 0; i < animal_list.length; i++) {
				animal_list[i].howl();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

		}
		
	}
}
