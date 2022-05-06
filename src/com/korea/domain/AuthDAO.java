package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.AuthDTO;


public class AuthDAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/logindb";
	private String user = "root";
	private String pw = "1234";
	//연결객체 정보
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection conn = null;
	//생성자(객체 생성시 DBMS 연결)
	public AuthDAO (){
		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,user,pw);
			System.out.println("DBConnected....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	int result;
	public void login(AuthDTO dto) {
		try {
			pstmt=conn.prepareStatement("select * from member");
			rs=pstmt.executeQuery();	//rs:resultset의 객체 
			
			while(rs.next()) {//rs.next(): resultset의 객체 위치로 이동
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPw());
				
				if(result!=0) {
					System.out.println("로그인실패!");
				}else {
					System.out.println("로그인완료..");
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public void SignUp(AuthDTO dto) {
		try {
			pstmt=conn.prepareStatement("insert into member values(?,?)");
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			result = pstmt.executeUpdate();
			
			if(result!=0) {
				System.out.println("가입완료!");
			}else {
				System.out.println("가입실패..");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();} catch(Exception e) {e.printStackTrace();}
		}
	}
	
}
