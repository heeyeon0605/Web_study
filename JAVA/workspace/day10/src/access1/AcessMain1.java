package access1;

public class AcessMain1 {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		// obj.data1, obj.data2, obj.data4 접근 가능
		System.out.println(obj.getData3());
		obj.setData3(3100);
	}
}
