package day04;

import java.util.Scanner;

// ctrl + shift + F :  중괄호 위치들 자동 정렬
public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
		System.out.println("1.Java 2.Python 3.망둥어 4.C언어");
		int choice = sc.nextInt();
		
		/*
		// 분기처리
		if (choice == 3) {
			System.out.println("정답입니다.");
		}
		else if (choice == 1 || choice == 2 || choice == 4) {
			// ~거나, ~또는, ~혹은 --> ||
			// ~이고, ~하고, ~이고 --> &&
			System.out.println("오답입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		// 일괄처리
//		String result = "";
		String result = "잘못 입력하셨습니다.";
		if (choice == 3) {
			result = "정답입니다.";
		}
		else if (choice == 1 || choice == 2 || choice == 4) {
			result = "오답입니다.";
		}
		
//		else {
//			result = "잘못 입력하셨습니다.";
//		}
		
		System.out.println(result);
		
	}
	
}
