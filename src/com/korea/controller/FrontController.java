package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.AuthDTO;


public class FrontController {
	Map<String, SubController> map = new HashMap();
	
	public FrontController(){ //업캐스팅
		Init();
	}
	void Init() {
		map.put("AUTH",new AuthController());
//		map.put("EMPLOYEE",new EmployeeController());
//		map.put("MEMBER",new MemberController());
		
	}

	public void SubConExecute(String menu, int num, AuthDTO dto) {
		if(menu.equals("AUTH")) {
			SubController sub = map.get("AUTH");
			sub.execute(num, dto); 
		}else if (menu.equals("EMPIOYEE")){
		}else if(menu.equals("MEMBER")) {
		}
	}
}
