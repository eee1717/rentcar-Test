package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.domain.*;
import com.korea.dto.CarDTO;
import com.korea.view.Viewer;

public class carMain {

	public static void main(String[] args) {
		
//		CarDTO dto1 = new CarDTO("11허1111","람보르기니","2인승","RED");
//		CarDTO dto2 = new CarDTO("69허6974","포르쉐911","2인승","WHITE");
//		CarDAO dao = new CarDAO();
//		
//		dao.Insert(dto1);
//		dao.Insert(dto2);
//		FrontController controller = new FrontController();
//		CarDTO dto = new CarDTO("49하1011","벤츠","4인승","yellow");
//		controller.SubConExecute("CAR",2,dto);
	
		Viewer viewer = new Viewer();
		viewer.CarMenu();
	}

}
