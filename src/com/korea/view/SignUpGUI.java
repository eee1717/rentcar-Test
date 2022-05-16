package com.korea.view;

import com.korea.controller.FrontController;
import com.korea.dto.MemberDTO;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import javax.swing.*;

public class SignUpGUI extends JFrame implements ActionListener
{
    FrontController controller = new FrontController();
    Viewer view = new Viewer();
    ImageIcon icon;

    //로그인 창 관련
    JTextField Member_id;      // 아이디
    JTextField Member_pw;      // 비밀번호 486
    JTextField Member_name;   // 이름
    JTextField Member_age;      // 나이
    JTextField Member_sex;      // 성별
    JTextField Member_phone;   // 전화번호
    JTextField Member_addr;   // 주소
    JTextField Member_license;      // 운전면허 종류
    JTextField license_num;   // 운전면허 번호
    JTextField license_start;   // 운전면어 취득일자
    JTextField license_end;   // 운전면어 만료일

    JLabel Member_idL;
    JLabel Member_pwL;
    JLabel Member_nameL;
    JLabel Member_ageL;
    JLabel Member_sexL;
    JLabel Member_phoneL;
    JLabel Member_addrL;
    JLabel Member_licenseL;
    JLabel license_numL;
    JLabel license_startL;
    JLabel license_endL;

    JButton SignUp;
    JButton back;

    JPanel background;

    public SignUpGUI()
    {
        super("회원가입");

        icon = new ImageIcon("C:\\Users\\1\\git\\RentalCarProject3\\src\\com\\korea\\view\\무지개 보노보노.jpg");
        //배경 Panel 생성후 컨텐츠페인으로 지정
        background = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                g.drawImage(icon.getImage(), 0, 0, null);

                setOpaque(false);

                super.paintComponent(g);
            }
        };

        Member_id = new JTextField();
        Member_pw = new JTextField();
        Member_name = new JTextField();
        Member_age = new JTextField();
        Member_sex = new JTextField();
        Member_phone = new JTextField();
        Member_addr = new JTextField();
        Member_license = new JTextField();
        license_num = new JTextField();
        license_start = new JTextField();
        license_end = new JTextField();

        Member_idL = new JLabel("ID");
        Member_idL.setOpaque(true);
        Member_idL.setBackground(Color.LIGHT_GRAY);
        Member_pwL = new JLabel("PW");
        Member_pwL.setOpaque(true);
        Member_pwL.setBackground(Color.LIGHT_GRAY);
        Member_nameL = new JLabel("이름");
        Member_nameL.setOpaque(true);
        Member_nameL.setBackground(Color.LIGHT_GRAY);
        Member_ageL = new JLabel("나이");
        Member_ageL.setOpaque(true);
        Member_ageL.setBackground(Color.LIGHT_GRAY);
        Member_sexL = new JLabel("성별");
        Member_sexL.setOpaque(true);
        Member_sexL.setBackground(Color.LIGHT_GRAY);
        Member_phoneL = new JLabel("전화번호");
        Member_phoneL.setOpaque(true);
        Member_phoneL.setBackground(Color.LIGHT_GRAY);
        Member_addrL = new JLabel("주소");
        Member_addrL.setOpaque(true);
        Member_addrL.setBackground(Color.LIGHT_GRAY);
        Member_licenseL = new JLabel("면허종류");
        Member_licenseL.setOpaque(true);
        Member_licenseL.setBackground(Color.LIGHT_GRAY);
        license_numL = new JLabel("면허번호");
        license_numL.setOpaque(true);
        license_numL.setBackground(Color.LIGHT_GRAY);
        license_startL = new JLabel("취득일(년-월-일)");
        license_startL.setOpaque(true);
        license_startL.setBackground(Color.LIGHT_GRAY);
        license_endL = new JLabel("만료일(년-월-일)");
        license_endL.setOpaque(true);
        license_endL.setBackground(Color.LIGHT_GRAY);

        SignUp = new JButton("회원가입");
        back = new JButton("뒤로가기");

        Member_id.setBounds(70, 20, 80, 20);
        Member_pw.setBounds(210, 20, 80, 20);
        Member_name.setBounds(350, 20, 80, 20);
        Member_age.setBounds(490, 20, 80, 20);

        Member_sex.setBounds(70, 40, 80, 20);
        Member_phone.setBounds(210, 40, 80, 20);
        Member_addr.setBounds(350, 40, 80, 20);
        Member_license.setBounds(490, 40, 80, 20);

        license_num.setBounds(70, 60, 80, 20);
        license_start.setBounds(250, 60, 100, 20);
        license_end.setBounds(450, 60, 100, 20);

        //////////////////////////////////////////////////////////////

        Member_idL.setBounds(10, 20, 80, 20);
        Member_pwL.setBounds(150, 20, 80, 20);
        Member_nameL.setBounds(290, 20, 80, 20);
        Member_ageL.setBounds(430, 20, 80, 20);

        Member_sexL.setBounds(10, 40, 80, 20);
        Member_phoneL.setBounds(150, 40, 80, 20);
        Member_addrL.setBounds(290, 40, 80, 20);
        Member_licenseL.setBounds(430, 40, 80, 20);

        license_numL.setBounds(10, 60, 80, 20);
        license_startL.setBounds(150, 60, 100, 20);
        license_endL.setBounds(350, 60, 100, 20);

        SignUp.setBounds(520, 290, 90, 30);
        back.setBounds(520, 320, 90, 30);

        back.addActionListener(this);
        SignUp.addActionListener(this);

        background.setLayout(null);
        background.add(Member_id);
        background.add(Member_pw);
        background.add(Member_name);
        background.add(Member_age);
        background.add(Member_sex);
        background.add(Member_phone);
        background.add(Member_addr);
        background.add(Member_license);
        background.add(license_num);
        background.add(license_start);
        background.add(license_end);

        background.add(Member_idL);
        background.add(Member_pwL);
        background.add(Member_nameL);
        background.add(Member_ageL);
        background.add(Member_sexL);
        background.add(Member_phoneL);
        background.add(Member_addrL);
        background.add(Member_licenseL);
        background.add(license_numL);
        background.add(license_startL);
        background.add(license_endL);

        background.add(SignUp);
        background.add(back);

        add(background);

        setBounds(100, 100, 640, 395);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource() == SignUp)
        {
            try
            {
                String id = Member_id.getText();
                String pw = Member_pw.getText();
                String name = Member_name.getText();
                int age = Integer.parseInt(Member_age.getText());
                String sex = Member_sex.getText();
                String phone = Member_phone.getText();
                String addr = Member_addr.getText();
                String license = Member_license.getText();
                String License_num = license_num.getText();
                Date License_start = Date.valueOf(license_start.getText());
                Date License_end = Date.valueOf(license_end.getText());
                MemberDTO dto = new MemberDTO(id, pw, name, age, sex, phone, addr, license, License_num, License_start, License_end);
                boolean r = controller.SubControllerEX("Member", 1, dto, view);
                if(r)
                {
                    JOptionPane.showMessageDialog(null, "회원가입 성공");
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "중복된 ID 입니다.");
                }
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null, "정해진 양식과 맞지않습니다.");
            }

        }
        else if(e.getSource() == back)
        {
            System.out.println("회원가입창에서 뒤로가기버튼 클릭!");
            setVisible(false);
        }
    }
}