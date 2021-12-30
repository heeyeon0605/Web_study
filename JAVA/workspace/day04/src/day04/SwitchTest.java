package day04;

import java.util.Scanner;

// Ctrl + Alt + 아래키(위키) : 아래로(위로) 선택한 줄 복사
// Alt + 아래키(위키) : 아래로(위로) 선택한 줄 이동

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
		System.out.println("1.Java 2.Python 3.망둥어 4.C언어");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 3 :
			System.out.println("정답입니다.");
			break;
		case 1 :
		case 2 :
		case 4 :
			System.out.println("오답입니다.");
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
}
