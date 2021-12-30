package day02;

public class Format {

	public static void main(String[] args) {
		
		System.out.printf("%d+%d=%d\n",1,1,1+1);
		
		System.out.println(10.24);
		
		// %.4f : �Ҽ��� �Ʒ��� ���ڸ�����
		System.out.printf("%.4f\n", 10.24);
		
		// ���� ������ ����
		System.out.printf("%3$d %1$d %2$d\n", 10, 20, 30);
		
		// 10 20 30 ����� �ƴ� "10 20 30" ���ڿ� ���� �ʿ��� ���
		String.format("%d %d %d", 10, 20, 30); // "10 20 30" ���ڿ��� �������
		
	}
}