package day10;
import java.sql.*;
import java.io.*;


public class ConnectDB {

	
	static Connection con = null;

	public ConnectDB() {
		try {
			// 1. 드라이버 로딩...
			Class.forName("com.mysql.cj.jdbc.Driver");
			String ur1 = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(ur1, id, pwd);
			System.out.println("Db 연결 성공~~~");
			
		}catch(Exception en) {	
			
		}
		
	}//생성자-----------
	Connection getCon() {
		return con;
	}
	
	
	
	

}
