package day02;

// Alt + Shift + N > 아래키 > enter : 자바 프로젝트 생성
// Ctrl + N : New 창 (패키지, 클래스 등 생성하기)
// Ctrl + Spacebar : 자동완성
// Ctrl + F11 : Run

public class PrintTest {

	public static void main(String[] args) {
		System.out.print(10);
		System.out.print("\n내이름\n"); // 쌍따옴표가 문자열, \n은 줄바꿈
		// 자바에서는 값(정수, 실수, 문자, 문자열 ..)과 문자열을 + 하면 문자열로 연결이 됨
		System.out.print(3+5 + "\n"); // 수식이 있으면 계산을 해버림, "8\n"으로 이해함
		
		System.out.println("자바");
		System.out.println("처음 배워요!");
		
		//syso 글자 치고 자동완성 : println()메소드 사용
		
		// "코리아" 출력
		System.out.println("\"코리아\""); // \"는 쌍따옴표 출력하고 싶을 때
		
		// "엔터 : \n" 출력
		System.out.println("엔터 : \\n");
		
		// 10월 13일 (여기서, 10이랑 13은 변할 수 있기에 문자열이 아닌 정수여야함)
		System.out.println(10 + "월 " + 13 + "일");
		
		int data = 10; // 변수 선언
		
		System.out.println(data); // 값에 접근
		data = 5; // 공간에 접근
		data = data + 5; // 변수가 가지고 있는 값에 +5를 해서 다시 data 공간에 넣음
		
	}

}
