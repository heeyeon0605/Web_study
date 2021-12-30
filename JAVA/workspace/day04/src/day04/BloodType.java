package day04;

import java.util.Scanner;

public class BloodType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 혈액형은? : ");
		String btype = sc.next();
		
		// 문자열은 "문자열1".equals("문자열2") 로 비교해야함.
		if(btype.equals("A")) {
			System.out.println("꼼꼼하고 세심하다.");
		}
		else if(btype.equals("B")) {
			System.out.println("적극적이고 활발하다.");
		}
		else if(btype.equals("O")) {
			System.out.println("친화력이 좋다.");
		}
		else if(btype.equals("AB")) {
			System.out.println("");
		}
		else {
			System.out.println("당신은 사람이 아닙니다.");
		}
		
	}
	
}
