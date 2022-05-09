package com.korea.view;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;
import com.korea.dto.CarDTO;

import java.util.Scanner;

public class Viewer
{
    Scanner sc = new Scanner(System.in);
    int num;

    FrontController controller = new FrontController();

    public void LoginMenu()
    {
        while(true)
        {
            System.out.println("--------------MAIN--------------");
            System.out.println("1 회원로그인");
            System.out.println("2 직원로그인");
            System.out.println("3 회원가입");
            System.out.println("4 전체 차량 조회");
            System.out.println("5 차종 검색");
            System.out.println("6 종료");
            System.out.println("--------------MAIN--------------");
            System.out.print("번호: ");
            num = sc.nextInt();
            switch(num)
            {
                case 1: // 회원로그인
                    System.out.print("IDㅣPW > ");
                    String tmpid = sc.next();
                    String tmppw = sc.next();
                    AuthDTO dto = new AuthDTO(tmpid, tmppw);
                    boolean r1 = controller.SubControllerEX("Auth", 1, dto,this);
                    if(r1)
                    {
                        //인증성공 -> 회원메뉴 출력
                        System.out.println("로그인 성공!");
                    }
                    else
                    {
                        System.out.println("로그인 실패..");
                    }
                    break;
                case 2: // 직원로그인
                    System.out.print("IDㅣPW > ");
                    String tmpid2 = sc.next();
                    String tmppw2 = sc.next();
                    AuthDTO dto2 = new AuthDTO(tmpid2, tmppw2);
                    boolean r2 = controller.SubControllerEX("Auth", 2, dto2,this);
                    if(r2)
                    {
                        //인증성공 -> 직원 메뉴 출력
                        System.out.println("로그인 성공!");
                        CarMenu();
                    }
                    else
                    {
                        System.out.println("로그인 실패..");
                    }
                    break;
                case 3:
                    System.out.println("IDㅣPWㅣ이름ㅣ나이ㅣ전화번호ㅣ주소ㅣ면허번호 > ");
                    String id = sc.next();
                    String pw = sc.next();
                    String name = sc.next();
                    int age = sc.nextInt();
                    String phone = sc.next();
                    String addr = sc.next();
                    String license = sc.next();
                    AuthDTO dto3 = new AuthDTO(id, pw, name, age, phone, addr, license);
                    boolean r3 = controller.SubControllerEX("Auth", 3, dto3, this);
                    if(r3)
                    {
                        System.out.println("가입 성공!");
                    }
                    else
                    {
                        System.out.println("가입 실패");
                    }
                    break;
                case 4:
                    boolean result1 = controller.SubControllerEX("Car", 1, null, this);
                    break;
                case 5:
                    System.out.print("차종 입력 > ");
                    String Car_Name2 = sc.next();
                    CarDTO dto5 = new CarDTO(Car_Name2, 1);
                    boolean result2 = controller.SubControllerEX("Car", 2, dto5, this);
                    break;
                case 6: // 종료
                    System.out.println("프로그램을 종료합니다");
                    System.exit(-1);
                default:
                    System.out.println("잘못입력하셨습니다..");
            }
        }
    }

    public void CarMenu()
    {
        while(true)
        {
            System.out.println("--------------Car--------------");
            System.out.println("1 전체차량조회");
            System.out.println("2 차종별 검색");
            System.out.println("3 차량등록");
            System.out.println("4 차량정보수정");
            System.out.println("5 차량 등록 취소");
            System.out.println("6 뒤로 가기");
            System.out.println("--------------Car--------------");
            System.out.print("번호: ");
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                    boolean result1 = controller.SubControllerEX("Car", 1, null, this);
                    break;
                case 2:
                    System.out.print("차종 입력 > ");
                    String Car_Name2 = sc.next();
                    CarDTO dto2 = new CarDTO(Car_Name2, 1);
                    boolean result2 = controller.SubControllerEX("Car", 2, dto2, this);
                    break;
                case 3:
                    System.out.print("차량번호ㅣ차종ㅣ인승ㅣ색상ㅣ가격 > ");
                    String Car_Code3 = sc.next();
                    String Car_Name3 = sc.next();
                    int Car_Person3 = sc.nextInt();
                    String Car_Color3 = sc.next();
                    int Car_Price3 = sc.nextInt();
                    CarDTO dto3 = new CarDTO(Car_Code3, Car_Name3, Car_Person3, Car_Color3, Car_Price3);
                    boolean result3= controller.SubControllerEX("Car", 3, dto3, this);
                    if(result3)
                    {
                        System.out.println("등록 완료!");
                    }
                    else
                    {
                        System.out.println("등록 실패!");
                    }
                    break;
                case 4:
                    System.out.print("수정할 차량번호 > ");
                    String Car_Code4 = sc.next();
                    System.out.print("차종ㅣ인승ㅣ색상ㅣ가격 > ");
                    String Car_Name4 = sc.next();
                    int Car_Person4 = sc.nextInt();
                    String Car_Color4 = sc.next();
                    int Car_Price4 = sc.nextInt();
                    CarDTO dto4 = new CarDTO(Car_Code4, Car_Name4, Car_Person4, Car_Color4, Car_Price4);
                    boolean result4 = controller.SubControllerEX("Car", 4, dto4, this);
                    if(result4)
                    {
                        System.out.println("수정 완료!");
                    }
                    else
                    {
                        System.out.println("수정 실패!");
                    }
                    break;
                case 5:
                    System.out.print("삭제할 차량번호 > ");
                    String Car_Code5 = sc.next();
                    CarDTO dto5 = new CarDTO(Car_Code5);
                    boolean result5 = controller.SubControllerEX("Car", 5, dto5, this);
                    if(result5)
                    {
                        System.out.println("삭제 완료!");
                    }
                    else
                    {
                        System.out.println("삭제 실패!");
                    }
                    break;
                case 6:
                    LoginMenu();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}