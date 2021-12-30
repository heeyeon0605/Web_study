package dao;

import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	DBConnection conn = null;
	public UserDAO() {
		//UserDAO 클래스는 User에 관한 데이터만 관리하는 클래스 이므로
		//접근할 파일이 UserTable.txt 파일이다.
		//(Connection을 바로 그 파일로 잡아준다.)
		conn = new DBConnection("UserTable.txt");
	}
	public boolean join(UserDTO newUser) {
		//받아온 입력받은 객체의 비밀번호를 암호화해서 바꿔준다.
		newUser.userpw = encrypt(newUser.userpw);
		//그대로 데이터베이스에 입력(toString()을 사용한 이유는
		//데이터베이스에 입력해야 하는 서식이 모든 데이터들을 \t으로
		//연결해서 써야한다. 여기에서 모두 작성해주면 너무 코드가 복잡해지기 때문에
		//DTO클래스에 toString()으로 재정의 해놓고 그걸 호출해서 쓴다.
		return conn.insert(newUser.toString());
		
	}
	public boolean checkId(String userid) {
		//기존에 가입되어 있는 유저들의 id를 검사하는 것이므로,
		//select를 이용해서 데이터를 검색해온다.
		//UserTable.txt에는 0번째 방에 userid들이 저장되어 있고
		//0번방에 입력받은 userid가 있는 모든 행들을 검색해온다.
		//rs : 검색된 행들이 다 담겨있는 HashSet
		HashSet<String> rs = conn.select(0,userid);
		if(rs.size() == 0) {
			//검색된 행이 없다는 뜻(중복된 아이디가 없다는 뜻)
			return true;
		}else {
			//검색된 행이 있다는 뜻(중복된 아이디가 있다는 뜻)
			return false;
		}
		//rs.size()가 0개 라면 ==0 연산 결과가 true값이 나온다.
		//그대로 return을 해주면 true/false 둘 중 하나가 리턴된다.
//		return rs.size() == 0;
	}
	public boolean login(String userid, String userpw) {
		//입력받은 아이디를 0번방에서 검사(rs에는 그 회원의 정보가 있는 행이 하나 담겨있다.)
		HashSet<String> rs = conn.select(0,userid);
		//line으로 rs에 담긴 그 행을 하나 꺼내오고
		for(String line : rs) {
			//꺼내온 그 행을 \t을 기준으로 전부 나누어서 배열에 담아준다.
			//(0 : 아이디, 1 : 비밀번호 ,..)
			String[] datas = line.split("\t");
			//현재 저 배열의 1번방은 암호화되어있는 상태이기 때문에 다시 복호화를 진행한다.
			datas[1] = decrypt(datas[1]);
			if(datas[1].equals(userpw)) {
				//로그인 성공
				//로그인을 성공했다면 그 성공한 유저의 정보를 메인 서비스 이용시
				//계속 사용하게 된다. 우리가 매번마다 DB에서 검색해오기는 힘들기 때문에
				//로그인 성공한 사람의 정보를 객체로 만들어서 Session에 세팅해준다.
				//KEY : loginUser
				//VALUE : 로그인 성공한 사람의 정보가 있는 DTO 객체
				Session.put("loginUser", new UserDTO(datas));
				return true;
			}
		}
		//로그인 실패
		return false;
	}
	public String encrypt(String userpw) {
		String result = "";
		for (int i = 0; i < userpw.length(); i++) {
			result += (char)(userpw.charAt(i)+4);
		}
		return result;
	}
	public String decrypt(String en_pw) {
		String result = "";
		for (int i = 0; i < en_pw.length(); i++) {
			result += (char)(en_pw.charAt(i)-4);
		}
		return result;
	}
	public boolean modifyUser(String userid,int col, String newData) {
		return conn.update(userid, col, newData);
	}
	public boolean leaveId(String userid) {
		return conn.delete(userid);
	}
	public UserDTO getDetail(String userid) {
		HashSet<String> rs = conn.select(0,userid);
		for(String line : rs) {
			return new UserDTO(line.split("\t"));
		}
		return null;
	}
	
}










