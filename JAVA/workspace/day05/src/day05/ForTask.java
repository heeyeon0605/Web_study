package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// �ʱ���� int i = 0, �������� i++�� ����
		Scanner sc = new Scanner(System.in);
		
		// ���� 1
		System.out.println("10���� 1���� ���");
		for (int i = 10; i <= 1; i-=1) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// ���� 2
		System.out.print("\n\n");
		System.out.println("3 ~ 36 3�� ��� ���");
		for (int i = 0; i <= 36; i++) {
			if (i % 3 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
			
			// System.out.println(i*3+3);
		}
		
		// ���� 3
		System.out.print("\n\n");
		System.out.println("100���� 2�� �����ϸ� 20�� ���");
		int times = 0;
		for (int i = 100; i >= 0; i-=2) {
			if (times >= 20) {break;}
			
			System.out.print(i);
			System.out.print(" ");
			times++;
			
			// System.out.println(i*-2+100);
		}
		
		// ���� 4
		System.out.print("\n\n");
		System.out.println("1���� 10������ �� ���");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// ���� 5
		System.out.print("\n\n");
		System.out.println("���� �ϳ� �Է� �޾Ƽ� 1���� �� ������ ���");
		
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// ���� 6
		System.out.print("\n\n");
		System.out.println("���� �� �� n,m �Է¹޾� n���� m���� ���(n�� m���� �۴ٰ� ����)");
		System.out.println("���� n�� �Է��ϼ���.");
		int n = sc.nextInt();
		
		System.out.println("���� m�� �Է��ϼ���.");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// ���� 7
		System.out.print("\n\n");
		System.out.println("1���� 100���� �� ¦���� ���");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

		// ���� 8
		System.out.print("\n\n");
		System.out.println("1���� 100���� �� 3�� 5�� ����� ���");
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		// ���� 9
		System.out.print("\n\n");
		System.out.println("A���� F���� ���");
		for (int i = 65; i <= 70; i++) {
			System.out.print((char)i);
			System.out.print(" ");
		}
		
		// ���� 10
		System.out.print("\n\n");
		System.out.println("A���� F���� ���");
		for (int i = 65; i <= 90; i++) {
			if (i % 2 != 0) {
				System.out.print((char)(i + 32));
				System.out.print(" ");
			}
			else {
				System.out.print((char)i);
				System.out.print(" ");
			}
		}
		
		// for�� �ϳ��� ����ؼ� ������ ��ü ���
		// 10���� ���� �ϳ� �Է¹޾� 2���� ���
		// ABCDefghIJKLmnopQRSTuvwxYZ ���
		// AbCDefGHIjklMNOPqrstUVWXYz ���
		
	}
}
