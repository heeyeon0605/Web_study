package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dao.UserDAO;
import dto.UserDTO;

public class MyInfoView {
	public MyInfoView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		//세션은 어느곳에서든 접근이 가능하기 때문에 로그인된 유저의 정보를 세션에서 꺼내오기
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		System.out.println("------("+loginUser.userid+")님 회원정보------");
		System.out.println("이름 : "+loginUser.username);
		System.out.println("나이 : "+loginUser.userage);
		System.out.println("핸드폰 번호 : "+loginUser.userphone);
		System.out.println("주소 : "+loginUser.useraddr);
		System.out.println("---------------------------------");
		System.out.println("1. 비밀번호 수정\n2. 핸드폰 번호 수정\n"
				+ "3. 주소 수정\n4. 수정 취소\n5. UMS 떠나기");
		int choice = sc.nextInt();
		if(choice == 4) {
			//메인으로 돌아가기
			System.out.print("메인 화면으로 돌아갑니다");
			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				try {Thread.sleep(1000);}
				catch (InterruptedException e) {}
			}
			System.out.println();
		}else if(choice == 5){
			//회원탈퇴
			System.out.print("비밀번호 재입력 : ");
			String userpw = sc.next();
			//세션에서 받아온 정보의 비밀번호와 재입력한 비밀번호가 같다면
			if(loginUser.userpw.equals(userpw)) {
				//탈퇴 진행
				ProductDAO pdao = new ProductDAO();
				pdao.removeAll(loginUser.userid);
				if(udao.leaveId(loginUser.userid)) {
					//질척거리기
					System.out.println("그동안 이용해 주셔서 감사합니다...☆");
					//탈퇴되었으니 세션도 초기화
					Session.put("loginUser", null);
				}else {
					System.out.println("왠지 모르게 회원탈퇴 실패 / 다시 시도해 주세요.");
				}
			//비밀번호가 같지 않다면
			}else {
				System.out.println("비밀번호 오류 / 다시 시도해 주세요.");
			}
		}else {
			//회원정보 수정(1~3)을 선택한 경우
			System.out.print("새로운 정보 : ");
			sc = new Scanner(System.in);
			String newData = sc.nextLine();
			//flag 기법 : 어떤 특정 영역에 들어갔는지를 검사하는 기법
			boolean check = false;
			switch(choice) {
			case 1:
				//비밀번호 수정 [1]
				//비밀번호는 UserTable.txt의 1번방에 전부 저장되어 있기 때문에
				//현재 로그인된 유저의 id에 해당하는 줄 1번방의 데이터를 newData로
				//바꾸어주면 된다.
				check = udao.modifyUser(loginUser.userid,1,newData);
				break;
//			case 2:
//				//핸드폰번호 수정 [4]
//				check = udao.modifyUser(loginUser.userid, 4, newData);
//				break;
//			case 3:
//				//주소 수정 [5]
//				check = udao.modifyUser(loginUser.userid, 5, newData);
//				break;
			case 2: case 3:
				//핸드폰번호와 주소 수정 같은 경우에는 사용자가 선택한 숫자와(2,3) 실제
				//데이터들이 있는 방번호가 2개 차이이다. case문 두개를 묶어서
				//choice+2번방을 수정해주면 일괄처리 가능
				check = udao.modifyUser(loginUser.userid, choice+2, newData);
				break;
			
			}
			//check는 초기값이 false이고 switch문 내부에서 수정 결과(true/false)
			//로 바꿔주고 있다. 스위치문에 들어가지 않았거나 수정을 실패했다면
			//false로 그대로 남아있을 것이고 정상적으로 들어가서 수정을 성공했다면
			//true로 바뀌었을 것이다. true로 정상적으로 바뀌었을 경우에만
			if(check) {
				//수정완료 출력
				System.out.println("정보 수정 완료!");
				//지금 우리가 수정한것은 UserTable.txt를 수정한 것이지만
				//Session은 수정을 하지 않았다. 따라서 다시 메인으로 돌아간 후
				//서비스를 이용할 때 문제가 생길 수 있다. 따라서 바뀐 유저 정보를
				//다시 검색해 와서 세션에 세팅해주는 과정이 필요하다.
				UserDTO newUser = udao.getDetail(loginUser.userid);
				Session.put("loginUser", newUser);
			}else {
				//수정실패 출력
				System.out.println("수정 실패 / 다음에 다시 시도하세요.");
			}
		}
	}
}









