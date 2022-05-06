package com.korea.domain;

public class CarDTO {
	
	public String Car_Code;
	public String Car_Name;
	public String Car_Person;
	public String Car_Color;
	
	public CarDTO(String car_Code, String car_Name, String car_Person, String car_Color) {
		super();
		Car_Code = car_Code;
		Car_Name = car_Name;
		Car_Person = car_Person;
		Car_Color = car_Color;
	}

	public String getCar_Code() {
		return Car_Code;
	}

	public void setCar_Code(String car_Code) {
		Car_Code = car_Code;
	}

	public String getCar_Name() {
		return Car_Name;
	}

	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}

	public String getCar_Person() {
		return Car_Person;
	}

	public void setCar_Person(String car_Person) {
		Car_Person = car_Person;
	}

	public String getCar_Color() {
		return Car_Color;
	}

	public void setCar_Color(String car_Color) {
		Car_Color = car_Color;
	}

	@Override
	public String toString() {
		return "CarDTO [Car_Code=" + Car_Code + ", Car_Name=" + Car_Name + ", Car_Person=" + Car_Person + ", Car_Color="
				+ Car_Color + "]";
	}
	
	

}
