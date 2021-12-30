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
		// arr은 포인터 변수라서 방번호 주소가 복사되는 것이기 때문에 같은 곳을 바라보는거지, 배열이 새로 복사되는 것이 아님.
		// 그래서 arData4에서 값을 바뀌어도 arData3랑 주소가 같으니 값도 바뀌는 것
		int[] arData4 = arData3; 
		arData4[2] = 300;
		System.out.println(arData2[2]);
		
	}
}
