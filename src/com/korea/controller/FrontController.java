package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.DTO;
import com.korea.view.CARsignGUI;
import com.korea.view.Viewer;


public class FrontController
{
    Map<String, SubController> map = new HashMap();

    public FrontController()
    { //μμΊμ€ν
        Init();
    }

    void Init()
    {
        map.put("Car", new CarController());
        map.put("Auth", new AuthController());
        map.put("Member", new MemberController());
    }

    public boolean SubControllerEX(String menu, int num, DTO dto, Viewer view)
    {
        if(menu.equals("Car"))
        {
            SubController sub = map.get("Car");
            return sub.execute(num, dto, view);
        }
        else if(menu.equals("Auth"))
        {
            SubController sub = map.get("Auth");
            return sub.execute(num, dto, view);
        }
        else if(menu.equals("Member"))
        {
            SubController sub = map.get("Member");
            return sub.execute(num, dto, view);
        }
        return false;
    }
}
