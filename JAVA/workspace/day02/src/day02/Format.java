package day02;

public class Format {

	public static void main(String[] args) {
		
		System.out.printf("%d+%d=%d\n",1,1,1+1);
		
		System.out.println(10.24);
		
		// %.4f : 소수점 아래로 네자리까지
		System.out.printf("%.4f\n", 10.24);
		
		// 순서 지정도 가능
		System.out.printf("%3$d %1$d %2$d\n", 10, 20, 30);
		
		// 10 20 30 출력이 아닌 "10 20 30" 문자열 값이 필요한 경우
		String.format("%d %d %d", 10, 20, 30); // "10 20 30" 문자열이 만들어짐
		
	}
}
