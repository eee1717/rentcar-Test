package com.korea.service;

import com.korea.domain.AuthDAO;
import com.korea.dto.AuthDTO;

public class AuthService {
	AuthDAO dao = new AuthDAO();

	public void login(AuthDTO dto) {
		dao.login(dto);		
	}
	public void SignUp(AuthDTO dto) {
		dao.SignUp(dto);	}


	

}
