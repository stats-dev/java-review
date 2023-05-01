package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_jdbc_insert {

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
		
		//쿼리 구문 변수 선언(select)
//		Statement statement = null;
		
		//파라미터를 가지는 쿼리구문 변수 선언 (Insert)
		PreparedStatement pstmt = null;
		
		
		try {
			//SQL 작성 해야 저 아래 SQLException 정상 작동
			//jdbc  드라이버 클래스 로드
			Class.forName(JDBC_DRIVER);
			
			//데이터베이스 연결
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			//SQL 쿼리 생성
			//statement = conn.createStatement();
			//insert sql 쿼리문
			String sql = "INSERT INTO STUDENT "
					+ " VALUES(?, ?, ?, ?, ?, ?)";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//들어갈 파라미터들 세팅
			//파라미터 세팅은 물음표의 개수와 동일하게 설정
			pstmt.setString(1, "8003");
			pstmt.setString(2, "임꺽정");
			pstmt.setString(3, "남");
			pstmt.setInt(4, 1); //각 Type에 맞게 조정한다.
			pstmt.setString(5, "생물");
			pstmt.setDouble(6, 3.35);	

//			//DELETE 시도
//			String sql = "DELETE FROM STUDENT "
//					+ "		WHERE SNO = ?";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "8003");
//			

			
			//insert, delete, update는 결과로 영향받은 행의 개수를 리턴
			int result = pstmt.executeUpdate(); //result 개수 나옴
			
			if(result == 1) {
				System.out.println("저장되었습니다.");
			} else {
				System.out.println("저장에 실패하였습니다.");
			}
			
			
			//다 쓴 객체들 해제
			pstmt.close();
			conn.close();


			
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(pstmt != null){
				try {
					pstmt.close();
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
