package day04;

import java.util.Scanner;

// Ctrl + Alt + �Ʒ�Ű(��Ű) : �Ʒ���(����) ������ �� ����
// Alt + �Ʒ�Ű(��Ű) : �Ʒ���(����) ������ �� �̵�

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
		System.out.println("1.Java 2.Python 3.���վ� 4.C���");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 3 :
			System.out.println("�����Դϴ�.");
			break;
		case 1 :
		case 2 :
		case 4 :
			System.out.println("�����Դϴ�.");
			break;
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
}
