package day03;

// Scanner는 클래스여서 import
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		// 입력받기, sc.next()자체가 입력받은 값이 되는 것
		String name = sc.next(); 
		System.out.println(name + "님 어서오세요!");
	
		System.out.println("주소 : ");
		// nextLine은 위에 입력을 했으면 그 값을 이어 받아버림
		sc.nextLine(); // 밑의 nextLine을 위해 희생되는 아이
		String addr = sc.nextLine();
		System.out.println("당신이 사는 곳은 " + addr + "입니다.");
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		// 출력하는 값 사이에서 먼저 연산하여 문자열로 붙이고 싶은 경우는 괄호 사용
		System.out.println("당신의 5년 뒤 나이는 " + (5 + age) + "살 입니다.");
		
		
	}
}
