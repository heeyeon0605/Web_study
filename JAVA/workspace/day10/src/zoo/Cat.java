package zoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("�Ŀ˳Ŀ�");
	}
	
	public static void main(String[] args) {
		int choice = 1;
		if (choice == 1 || choice == 2 || choice == 3) {
			System.out.println("yes");
		}
		
		LocalDate todaysDate = LocalDate.now(); // ���� ��¥�� �������� LocalDate Ȱ��
		String recipe_date = todaysDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")); // ��¥ ������ String Ÿ������ �ٲ���. "2021124" �̷������� ����
		System.out.println(recipe_date);
	}

}
