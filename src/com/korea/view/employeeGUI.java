package com.korea.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class employeeGUI {
	
	//직원 메뉴 관련
    JFrame employeemenu;
    JButton insert;
    JButton update;
    JButton delete;
    JButton select;
    JTextArea area;
    JScrollPane scroll;
	
	public employeeGUI()
    {
        employeemenu = new JFrame("직원메뉴");

        
        employeemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeemenu.setBounds(100, 100, 500, 500);
        employeemenu.setVisible(true);
    }

}
