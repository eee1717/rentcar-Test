package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.AuthDTO;
import com.korea.dto.DTO;
import com.korea.view.Viewer;


public class FrontController
{
    Map<String, SubController> map = new HashMap();

    public FrontController()
    { //업캐스팅
        Init();
    }

    void Init()
    {
        map.put("Car", new CarController());
        map.put("Auth", new AuthController());
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
        return false;
    }
}
