package day02;

public class PrintTask {

	public static void main(String[] args) {
		/*
		-----홍길동 님의 정보-----
		이름 : 홍길동
		나이 : 10살
		키 : 170.24cm
		몸무게 : 70.19kg
		성적 : A
		-----------------------
		 */
		
		String name = "홍길동";
		int age = 10;
		float height = 170.24f; // 그냥 실수만 적으면 double로 이해해서 float는 숫자 끝에 f나 F를 붙여주어야 함
		double weight = 70.19;
		char score = 'C';
		
		System.out.println("-----" + name + " 님의 정보-----");
		System.out.println("이름" + " : " + name);
		System.out.println("나이" + " : " + age + "살");
		System.out.println("키" + " : " + height + "cm");
		System.out.println("몸무게" + " : " + weight + "kg");
		System.out.println("성적" + " : " + score);

	}

}
