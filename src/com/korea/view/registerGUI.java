package com.korea.view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class registerGUI extends JFrame implements ActionListener{
	
	JScrollPane scrollPane;
    ImageIcon icon;
    
  //로그인 창 관련
    //JFrame loginmenu;
    JTextField id;
    JTextField pw;
    JButton register;
    JButton exit;
    JRadioButton employee;
    JRadioButton member;
    JLabel emp;
    JLabel mem;
    ButtonGroup radiogroup;
    JPanel background;

    //직원 메뉴 관련
    JFrame employeemenu;
    JButton insert;
    JButton update;
    JButton delete;
    JButton select;
    JTextArea area;
    JScrollPane scroll;


    //회원 메뉴 관련
    JFrame membermenu;

	
	public registerGUI() {
   	 
        super("회원가입");  
        
        icon = new ImageIcon("C:\\Users\\wjdwl\\OneDrive\\바탕 화면\\밈\\무지개 보노보노.jpg");
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        background = new JPanel()
        {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                
                setOpaque(false);
                
                super.paintComponent(g);  
            }
        };
        
        id = new JTextField("ID");
        pw = new JTextField("PW");

        register = new JButton("회원가입");
        exit = new JButton("종료");
        
        
        id.setBounds(20, 20, 100, 20);
        pw.setBounds(20, 40, 100, 20);
        register.setBounds(120, 20, 100, 40);
        exit.setBounds(220, 20, 100, 40);
        
        exit.addActionListener(this);
        register.addActionListener(this);
        
        background.setLayout(null);
        background.add(id);
        background.add(pw);
        background.add(register);
        background.add(exit);
        
        
        
        
        add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 395);
        setVisible(true);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == exit) {
			System.out.println("회원가입창에서 종료버튼 클릭!");
			System.exit(-1);
		}
		
		if(e.getSource() == register) {
			System.out.println("회원가입 버튼 클릭!");
			JOptionPane.showMessageDialog(null, "회원가입 성공");
			MainLogin ml = new MainLogin();
			super.setVisible(false);
			
		}
		
	}
	
//	public static void main(String[] args) {
//		GaipGUI frame = new GaipGUI();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(640, 395);
//        frame.setVisible(true);
//    }
	
}
