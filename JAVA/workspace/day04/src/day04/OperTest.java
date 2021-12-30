package day04;

import java.util.Scanner;

public class OperTest {

	public static void main(String[] args) {
		// 사용자에게 정수 입력받아서 양수인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
				
		String result = num > 0 ? "양수" : "음수";
		System.out.println(result);
	}
	
}
