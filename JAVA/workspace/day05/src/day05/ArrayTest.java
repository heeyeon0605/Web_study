package day05;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arData = {10, 15, 11, 19, 200};
		// System.out.println(arData);

		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}
		
		int[] arData2 = new int[5];
		for (int i = 0; i < 5; i++) {
			arData2[i] = i + 1;
		}
		
		int[] arData3 = {1, 2, 3, 4, 5};
		// arr�� ������ ������ ���ȣ �ּҰ� ����Ǵ� ���̱� ������ ���� ���� �ٶ󺸴°���, �迭�� ���� ����Ǵ� ���� �ƴ�.
		// �׷��� arData4���� ���� �ٲ� arData3�� �ּҰ� ������ ���� �ٲ�� ��
		int[] arData4 = arData3; 
		arData4[2] = 300;
		System.out.println(arData2[2]);
		
	}
}
