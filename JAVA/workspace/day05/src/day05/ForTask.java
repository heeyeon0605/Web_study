package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 초기식은 int i = 0, 증감식은 i++로 고정
		Scanner sc = new Scanner(System.in);
		
		// 문제 1
		System.out.println("10부터 1까지 출력");
		for (int i = 10; i <= 1; i-=1) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// 문제 2
		System.out.print("\n\n");
		System.out.println("3 ~ 36 3의 배수 출력");
		for (int i = 0; i <= 36; i++) {
			if (i % 3 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
			
			// System.out.println(i*3+3);
		}
		
		// 문제 3
		System.out.print("\n\n");
		System.out.println("100부터 2씩 감소하며 20번 출력");
		int times = 0;
		for (int i = 100; i >= 0; i-=2) {
			if (times >= 20) {break;}
			
			System.out.print(i);
			System.out.print(" ");
			times++;
			
			// System.out.println(i*-2+100);
		}
		
		// 문제 4
		System.out.print("\n\n");
		System.out.println("1부터 10까지의 합 출력");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 문제 5
		System.out.print("\n\n");
		System.out.println("정수 하나 입력 받아서 1부터 그 수까지 출력");
		
		System.out.println("정수 하나를 입력하세요.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// 문제 6
		System.out.print("\n\n");
		System.out.println("정수 두 개 n,m 입력받아 n부터 m까지 출력(n은 m보다 작다고 가정)");
		System.out.println("정수 n을 입력하세요.");
		int n = sc.nextInt();
		
		System.out.println("정수 m을 입력하세요.");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		// 문제 7
		System.out.print("\n\n");
		System.out.println("1부터 100까지 중 짝수만 출력");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

		// 문제 8
		System.out.print("\n\n");
		System.out.println("1부터 100까지 중 3과 5의 공배수 출력");
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		// 문제 9
		System.out.print("\n\n");
		System.out.println("A부터 F까지 출력");
		for (int i = 65; i <= 70; i++) {
			System.out.print((char)i);
			System.out.print(" ");
		}
		
		// 문제 10
		System.out.print("\n\n");
		System.out.println("A부터 F까지 출력");
		for (int i = 65; i <= 90; i++) {
			if (i % 2 != 0) {
				System.out.print((char)(i + 32));
				System.out.print(" ");
			}
			else {
				System.out.print((char)i);
				System.out.print(" ");
			}
		}
		
		// for문 하나만 사용해서 구구단 전체 출력
		// 10진수 숫자 하나 입력받아 2진로 출력
		// ABCDefghIJKLmnopQRSTuvwxYZ 출력
		// AbCDefGHIjklMNOPqrstUVWXYz 출력
		
	}
}
