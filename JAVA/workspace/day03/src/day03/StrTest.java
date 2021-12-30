package day03;

import java.util.Scanner;

public class StrTest {

	public static void main(String[] args) {
		String num = "10";
		
		// String은 클래스여서 일반자료형들과 자료형변환이 안됨
		// Inger.parseInt("정수로된문자열") :  통째로 정수 타입으로 바꿔줌
		System.out.println(Integer.parseInt(num) / 3);
		System.out.println(Double.parseDouble(num) / 3);
		
		// sc.next() 로 두 개의 정수를 입력받아서 더한 결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		String num1 = sc.next();
		
		System.out.print("두번째 정수 : ");
		String num2 = sc.next();
		
		// Integer.parseInt("10+3") (X)
		// Integer.parseInt("num1") (X)
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("결과 : " + result);
		;
	}
}
