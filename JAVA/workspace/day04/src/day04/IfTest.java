package day04;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("���");
		}
		else if (num < 0) {
			System.out.println("����");
		}
		else {
			System.out.println("0");
		}
		
	}
	
}
