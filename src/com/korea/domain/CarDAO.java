package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.CarDTO;

public class CarDAO {
	
	// 연결관련 정보 저장용 변수
			String id = "root";
			String pw = "1234";
			String url = "jdbc:mysql://localhost:3306/rent_cardb";
		
			// DB연결 관련 객체를 위한 참조변수
			Connection conn = null;				// DB 연결객체
			PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체
			ResultSet rs = null;				// 쿼리결과(Select) 수신용 객체
		
			// 연결
		public CarDAO() {
			try 
			{
				// DB Driver 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loading Success!");
				// DB연결객체 생성
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("DB Connected...");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}		
		
		}
		
		
		public boolean Select() {
			return false;}
		
		public boolean Insert(CarDTO dto) {
			
			try {
				
				pstmt = conn.prepareStatement("insert into car_tbl values(?,?,?,?)");
				pstmt.setString(1, dto.getCar_Code());
				pstmt.setString(2, dto.getCar_Name());
				pstmt.setString(3, dto.getCar_Person());
				pstmt.setString(4, dto.getCar_Color());
				
				int result = pstmt.executeUpdate();
				
				if(result!=0) {
					return true;	// Insert 성공
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
		
		public void Update() {}
		
		public void Delete() {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
