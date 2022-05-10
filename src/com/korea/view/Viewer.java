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
            System.out.println("3 종료");
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
                case 3: // 종료
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
            System.out.println("1 Select");
            System.out.println("2 Insert");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Prev");
            System.out.println("--------------Car--------------");
            System.out.print("번호: ");
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                    boolean result1 = controller.SubControllerEX("Car", 1, null, this);
                    if(result1)
                    {
                        System.out.println("조회 완료!");
                    }
                    else
                    {
                        System.out.println("조회 실패!");
                    }
                    break;
                case 2:
                    System.out.print("차량번호ㅣ차종ㅣ인승ㅣ색상ㅣ가격 > ");
                    String Car_Code2 = sc.next();
                    String Car_Name2 = sc.next();
                    int Car_Person2 = sc.nextInt();
                    String Car_Color2 = sc.next();
                    int Car_Price2 = sc.nextInt();
                    CarDTO dto = new CarDTO(Car_Code2, Car_Name2, Car_Person2, Car_Color2, Car_Price2);
                    boolean result2 = controller.SubControllerEX("Car", 2, dto, this);
                    if(result2)
                    {
                        System.out.println("등록 완료!");
                    }
                    else
                    {
                        System.out.println("등록 실패!");
                    }
                    break;
                case 3:
                    System.out.print("수정할 차량번호 > ");
                    String Car_Code3 = sc.next();
                    System.out.print("차종ㅣ인승ㅣ색상ㅣ가격 > ");
                    String Car_Name3 = sc.next();
                    int Car_Person3 = sc.nextInt();
                    String Car_Color3 = sc.next();
                    int Car_Price3 = sc.nextInt();
                    CarDTO dto3 = new CarDTO(Car_Code3, Car_Name3, Car_Person3, Car_Color3, Car_Price3);
                    boolean result3 = controller.SubControllerEX("Car", 3, dto3, this);
                    if(result3)
                    {
                        System.out.println("수정 완료!");
                    }
                    else
                    {
                        System.out.println("수정 실패!");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 차량번호 > ");
                    String Car_Code4 = sc.next();
                    CarDTO dto4 = new CarDTO(Car_Code4);
                    boolean result4 = controller.SubControllerEX("Car", 4, dto4, this);
                    if(result4)
                    {
                        System.out.println("삭제 완료!");
                    }
                    else
                    {
                        System.out.println("삭제 실패!");
                    }
                    break;
                case 5:
                	System.out.println("로그인창으로 돌아갑니다.");
                	return;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}