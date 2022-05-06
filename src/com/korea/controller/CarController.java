package com.korea.controller;

import com.korea.dto.CarDTO;
import com.korea.dto.DTO;
import com.korea.service.CarService;

public class CarController implements  SubController {
	CarService service = new CarService();
	@Override
	public boolean execute(int num, DTO dto) {
		CarDTO cdto= (CarDTO)dto;
		if(num==1) {
			
			
		}else if(num==2) {
			return service.Insert(cdto);
			
		}else if(num==3) {
			
		}else if(num==4) {
			
		}
		
		return false;
	}
		
	}

	


