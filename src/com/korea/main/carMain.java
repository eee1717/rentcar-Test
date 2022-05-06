package com.korea.main;

import com.korea.domain.*;

public class carMain {

	public static void main(String[] args) {
		
		CarDTO dto1 = new CarDTO("11허1111","람보르기니","2인승","RED");
		CarDTO dto2 = new CarDTO("69허6974","포르쉐911","2인승","WHITE");
		CarDAO dao = new CarDAO();
		
		dao.Insert(dto1);
		dao.Insert(dto2);
		

	}

}
