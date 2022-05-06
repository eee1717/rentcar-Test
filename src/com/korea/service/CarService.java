package com.korea.service;

import com.korea.domain.CarDAO;
import com.korea.dto.CarDTO;

public class CarService {
	CarDAO dao = new CarDAO();
	public boolean Insert(CarDTO dto) {
		return dao.Insert(dto);
	}

}
