package view;

import java.util.Scanner;

//첫 시작화면
public class Index {
	public static void main(String[] args) {
		System.out.println("21/10/12 개강 웹개발 최종 자바 예제 /"
				+ " UMS 프로그램 입니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 나가기");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//회원가입
				//많은 데이터들의 입출력이 일어나기 때문에 코드가 길어진다.
				//따라서 새로운 View단을 하나 띄워준다.(흐름을 이동시킨다 -> JoinView)
				new JoinView();
			} else if(choice == 2) {
				//로그인
				new LoginView();
			} else if(choice == 3) {
				//나가기
				System.out.println("안녕히가세요~");
				break;
			}
		}
	}
}










