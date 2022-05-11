package com.korea.view;

import javax.swing.JFrame;

public class MemberGUI
{
	
	//회원 메뉴 관련
    JFrame membermenu;
    
    //회원 메뉴
    public MemberGUI()
    {
        membermenu = new JFrame("회원메뉴");


        membermenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        membermenu.setBounds(100, 100, 500, 500);
        membermenu.setResizable(false);
        membermenu.setVisible(true);
    }

}
