package day03;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	//기본생성자
	
	//인자 생성자
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	//메소드의 정의
	public boolean login(String id, String password) {
		boolean result;
		if(id.equals("hong")&& password.equals("12345")) {
		return true;
		
	}else {
		result=false;
	}
	return result;

}
	public void logout(String id) {
		System.out.println(id+"님 로그 아웃 되었습니다");
	}
}
