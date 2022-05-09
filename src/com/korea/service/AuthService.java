package com.korea.service;

import com.korea.domain.AuthDAO;
import com.korea.dto.AuthDTO;
import com.korea.view.Viewer;

import java.sql.ResultSet;

public class AuthService
{
    AuthDAO dao = new AuthDAO();
    ResultSet rs;
    //회원 로그인
    public boolean MemberLogin(AuthDTO dto)
    {
        return dao.MemberLogin(dto);
    }

    //직원 로그인
    public boolean EmployeeLogin(AuthDTO dto)
    {
        return dao.EmployeeLogin(dto);
    }

    //회원가입
    public boolean MemberSignUp(AuthDTO dto)
    {
        return dao.MemberSignUp(dto);
    }

    public boolean MemberSelect(AuthDTO dto, Viewer view)
    {
        try
        {
            rs = dao.MemberSelect();
            System.out.println("------------------------------------------");
            System.out.println("id\t\tpw\t\t이름\t나이\t전화번호\t주소\t면허번호");
            System.out.println("------------------------------------------");
            while(rs.next())
            {
                System.out.println(rs.getString("Member_id") + "\t" + rs.getString("Member_pw") + "\t" + rs.getString("Member_name") + "\t\t" + rs.getString("Member_age") + "\t" + rs.getString("Member_phone") + "\t" + rs.getString("Member_addr") + "\t" + rs.getString("Member_license"));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }


    public boolean MemberSearch(AuthDTO dto, Viewer view)
    {
        try
        {
            rs = dao.MemberSearch(dto);
            System.out.println("------------------------------------------");
            System.out.println("id\tpw\t이름\t나이\t전화번호\t주소\t면허번호");
            System.out.println("------------------------------------------");
            while(rs.next())
            {
                System.out.println(rs.getString("Member_id") + "\t" + rs.getString("Member_pw") + "\t" + rs.getString("Member_name") + "\t\t" + rs.getString("Member_age") + "\t" + rs.getString("Member_phone") + "\t" + rs.getString("Member_addr") + "\t" + rs.getString("Member_license"));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }

    public boolean MemberDelete(AuthDTO dto)
    {
        return dao.MemberDelete(dto);
    }
}
