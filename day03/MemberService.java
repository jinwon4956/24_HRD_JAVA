package day03;

public class MemberService {
	public boolean login(String id, String password) {
		if(id.equals("hong")&& password.equals("12345")) {
			result = true;
			
		}else {
			result = false;
			
		}
		return result;
	}
public void logout(String id) {			
	System.out.println(id+"님 로그 아웃 되었습니다");
}
}
