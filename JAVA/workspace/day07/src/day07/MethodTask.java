package day07;

import java.lang.reflect.Array;

public class MethodTask {

	public static void main(String[] args) {
		
	}
	
	// "문자열".charAt(index) : index번째의 글자 빼오기(char 타입)
	// "문자열".length() : 문자열의 길이(int 타입)
	
	// 1. 어떤 문자열을 n번 만큼 출력하는 메소드
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
	// 2. n부터 m까지의 합 구해주는 메소드
	int sumNtoM(int n, int m) {
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			sum += i;
		}
				
		return sum;
	}
	
	// 3. 문자열을 전부 대문자로 바꿔주는 메소드
	String changeToUpper(String msg) {
		int len = msg.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			char ch = msg.charAt(i);
			// a : 97 / A : 65
			
			if (ch>='a' && ch<= 'z') {
				result += (char)(ch-32);
			}
			else {
				result += ch;
			}
		}
		
		return result;
	}
	
	// 4. 문자열을 거꾸로 바꿔주는 메소드
	String reverse(String msg) {
		String result = "";
		int len = msg.length();
		for (int i = 0; i < len; i++) {
			result = msg.charAt(i) + result;
		}
		return result;
	}
	
	// 5. 문자열이 숫자로 이루어져 있는지 검사하는 메소드
	boolean isDigit(String msg) {
		int len =msg.length();
		for (int i = 0; i < len; i++) {
			char ch = msg.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	// 6. 문자열의 소문자는 대문자로, 대문자는 소문자로 바꿔줌
	String changeToHangeul(int num) {
		String hangeul = "공일이삼사오육칠팔구";
		String data = num + "";
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			
			// '2' -> 2		50 - 48 = 2
			int idx = ch - 48;
			result += hangeul.charAt(idx);
		}
		return result;
	}
	
	// 7. 정수를 한글로 바꿔주는 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
