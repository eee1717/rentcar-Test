package com.korea.view;

import java.util.Scanner;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;
import com.korea.dto.CarDTO;


public class Viewer {
	int num;
	Scanner sc = new Scanner(System.in);
	
	FrontController controller = new FrontController();

	
	public void LoginMenu() {
		while(true) {
			System.out.println("-----Login-----");
			System.out.println("1 직원로그인");
			System.out.println("2 회원로그인");
			System.out.println("3 종료");
			System.out.println("-----Login-----");
			System.out.print("번호 : ");
			num=sc.nextInt();
			
			switch(num) {
			case 1 : //직원로그인
//				AuthMenu();
				break;
			case 2 : //회원로그인
				break;
			case 3 : //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(-1);
				break;
			default : 	
			}
		}
	}
	
	
//	public void AuthMenu() {
//		String id;
//		String pw;
//		while(true) {
//			System.out.println("🚗🚗🚗🚗🚗🚗인증메뉴🚗🚗🚗🚗🚗🚗");
//			System.out.println("1 회원로그인");
//			System.out.println("2 회원가입");
//			System.out.println("3 이전으로");
//			System.out.println("🚗🚗🚗🚗🚗🚗인증메뉴🚗🚗🚗🚗🚗🚗");
//			System.out.print("번호 : ");
//			num=sc.nextInt();
//			
//			switch(num) {
//			case 1 : //회원로그인
//				System.out.println("ID와 PW 입력 >> ");
//				id = sc.next();
//				pw = sc.next();
//				AuthDTO dto2 = new AuthDTO(id,pw);
//				controller.SubConExecute("AUTH",1,dto2);
//				break;
//			case 2 : //비회원가입
//				System.out.println("ID와 PW 입력 >> ");
//				id = sc.next();
//				pw = sc.next();
//				AuthDTO dto = new AuthDTO(id,pw);
//				controller.SubConExecute("AUTH",2,dto);
//				break;
//			case 4 :  
//				return; 
//		
//				
//			default:	 //잘못누름
//				System.out.println("번호 다시 입력하세요~");
//		}//switch끝
//		}
//	}
//	
//		public void employeeMenu() {
//			while (true) {
//				System.out.println("🚗🚗🚗🚗🚗🚗관리자메뉴🚗🚗🚗🚗🚗🚗");
//				System.out.println("1 차량관리");
//				System.out.println("2 예약자조회");
//				System.out.println("3 이전으로");
//				System.out.println("🚗🚗🚗🚗🚗🚗관리자메뉴🚗🚗🚗🚗🚗🚗");
//				System.out.print("번호 : ");
//				num = sc.nextInt();
//
//				switch (num) {
//				case 1: // 차량관리
//					Car();
//					break;
//				case 2: // 예약자조회
//					
//					break;
//				case 3: // 이전
//					return;
//					
//				default: // 잘못누름
//					System.out.println("번호 다시 입력하세요~");
//				}// switch끝
//	}
//}
		
		public void CarMenu() {
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
					System.out.println("차량번호|차량종류|인승|색상 >> ");
					String Car_Code=sc.next();
					String Car_Name=sc.next();
					String Car_Person=sc.next();
					String Car_Color=sc.next();
					CarDTO dto = new CarDTO(Car_Code,Car_Name,Car_Person,Car_Color);
					boolean result=controller.SubConExecute("CAR",2,dto);
					
					if(result) 
						System.out.println("등록성공");
					else 
						System.out.println("등록실패");
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
