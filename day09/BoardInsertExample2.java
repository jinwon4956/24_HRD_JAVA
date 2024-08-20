package day09;

/*
 * 1.JDBC 드라이버 로드
 * 2 . 데이터 베이스 연결
 * 
 */
import java.sql.*;
import java. io.InputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
public class BoardInsertExample2 {

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
			/*String sql2 = "insert into users(userid,userpassword,userage,useremail,username)"+"values(?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1, "lee");
			st.setString(2, "1234");
			st.setInt(3,20);
			st.setString(4,"java@a.com");
			*/st.se
			
		
			// 4. 데이터 추가 명령 전송 하기 ex
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println("데이터 조회 성공~~~");
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String bwriter = rs.getString(4);
				String d = rs.getDate("bdate").toString();
				String fname = rs.getString("filename");
				Blob blob = rs.getBlob("bfiledata");
				InputStream is = blob.getBinaryStream();
				OutputStream os = new FileOutputStream();
				is.transferTo(os);
				System.out.println("번호:"+bno);
				System.out.println("제목:"+btitle);
				System.out.println("작성자:"+bcontent);
				System.out.println("작성일:"+);
				System.out.println("파일이름:"+d);
				System.out.println("파일정보:"+fname);
				
						os.flush();
						os.close();
						is.close();
			String fdata = rs.getBlob("bfiledate");
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