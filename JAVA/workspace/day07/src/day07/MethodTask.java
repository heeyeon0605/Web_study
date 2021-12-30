package day07;

import java.lang.reflect.Array;

public class MethodTask {

	public static void main(String[] args) {
		
	}
	
	// "���ڿ�".charAt(index) : index��°�� ���� ������(char Ÿ��)
	// "���ڿ�".length() : ���ڿ��� ����(int Ÿ��)
	
	// 1. � ���ڿ��� n�� ��ŭ ����ϴ� �޼ҵ�
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
	// 2. n���� m������ �� �����ִ� �޼ҵ�
	int sumNtoM(int n, int m) {
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			sum += i;
		}
				
		return sum;
	}
	
	// 3. ���ڿ��� ���� �빮�ڷ� �ٲ��ִ� �޼ҵ�
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
	
	// 4. ���ڿ��� �Ųٷ� �ٲ��ִ� �޼ҵ�
	String reverse(String msg) {
		String result = "";
		int len = msg.length();
		for (int i = 0; i < len; i++) {
			result = msg.charAt(i) + result;
		}
		return result;
	}
	
	// 5. ���ڿ��� ���ڷ� �̷���� �ִ��� �˻��ϴ� �޼ҵ�
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
	
	// 6. ���ڿ��� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ���
	String changeToHangeul(int num) {
		String hangeul = "�����̻�����ĥ�ȱ�";
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
	
	// 7. ������ �ѱ۷� �ٲ��ִ� �޼ҵ�
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}