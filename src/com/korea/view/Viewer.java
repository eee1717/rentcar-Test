package com.korea.view;

import java.util.Scanner;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;


public class Viewer {
	int num;
	Scanner sc = new Scanner(System.in);
	
	FrontController controller = new FrontController();

	
	public void MainMenu() {
		while(true) {
			System.out.println("-----MAIN-----");
			System.out.println("1 인증");
			System.out.println("2 관리자");
			System.out.println("3 회원");
			System.out.println("4 종료");
			System.out.println("-----MAIN-----");
			System.out.print("번호 : ");
			num=sc.nextInt();
			
			switch(num) {
			case 1 : //인증
				AuthMenu();
				break;
			case 2 : //관리자
				employeeMenu();
				break;
			case 3 : //회원
				break;
			case 4 : //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(-1);
				break;
			default : 	
			}
		}
	}
	
	
	public void AuthMenu() {
		String id;
		String pw;
		while(true) {
			System.out.println("🚗🚗🚗🚗🚗🚗인증메뉴🚗🚗🚗🚗🚗🚗");
			System.out.println("1 회원로그인");
			System.out.println("2 회원가입");
			System.out.println("3 이전으로");
			System.out.println("🚗🚗🚗🚗🚗🚗인증메뉴🚗🚗🚗🚗🚗🚗");
			System.out.print("번호 : ");
			num=sc.nextInt();
			
			switch(num) {
			case 1 : //회원로그인
				System.out.println("ID와 PW 입력 >> ");
				id = sc.next();
				pw = sc.next();
				AuthDTO dto2 = new AuthDTO(id,pw);
				controller.SubConExecute("AUTH",1,dto2);
				break;
			case 2 : //비회원가입
				System.out.println("ID와 PW 입력 >> ");
				id = sc.next();
				pw = sc.next();
				AuthDTO dto = new AuthDTO(id,pw);
				controller.SubConExecute("AUTH",2,dto);
				break;
			case 4 :  
				return; 
		
				
			default:	 //잘못누름
				System.out.println("번호 다시 입력하세요~");
		}//switch끝
		}
	}
	
		public void employeeMenu() {
			while (true) {
				System.out.println("🚗🚗🚗🚗🚗🚗관리자메뉴🚗🚗🚗🚗🚗🚗");
				System.out.println("1 차량관리");
				System.out.println("2 예약자조회");
				System.out.println("3 이전으로");
				System.out.println("🚗🚗🚗🚗🚗🚗관리자메뉴🚗🚗🚗🚗🚗🚗");
				System.out.print("번호 : ");
				num = sc.nextInt();

				switch (num) {
				case 1: // 차량관리
					Car();
					break;
				case 2: // 예약자조회
					
					break;
				case 3: // 이전
					return;
					
				default: // 잘못누름
					System.out.println("번호 다시 입력하세요~");
				}// switch끝
	}
}
		
		public void Car() {
			while (true) {
				System.out.println("🚗🚗🚗🚗🚗🚗부릉부릉🚗🚗🚗🚗🚗🚗");
				System.out.println("1 차량조회");
				System.out.println("2 차량등록");
				System.out.println("3 차량삭제");
				System.out.println("4 이전으로");
				System.out.println("🚗🚗🚗🚗🚗🚗부릉부릉🚗🚗🚗🚗🚗🚗");
				System.out.print("번호 : ");
				num = sc.nextInt();

				switch (num) {
				case 1: // 차량조회
					break;
				case 2: // 차량등록
					break;
				
				case 3: // 차량삭제
					break;
				case 4: // 이전
					return;
				default: // 잘못누름
					System.out.println("번호 다시 입력하세요~");
				}// switch끝
	}
}

		public void MemberMenu() {
			while (true) {
				System.out.println("🚗🚗🚗🚗🚗🚗회원메뉴🚗🚗🚗🚗🚗🚗");
				System.out.println("1 차량조회");
				System.out.println("2 차량예약");
				System.out.println("3 차량검색");
				System.out.println("4 이전으로");
				System.out.println("🚗🚗🚗🚗🚗🚗회원메뉴🚗🚗🚗🚗🚗🚗");
				System.out.println("번호 : ");
				num = sc.nextInt();

			switch (num) {
			case 1: // 차량조회
	
				break;
			case 2: // 차량예약
	
				break;
	
			case 3: // 차량검색
				break;
			case 4: // 이전
				return;
			default: // 잘못누름
				System.out.println("번호 다시 입력하세요~");
			}// switch끝
	}
}
}
