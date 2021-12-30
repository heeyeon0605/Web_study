package day03;

public class Casting {

	public static void main(String[] args) {
		
		System.out.println((10 + 0.0) / 3);
		
		// 아스키 코드 : 각 문자마다 대응도는 숫자들을 가지고 있음
		// 'A' : 65, 'a' : 97, '0' : 48 은 외워두는 것이 좋음
		System.out.println('A' + 5);
		
		int num = 10;
		System.out.println((double)num / 3);
		System.out.println(num / 3);
		
	}
	
}
