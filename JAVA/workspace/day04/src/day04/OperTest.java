package day04;

import java.util.Scanner;

public class OperTest {

	public static void main(String[] args) {
		// ����ڿ��� ���� �Է¹޾Ƽ� ������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
				
		String result = num > 0 ? "���" : "����";
		System.out.println(result);
	}
	
}
