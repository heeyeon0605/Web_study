package access2;

// 다른 패키지에 있는 클래스를 이용할 때에는 import를 해야한다.
import access1.AccessTest;

public class AccessMain2 extends AccessTest {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		// obj.data2만 접근 가능
	}
	
	void f() {
//		(defualt)는 다른 패키지일 때 상속시켜 주어도 자신의 필드처럼 사용 불가
//		System.out.println(data1);
//		protected는 다른 패키지여도 상속시켜 준다면 자신의 필드처럼 사용 가능
		System.out.println(data4);
	}
}
