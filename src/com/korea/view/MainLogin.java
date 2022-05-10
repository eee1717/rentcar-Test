package com.korea.view;

import java.awt.event.*;
import javax.swing.*;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;

import java.awt.*;

public class MainLogin extends JFrame implements ActionListener
{

    FrontController controller = new FrontController();

    JScrollPane scrollPane;
    ImageIcon icon;

    //로그인 창 관련
    //JFrame loginmenu;
    JTextField id;
    JTextField pw;
    JButton login;
    JButton register;
    JButton exit;
    JRadioButton employee;
    JRadioButton member;
    JLabel emp;
    JLabel mem;
    ButtonGroup radiogroup;


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


    public MainLogin()
    {

        super("오래전부터 빌리고 싶었어");

        icon = new ImageIcon("C:\\Users\\rlatj\\IdeaProjects\\RentalCarProject\\src\\com\\korea\\view\\RentCar.png");
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                // Approach 1: Dispaly image at at full size
                g.drawImage(icon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };

        id = new JTextField("ID");
        pw = new JTextField("PW");

        login = new JButton("로그인");
        register = new JButton("회원가입");
        exit = new JButton("종료");

        emp = new JLabel("직원");
        mem = new JLabel("멤버");

        employee = new JRadioButton("직원");
        member = new JRadioButton("회원");


        radiogroup = new ButtonGroup();
        radiogroup.add(employee);
        radiogroup.add(member);


        id.setBounds(350, 20, 100, 20);
        pw.setBounds(450, 20, 100, 20);
        register.setBounds(550, 40, 160, 30);
        login.setBounds(550, 10, 80, 30);
        exit.setBounds(630, 10, 80, 30);

        employee.setBounds(710, 20, 20, 20);
        emp.setBounds(730, 20, 40, 20);
        member.setBounds(755, 20, 20, 20);
        mem.setBounds(775, 20, 40, 20);

        employee.setSelected(true);

        //리스너
        login.addActionListener(this);
        register.addActionListener(this);
        exit.addActionListener(this);

        background.setLayout(null);
        background.add(id);
        background.add(pw);
        background.add(login);
        background.add(register);
        background.add(exit);
        background.add(emp);
        background.add(mem);
        background.add(employee);
        background.add(member);

        add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1150, 600);
        setVisible(true);
    }

    //직원 메뉴
    void Employee()
    {
        employeemenu = new JFrame("직원메뉴");


        employeemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeemenu.setBounds(100, 100, 500, 500);
        employeemenu.setVisible(true);
    }

    //회원 메뉴
    void Member()
    {
        membermenu = new JFrame("회원메뉴");


        membermenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        membermenu.setBounds(100, 100, 500, 500);
        membermenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // 회원가입 -> 회원가입
        if(e.getSource() == register)
        {
            System.out.println("회원가입 버튼 클릭");
            new registerGUI();
        }
        // 직원 체크박스 클릭후 로그인 -> 직원
        else if(employee.isSelected())
        {
            AuthDTO dto = new AuthDTO(id.getText(), pw.getText());
            boolean r = controller.SubControllerEX("AUTH", 2, dto, null);
            if(r)
            {
                employeeGUI emp = new employeeGUI();
                Employee();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "로그인 실패");
            }

        }
        // 멤버 체크박스 클릭후 로그인 -> 멤버
        else if(member.isSelected())
        {
            AuthDTO dto = new AuthDTO(id.getText(), pw.getText());
            boolean r = controller.SubControllerEX("AUTH", 1, dto, null);
            if(r)
            {
                memberGUI mem = new memberGUI();
                Member();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "로그인 실패");
            }
        }

        // 종료 -> 종료
        if(e.getSource() == exit)
        {
            System.out.println("종료 버튼 클릭!");
            System.exit(-1);
        }     
    }
}