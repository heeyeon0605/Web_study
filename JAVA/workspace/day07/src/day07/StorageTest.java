package day07;

public class StorageTest {
	int data1 = 10;
	static int data3 = 30;
	public static void main(String[] args) {
		// static�� ���� �޼ҵ� ���ο����� �Ϲ� ���������� ����� �� ����.
		// ����. data1 ��� �Ұ���.
		// static�� ���� ���������� ����� �� �ִ�.
		// ����. data3 ��� ����.
		
		System.out.println(data3);
		
		// ���� ���� �켱��!
		int data1 = 100;
		System.out.println(data1);
		// ���� ������ ����, ���� ������ �Ķ���
	}
	
	void f1() {
		int data2 = 20;
		int data3 = 30;
		System.out.println(data1);
	}
	
	void f2() {
		int data2 = 200;
		System.out.println(data1);
	}
}
