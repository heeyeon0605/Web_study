package day06;

import java.util.Scanner;

public class MethodTest {
	// ctrl + Ŭ�� : ����ϰ� �ִ� �޼ҵ� ����η� �̵�

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		
		// class�� MethodTest�ϱ� �տ� �ٿ��� ��.
		MethodTest m = new MethodTest();
		int result = m.f(10);
		System.out.println(result);
		m.f(87);
		m.f(7);
		m.printName();
		m.printJava(5);
	}
	
	int f(int x) {
		return 2*x + 1;
	}
	
	// �̸� 10�� ����ϴ� �޼ҵ�
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ȫ�浿");
		}
	}
	
	// "Java" ���ڿ��� ���ϴ� ���ڸ�ŭ ����ϴ� �޼ҵ�
	void printJava(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Java");
		}
	}
	
	// ���� �ð� ������ �����ִ� �޼ҵ�
//	�ð�Ÿ�� getTime() {
//		return �ð�����;
//	}
	
	// �޼ҵ� �̸��� is, has�� �� ��쿡�� �Ű������� �ְ� returnŸ���� booleanŸ���̴�.
	// �ѱ� ���ڰ� �������� �Ǻ��ϴ� �޼ҵ�
//	boolean isInt(int num) {
//		return true/false;
//	}
	
}


