package day03;

// Scanner�� Ŭ�������� import
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		// �Է¹ޱ�, sc.next()��ü�� �Է¹��� ���� �Ǵ� ��
		String name = sc.next(); 
		System.out.println(name + "�� �������!");
	
		System.out.println("�ּ� : ");
		// nextLine�� ���� �Է��� ������ �� ���� �̾� �޾ƹ���
		sc.nextLine(); // ���� nextLine�� ���� ����Ǵ� ����
		String addr = sc.nextLine();
		System.out.println("����� ��� ���� " + addr + "�Դϴ�.");
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		// ����ϴ� �� ���̿��� ���� �����Ͽ� ���ڿ��� ���̰� ���� ���� ��ȣ ���
		System.out.println("����� 5�� �� ���̴� " + (5 + age) + "�� �Դϴ�.");
		
		
	}
}
