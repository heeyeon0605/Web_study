package view;

import java.util.Scanner;

//ù ����ȭ��
public class Index {
	public static void main(String[] args) {
		System.out.println("21/10/12 ���� ������ ���� �ڹ� ���� /"
				+ " UMS ���α׷� �Դϴ�.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//ȸ������
				//���� �����͵��� ������� �Ͼ�� ������ �ڵ尡 �������.
				//���� ���ο� View���� �ϳ� ����ش�.(�帧�� �̵���Ų�� -> JoinView)
				new JoinView();
			} else if(choice == 2) {
				//�α���
				new LoginView();
			} else if(choice == 3) {
				//������
				System.out.println("�ȳ���������~");
				break;
			}
		}
	}
}










