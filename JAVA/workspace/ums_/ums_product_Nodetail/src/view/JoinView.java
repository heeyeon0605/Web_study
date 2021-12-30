package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		Scanner sc = new Scanner(System.in);
		//���� ���ԵǴ� "ȸ���� ������"�� �����ͺ��̽��� �����ؾ� �ϹǷ�
		//�����ͺ��̽��� �����ϱ� ����(����� ������ ����) DAO�� �ʿ��ϰ�
		//ȸ�������� �����ؾ� �ϱ� ������ UserDAO ��ü�� �ʿ��ϴ�.
		UserDAO udao = new UserDAO();
		System.out.print("���̵� : ");
		String userid = sc.next();
		String userpw="";
		if(udao.checkId(userid)) {
			while(true) {
				System.out.print("��й�ȣ : ");
				userpw = sc.next();
				System.out.print("��й�ȣ Ȯ�� : ");
				String userpw_re = sc.next();
				//��й�ȣ �˻�� ���� �����ͺ��̽��� ��ġ�� �ʱ� ������ ��ܿ��� �ذ� ����
				if(userpw.equals(userpw_re)) {
					break;
				}else {
					System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				}
			}
			
			System.out.print("�̸� : ");
			String username = sc.next();
			System.out.print("���� : ");
			int userage = sc.nextInt();
			System.out.print("�ڵ��� ��ȣ : ");
			String userphone = sc.next();
			System.out.print("�ּ� : ");
			sc = new Scanner(System.in);
			String useraddr = sc.nextLine();
			//������� �Դٸ� ȸ�� ���Կ� �ʿ��� ��� ������ �Է¹޾Ҵٴ� ���̴�.
			//�� ��� �������� UserTable.txt�� �����ؾ� �ϰ� �����ϴ� �ڵ����
			//DAO�� �����Ǿ� �ִ�. DAO�� �ִ� � �޼ҵ忡 �� �����͵��� �ѱ�� ���ؼ���
			//�Ű������� �Ѱܾ� �ϰ�, ���� �����͸� �ޱ����� �Ű������� ���� �ʿ�������.
			//�� �����͵��� ���� ������ �ʰ� �ϳ��� ��ü(UserDTO)�� �����ؼ� �Ѱ��ָ�
			//���� ���ϰ� �� �� �ִ�.
			UserDTO newUser = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
			if(udao.join(newUser)) {
				System.out.println("ȸ������ ����!");
				System.out.println(username+"�� ������ ȯ���մϴ�~");
			}else {
				System.out.println("ȸ������ ���� / �ٽ� �õ��� �ּ���.");
			}
			
		}else {
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
		}
	}
}








