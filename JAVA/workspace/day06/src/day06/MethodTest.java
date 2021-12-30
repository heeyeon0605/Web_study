package day06;

import java.util.Scanner;

public class MethodTest {
	// ctrl + 클릭 : 사용하고 있는 메소드 선언부로 이동

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		
		// class가 MethodTest니까 앞에 붙여야 함.
		MethodTest m = new MethodTest();
		int result = m.f(10);
		System.out.println(result);
		m.f(87);
		m.f(7);
		m.printName();
		m.printJava(5);
	}
	
	int f(int x) {
		return 2*x + 1;
	}
	
	// 이름 10번 출력하는 메소드
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("홍길동");
		}
	}
	
	// "Java" 문자열을 원하는 숫자만큼 출력하는 메소드
	void printJava(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Java");
		}
	}
	
	// 현재 시간 정보를 돌려주는 메소드
//	시간타입 getTime() {
//		return 시간정보;
//	}
	
	// 메소드 이름에 is, has가 들어간 경우에는 매개변수가 있고 return타입은 boolean타입이다.
	// 넘긴 숫자가 정수인지 판별하는 메소드
//	boolean isInt(int num) {
//		return true/false;
//	}
	
}


