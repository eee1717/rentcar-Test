package com.korea.controller;

import com.korea.dto.AuthDTO;
import com.korea.dto.DTO;
import com.korea.service.AuthService;
import com.korea.view.Viewer;

public class MemberController implements SubController
{
    AuthService service = new AuthService();
    @Override
    public boolean execute(int num, DTO dto, Viewer view)
    {
        AuthDTO adto = (AuthDTO) dto;

        if(num == 1)
        {
            return service.MemberSelect(adto, view);
        }
        else if(num == 2)
        {
            return service.MemberSearch(adto, view);
        }
        else if(num == 3)
        {
            return service.MemberDelete(adto);
        }
        return false;
    }
}
