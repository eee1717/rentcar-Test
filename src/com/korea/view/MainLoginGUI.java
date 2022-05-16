package com.korea.view;

import java.awt.event.*;
import javax.swing.*;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;

import java.awt.*;

public class MainLoginGUI extends JFrame implements ActionListener
{
    Viewer view = new Viewer();
    FrontController controller = new FrontController();
    ImageIcon icon;

    JTextField id;
    TextField pw;
    JButton login;
    JButton SignUp;
    JButton exit;
    JRadioButton employee;
    JRadioButton member;
    JLabel emp;
    JLabel mem;
    JLabel id1;
    JLabel pw1;
    ButtonGroup radiogroup;

    public MainLoginGUI()
    {

        super("오래전부터 빌리고 싶었어");

        icon = new ImageIcon("C:\\Users\\1\\git\\RentalCarProject3\\src\\com\\korea\\view\\RentCar.png");
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };

        id = new JTextField();
        pw = new TextField();
        login = new JButton("로그인");
        SignUp = new JButton("회원가입");
        exit = new JButton("종료");

        emp = new JLabel("직원");
        mem = new JLabel("멤버");
        id1 = new JLabel("아이디");
        pw1 = new JLabel("비밀번호");

        employee = new JRadioButton("직원");
        member = new JRadioButton("회원");

        radiogroup = new ButtonGroup();
        radiogroup.add(employee);
        radiogroup.add(member);

        id.setBounds(350, 40, 100, 20);
        pw.setBounds(450, 40, 100, 20);
        id1.setBounds(350,20,100,20);
        pw1.setBounds(450,20,100,20);
        SignUp.setBounds(550, 10, 160, 30);
        login.setBounds(550, 40, 80, 30);
        exit.setBounds(630, 40, 80, 30);

        member.setBounds(710, 20, 20, 20);
        mem.setBounds(730, 20, 40, 20);
        employee.setBounds(710, 40, 20, 20);
        emp.setBounds(730, 40, 40, 20);

        member.setSelected(true);
        pw.setEchoChar('*');

        //리스너
        login.addActionListener(this);
        SignUp.addActionListener(this);
        exit.addActionListener(this);

        background.setLayout(null);
        background.add(id);
        background.add(pw);
        background.add(id1);
        background.add(pw1);
        background.add(login);
        background.add(SignUp);
        background.add(exit);
        background.add(emp);
        background.add(mem);
        background.add(employee);
        background.add(member);

        add(background);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1150, 600);
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // 회원가입 -> 회원가입
        if(e.getSource() == SignUp)
        {
            System.out.println("회원가입 버튼 클릭");
            new SignUpGUI();
        }
        // 멤버 체크박스 클릭후 로그인 -> 멤버
        else if(member.isSelected())
        {
            String tmpid = id.getText();
            String tmppw = pw.getText();
            AuthDTO dto = new AuthDTO(tmpid, tmppw);
            boolean r1 = controller.SubControllerEX("Auth", 1, dto, view);
            if(r1)
            {
                //인증성공 -> 회원메뉴 출력
                System.out.println("로그인 성공!");
                new MemberGUI();
                super.setVisible(false);
            }
            else
            {
                System.out.println("로그인 실패..");
            }
        }
        // 직원 체크박스 클릭후 로그인 -> 직원
        else if(employee.isSelected())
        {
            String tmpid2 = id.getText();
            String tmppw2 = pw.getText();
            AuthDTO dto2 = new AuthDTO(tmpid2, tmppw2);
            boolean r2 = controller.SubControllerEX("Auth", 2, dto2, view);
            if(r2)
            {
                //인증성공 -> 회원메뉴 출력
                System.out.println("로그인 성공!");
                new EmployeeGUI();
                super.setVisible(false);
            }
            else
            {
                System.out.println("로그인 실패..");
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