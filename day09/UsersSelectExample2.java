package day09;

/*
 * 1.JDBC 드라이버 로드
 * 2 . 데이터 베이스 연결
 * 
 */
import java.sql.*;
import java.io.*;
import java.io.FileInputStream;
public class UsersSelectExample2 {

	public static void main(String[] args) {
		Connection con = null;
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
			String sql2 = "select + form users where userid=?";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1, "lee");
			
		ResultSet rs = st.executeQuery();
			// 4. 데이터 추가 명령 전송 하기 ex
			
			if (rs.next()) {
				System.out.println("데이터 조회 성공~~~");
				String name = rs.getString("username");
				int age = rs.getInt("age");
				System.out.println("이름:"+name);
				System.out.println("나이"+age); 
				
			} else {
				System.out.println("데이터 조회 실패!!!");
			}
			
		} catch (Exception e) {
			System.out.println(" 드라이버 로딩 성공");

		} finally {
		
		try {
			con.close();
			System.out.println("연결 끊기");
		} catch (SQLException es) {

		}
		}
	}
}