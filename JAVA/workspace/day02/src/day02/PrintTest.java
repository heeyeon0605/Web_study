package day02;

// Alt + Shift + N > �Ʒ�Ű > enter : �ڹ� ������Ʈ ����
// Ctrl + N : New â (��Ű��, Ŭ���� �� �����ϱ�)
// Ctrl + Spacebar : �ڵ��ϼ�
// Ctrl + F11 : Run

public class PrintTest {

	public static void main(String[] args) {
		System.out.print(10);
		System.out.print("\n���̸�\n"); // �ֵ���ǥ�� ���ڿ�, \n�� �ٹٲ�
		// �ڹٿ����� ��(����, �Ǽ�, ����, ���ڿ� ..)�� ���ڿ��� + �ϸ� ���ڿ��� ������ ��
		System.out.print(3+5 + "\n"); // ������ ������ ����� �ع���, "8\n"���� ������
		
		System.out.println("�ڹ�");
		System.out.println("ó�� �����!");
		
		//syso ���� ġ�� �ڵ��ϼ� : println()�޼ҵ� ���
		
		// "�ڸ���" ���
		System.out.println("\"�ڸ���\""); // \"�� �ֵ���ǥ ����ϰ� ���� ��
		
		// "���� : \n" ���
		System.out.println("���� : \\n");
		
		// 10�� 13�� (���⼭, 10�̶� 13�� ���� �� �ֱ⿡ ���ڿ��� �ƴ� ����������)
		System.out.println(10 + "�� " + 13 + "��");
		
		int data = 10; // ���� ����
		
		System.out.println(data); // ���� ����
		data = 5; // ������ ����
		data = data + 5; // ������ ������ �ִ� ���� +5�� �ؼ� �ٽ� data ������ ����
		
	}

}
