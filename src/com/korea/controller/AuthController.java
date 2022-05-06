package com.korea.controller;

import com.korea.dto.AuthDTO;
import com.korea.service.AuthService;

public class AuthController implements SubController {
	AuthService service = new AuthService();

	@Override
	public void execute(int num, AuthDTO dto) {
		switch(num) {
		case 1 : //회원로그인
			service.login(dto);
			break;
		case 2 : //회원가입
			service.SignUp(dto);
			break;
		case 3 : //관리자로그인
			break;
		}		
	}
}
