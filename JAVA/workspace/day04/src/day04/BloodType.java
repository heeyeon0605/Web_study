package day04;

import java.util.Scanner;

public class BloodType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ��������? : ");
		String btype = sc.next();
		
		// ���ڿ��� "���ڿ�1".equals("���ڿ�2") �� ���ؾ���.
		if(btype.equals("A")) {
			System.out.println("�Ĳ��ϰ� �����ϴ�.");
		}
		else if(btype.equals("B")) {
			System.out.println("�������̰� Ȱ���ϴ�.");
		}
		else if(btype.equals("O")) {
			System.out.println("ģȭ���� ����.");
		}
		else if(btype.equals("AB")) {
			System.out.println("");
		}
		else {
			System.out.println("����� ����� �ƴմϴ�.");
		}
		
	}
	
}
