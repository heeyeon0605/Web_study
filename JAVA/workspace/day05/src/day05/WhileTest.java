package day05;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		/*
		while(choice != 3) {
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1.Java 2.Python 3.���վ� 4.C���");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		*/
		
		/*
		// 0�̸� Ż��
		while(choice != 0) {
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1.Java 2.Python 3.���վ� 4.C��� 0.������");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 0) {
				System.out.println("�ȳ���������.");
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		*/
		
		/*
		// do-while ��

		do {
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1.Java 2.Python 3.���վ� 4.C��� 0.������");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 0) {
				System.out.println("�ȳ���������.");
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (choice != 0);
		*/
		
		// ���� �ݺ� (break�� Ż��)
		while(true) {
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1.Java 2.Python 3.���վ� 4.C��� 0.������");
			choice = sc.nextInt();
		
			if (choice == 3) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}
			else if (choice == 0) {
				System.out.println("�ȳ���������.");
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}
