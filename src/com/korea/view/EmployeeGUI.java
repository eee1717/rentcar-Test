package com.korea.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.util.*;

public class EmployeeGUI implements ActionListener{
	
	//직원 메뉴 관련
    JFrame employeemenu;
    JButton select;
    JButton insert;
    JButton update;
    JButton delete;
    
    JTextArea area;
    JScrollPane scroll;
	
	public EmployeeGUI()
    {
        employeemenu = new JFrame("직원메뉴");

        
        employeemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeemenu.setBounds(100, 100, 500, 500);
		employeemenu.setResizable(false);
        employeemenu.setVisible(true);
        
        select = new JButton("차량 조회");
		select.setBounds(0, 0, 500, 100);
		employeemenu.add(select);

		insert = new JButton("차량 정보 입력");
		insert.setBounds(0, 125, 500, 100);
		employeemenu.add(insert);
		
		update = new JButton("차량 정보 수정");
		update.setBounds(0, 250, 500, 100);
		employeemenu.add(update);
		
		delete = new JButton("차량 정보 삭제");
		delete.setBounds(0, 375, 500, 100);
		employeemenu.setLayout(null);
		employeemenu.add(delete);
		
		insert.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == select) {
			
		}
		
		if (e.getSource() == insert) {
			String car_code;
			String car_name;
			int car_person;
			String car_color;
			int car_price;
			String car_rentable;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("차 번호 입력! : ");
			car_code = sc.next();
			System.out.print("차 이름 입력! : ");
			car_name = sc.next();
			System.out.print("차 인승 입력! : ");
			car_person = sc.nextInt();
			System.out.print("차 색상 입력! : ");
			car_color = sc.next();
			System.out.print("차 가격 입력! : ");
			car_price = sc.nextInt();
			System.out.print("차 대여여부 입력! : ");
			car_rentable = sc.next();
			
			sc.close();
			
			
			
		}
		
		if (e.getSource() == update) {
			
		}
		
		if (e.getSource() == delete) {
			
		}
		
	}
	
}
