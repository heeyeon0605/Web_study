package day04;

import java.util.Scanner;

// ctrl + shift + F :  �߰�ȣ ��ġ�� �ڵ� ����
public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
		System.out.println("1.Java 2.Python 3.���վ� 4.C���");
		int choice = sc.nextInt();
		
		/*
		// �б�ó��
		if (choice == 3) {
			System.out.println("�����Դϴ�.");
		}
		else if (choice == 1 || choice == 2 || choice == 4) {
			// ~�ų�, ~�Ǵ�, ~Ȥ�� --> ||
			// ~�̰�, ~�ϰ�, ~�̰� --> &&
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		// �ϰ�ó��
//		String result = "";
		String result = "�߸� �Է��ϼ̽��ϴ�.";
		if (choice == 3) {
			result = "�����Դϴ�.";
		}
		else if (choice == 1 || choice == 2 || choice == 4) {
			result = "�����Դϴ�.";
		}
		
//		else {
//			result = "�߸� �Է��ϼ̽��ϴ�.";
//		}
		
		System.out.println(result);
		
	}
	
}
