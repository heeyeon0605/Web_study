package access1;

public class AccessTest {
	int data1 = 10;
	public int data2 = 20;
	private int data3 = 30;
	protected int data4 = 40;
	
	// getter, 값을 사용하는 경우
	public int getData3() {
		return data3;
	}
	
	// setter, 값을 수정, 세팅하는 경우
	public void setData3(int data3) {
		this.data3 = data3;
	}
}
