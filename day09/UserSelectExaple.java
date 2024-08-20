package day09;

/*
 * 1.JDBC 드라이버 로드
 * 2 . 데이터 베이스 연결
 * 
 */
import java.sql.*;

public class UserSelectExaple {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st =null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩...
			Class.forName("com.mysql.cj.jdbc.Driver");
			String ur1 = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(ur1, id, pwd);
			System.out.println("Db 연결 성공~~~");

			// 3. sql 실행하기 위한 Statement, PreParedStatement
			//String sql = "";

			//Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection conn = DriverManager.getConnection("연결 문자열","사용자","비밀번호");

			// 2. 데이터 베이스 연결..
			// String sql = "INSERT INTO person VALUES ('염회군',
			// '010-456-4566','yeom@dju.kr',30)";
			//String sql2 = "select name, phone from person";
			//PreparedStatement st = con.prepareStatement(sql2);
			
			
			//String sql2= "select name,phone from person";
			//이름이 홍길동과 같은 사람의 모든 열의 정보를 검색하여 출력하기
			String sql2 = "select+ from person where name = '홍길동'";
			// 4. 데이터 추가 명령 전송 하기 ex
			 st = con. createStatement();
			 rs = st.executeQuery(sql2);
			
			String name= "";
			String email ="";
			while(rs.next()) {
				
				name = rs.getString("name");
				email = rs.getString("email");
			System.out.println("전번:"+name);
			System.out.println("이메일"+email);
			
			}
			//if (result > 0) {
				//System.out.println("데이터 저장 성공~~~");
			//} else {
				//System.out.println("데이터 저장 실패!!!");
			//}
			
		} catch (Exception e) {
			System.out.println(" 드라이버 로딩 성공");

		} finally {
			con.close();
			st.close();
			rs.close();
			
		try {
			System.out.println("연결 끊기");
		} catch (SQLException es) {

		}
		}
	}
}