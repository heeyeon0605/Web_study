package zoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("냐옹냐옹");
	}
	
	public static void main(String[] args) {
		int choice = 1;
		if (choice == 1 || choice == 2 || choice == 3) {
			System.out.println("yes");
		}
		
		LocalDate todaysDate = LocalDate.now(); // 현재 날짜를 가져오는 LocalDate 활용
		String recipe_date = todaysDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")); // 날짜 형식을 String 타입으로 바꿔줌. "2021124" 이런식으로 저장
		System.out.println(recipe_date);
	}

}
