package day04;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수");
		}
		else if (num < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		
	}
	
}
