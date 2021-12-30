package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class MainView {
	public MainView() {
		//Session에 loginUser라는 KEY로 무언가 세팅되어 있다면
		//로그인 했다는 뜻이고, 아니라면(null이라면) 로그인 되지 않은 상태란 뜻이다.
		//로그인되지 않았으면 메인 서비스 이용을 멈춰야한다.(웹 상에서)
		//우리가 만든 자바 프로젝트는 무조건 main()부터 시작하기 때문에 코드 생략이
		//가능하지만 웹 혹은 다른 프로그램에서는 진입점이 여러개일 수 있기 때문에 검사가 필요
		if(Session.get("loginUser") != null) {
			Scanner sc = new Scanner(System.in);
			//세션에서 꺼내서 다운캐스팅 후 UserDTO객체에 넣어주기
			UserDTO loginUser = (UserDTO)Session.get("loginUser");
			ProductDAO pdao = new ProductDAO();
			while(true) {
				//아래 메인 서비스 이용중 탈퇴를 진행했을 수도 있고 loginUser라는 키에
				//null이 담겨있다. 따라서 그 경우에는 다시 INDEX로 돌아가기 위해서
				//break로 반복문을 탈출해준다.
				if(Session.get("loginUser") == null) {
					break;
				}else {
					//정보가 수정되었을 수도 있기 때문에 Session을 바뀐 정보로 다시 세팅
					loginUser = (UserDTO)Session.get("loginUser");
				}
				System.out.println(loginUser.username+"님("+loginUser.userid+")");
				System.out.println("1. 상품추가\n2. 상품수정\n"
						+ "3. 상품삭제\n4. 내 상품보기\n5. 상품검색\n"
						+ "6. 내 정보 수정\n7. 로그아웃");
				int choice = sc.nextInt();
				if(choice == 7) {
					System.out.println(loginUser.username+"님 안녕히가세요~");
					//로그아웃은 session 비워주기
					Session.put("loginUser", null);
					break;
				}
				switch(choice) {
				case 1:
					//상품추가
					new AddProductView();
					break;
				case 2:
					//상품수정
					new ModifyProductView();
					break;
				case 3:
					//상품삭제
					System.out.println(pdao.getList(loginUser.userid));
					System.out.print("삭제할 상품 번호 : ");
					int prodnum = sc.nextInt();
					if(pdao.removeProduct(prodnum)) {
						System.out.println(prodnum+"번 상품 삭제 완료!");
					}else {
						System.out.println("상품 삭제 실패 / 다음에 다시 시도해주세요.");
					}
					break;
				case 4:
					//내상품보기
					System.out.println("======☆내가 올린 상품목록☆======");
					String result = pdao.getList(loginUser.userid);
					if(result.equals("")) {
						System.out.println("올린 상품이 없습니다.");
					}else {
						System.out.println(result);
					}
					break;
				case 5:
					//상품검색
					System.out.print("키워드 : ");
					sc = new Scanner(System.in);
					String keyword = sc.nextLine();
					System.out.println(pdao.search(keyword));
					System.out.print("자세히 볼 상품번호(취소는 0번) : ");
					prodnum = sc.nextInt();
					if(prodnum!=0) {
						//상품 자세히보기 띄워주기(좋아요누르기, 구매하기, ...)
//						new ProductInfoView(prodnum);
					}
					break;
				case 6:
					//내정보수정
					new MyInfoView();
					break;
					
				}
			}
		}else {
			System.out.println("로그인 후 이용하세요!");
		}
	}
}









