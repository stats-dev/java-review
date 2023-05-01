package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_jdbc_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오라클 드라이버 변수 선언 및 사용
		final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		
		// 접속할 데이터 베이스 url 지정
		final String DB_URL = 
						"jdbc:oracle:thin:@localhost:1521:xe"; //1521
//		//다른 곳에서 접속하려면 IP주소를 입력해준다.
//		final String DB_URL = 
//				"jdbc:oracle:thin:@IP주소:1521:xe"; //1521
		
		//접속할 계정 정보
		final String USER = "c##study";
		final String PASSWORD = "!dkdlxl1234";
		
		//커넥션 변수
		Connection conn = null;
		
		//쿼리 구문 변수 선언
		Statement statement = null;
		
		
		try {
			//SQL 작성 해야 저 아래 SQLException 정상 작동
			//jdbc  드라이버 클래스 로드
			Class.forName(JDBC_DRIVER);
			
			//데이터베이스 연결
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			//SQL 쿼리 생성
			statement = conn.createStatement();
			String sql = "SELECT * FROM STUDENT";
					
			//결과를 담아줄 ResultSet 변수 선언.
			//select => executeQuery(sql);
			//insert, update, delete => executeUpdate(sql);
			ResultSet resultSet = statement.executeQuery(sql);
				
			//결과 출력
			while(resultSet.next()) {
				String sno = resultSet.getString("sno");
				String sname = resultSet.getString("sname");
				
				System.out.println("학번 : " + sno + ", 이름 : " + sname);
			}
			//다 쓴 객체들 해제
			resultSet.close();
			statement.close();
			conn.close();


			
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(statement != null){
				try {
					conn.close();
				} catch (SQLException se) {
					// TODO: handle exception
					System.out.println(se.getMessage());
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException se) {
					// TODO: handle exception
					System.out.println(se.getMessage());
				}
			}
			
			
		}

	}

}
