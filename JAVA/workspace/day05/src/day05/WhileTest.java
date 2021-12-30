package day05;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		/*
		while(choice != 3) {
			System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
			System.out.println("1.Java 2.Python 3.망둥어 4.C언어");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("정답입니다.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		*/
		
		/*
		// 0이면 탈출
		while(choice != 0) {
			System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
			System.out.println("1.Java 2.Python 3.망둥어 4.C언어 0.나가기");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("정답입니다.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다.");
			}
			else if (choice == 0) {
				System.out.println("안녕히가세요.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		*/
		
		/*
		// do-while 문

		do {
			System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
			System.out.println("1.Java 2.Python 3.망둥어 4.C언어 0.나가기");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("정답입니다.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다.");
			}
			else if (choice == 0) {
				System.out.println("안녕히가세요.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (choice != 0);
		*/
		
		// 무한 반복 (break로 탈출)
		while(true) {
			System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
			System.out.println("1.Java 2.Python 3.망둥어 4.C언어 0.나가기");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("정답입니다.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다.");
			}
			else if (choice == 0) {
				System.out.println("안녕히가세요.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
}
