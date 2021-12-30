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
		System.out.print("수정할 상품 번호 : ");
		int prodnum = sc.nextInt();
		System.out.println("1. 이름수정\n2. 가격수정\n3. 재고수정\n4. 설명수정");
		int choice = sc.nextInt();
		System.out.print("새로운 정보 : ");
		sc = new Scanner(System.in);
		String newData = sc.nextLine();
		if(pdao.modifyProduct(prodnum,choice,newData)) {
			System.out.println(prodnum+"번 상품이 정상적으로 수정되었습니다.");
		}else {
			System.out.println("상품 수정 실패 / 다음에 다시 시도해주세요.");
		}
	}
}











