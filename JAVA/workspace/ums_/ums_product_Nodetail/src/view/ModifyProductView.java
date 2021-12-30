package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class ModifyProductView {
	public ModifyProductView() {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		System.out.println(pdao.getList(loginUser.userid));
		System.out.print("������ ��ǰ ��ȣ : ");
		int prodnum = sc.nextInt();
		System.out.println("1. �̸�����\n2. ���ݼ���\n3. ������\n4. �������");
		int choice = sc.nextInt();
		System.out.print("���ο� ���� : ");
		sc = new Scanner(System.in);
		String newData = sc.nextLine();
		if(pdao.modifyProduct(prodnum,choice,newData)) {
			System.out.println(prodnum+"�� ��ǰ�� ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("��ǰ ���� ���� / ������ �ٽ� �õ����ּ���.");
		}
	}
}











