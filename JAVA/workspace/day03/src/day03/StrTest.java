package day03;

import java.util.Scanner;

public class StrTest {

	public static void main(String[] args) {
		String num = "10";
		
		// String�� Ŭ�������� �Ϲ��ڷ������ �ڷ�����ȯ�� �ȵ�
		// Inger.parseInt("�����εȹ��ڿ�") :  ��°�� ���� Ÿ������ �ٲ���
		System.out.println(Integer.parseInt(num) / 3);
		System.out.println(Double.parseDouble(num) / 3);
		
		// sc.next() �� �� ���� ������ �Է¹޾Ƽ� ���� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		String num1 = sc.next();
		
		System.out.print("�ι�° ���� : ");
		String num2 = sc.next();
		
		// Integer.parseInt("10+3") (X)
		// Integer.parseInt("num1") (X)
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("��� : " + result);
		;
	}
}
