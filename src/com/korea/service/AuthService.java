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

}
