package access2;

// �ٸ� ��Ű���� �ִ� Ŭ������ �̿��� ������ import�� �ؾ��Ѵ�.
import access1.AccessTest;

public class AccessMain2 extends AccessTest {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		// obj.data2�� ���� ����
	}
	
	void f() {
//		(defualt)�� �ٸ� ��Ű���� �� ��ӽ��� �־ �ڽ��� �ʵ�ó�� ��� �Ұ�
//		System.out.println(data1);
//		protected�� �ٸ� ��Ű������ ��ӽ��� �شٸ� �ڽ��� �ʵ�ó�� ��� ����
		System.out.println(data4);
	}
}
