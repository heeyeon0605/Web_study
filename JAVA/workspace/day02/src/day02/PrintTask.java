package day02;

public class PrintTask {

	public static void main(String[] args) {
		/*
		-----ȫ�浿 ���� ����-----
		�̸� : ȫ�浿
		���� : 10��
		Ű : 170.24cm
		������ : 70.19kg
		���� : A
		-----------------------
		 */
		
		String name = "ȫ�浿";
		int age = 10;
		float height = 170.24f; // �׳� �Ǽ��� ������ double�� �����ؼ� float�� ���� ���� f�� F�� �ٿ��־�� ��
		double weight = 70.19;
		char score = 'C';
		
		System.out.println("-----" + name + " ���� ����-----");
		System.out.println("�̸�" + " : " + name);
		System.out.println("����" + " : " + age + "��");
		System.out.println("Ű" + " : " + height + "cm");
		System.out.println("������" + " : " + weight + "kg");
		System.out.println("����" + " : " + score);

	}

}
