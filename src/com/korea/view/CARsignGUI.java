package com.korea.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.korea.controller.FrontController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;
import com.korea.dto.CarDTO;
import com.korea.dto.MemberDTO;
import java.awt.Toolkit;
import javax.swing.ImageIcon;









public class CARsignGUI {

	private JFrame frame;
	private JTextField usertextField;
	private JTextField usertextField_1;
	private JTextField allusertextField;
	
	FrontController controller = new FrontController();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CARsignGUI window = new CARsignGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CARsignGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(CARsignGUI.class.getResource("/com/korea/view/배경화면.jpg")));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton1 = new JButton("전체회원조회");
		btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				controller.SubControllerEX("Member", 2, null, this); 	  // 연동물어보기front controller와 연결시킬예정 전제회원조회시 오라클이나 워크벤치에 저장된 전체 데이터가 출력되어야한다.
			}
		});
		btnNewButton1.setBounds(319, 72, 153, 23);
		panel.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("회원검색");
		btnNewButton2.setBounds(319, 39, 153, 23);
		panel.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("회원정보삭제");
		btnNewButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "삭제완료"); //회원정보삭제 버튼을 누를시 화면에 뜨는 문자    이걸 if문으로 안에있는 회원정보랑 일치할시에 삭제완료버튼이나와야한다.
			}
		});
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
	

			}
		});
		btnNewButton3.setBounds(319, 105, 152, 23);
		panel.add(btnNewButton3);
		
		usertextField = new JTextField();
		usertextField.setBounds(75, 40, 232, 21);
		panel.add(usertextField);
		usertextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("회원코드");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel.setBounds(22, 43, 57, 15);
		panel.add(lblNewLabel);
		
		usertextField_1 = new JTextField();
		usertextField_1.setBounds(22, 71, 286, 75);
		panel.add(usertextField_1);
		usertextField_1.setColumns(10);
		
		allusertextField = new JTextField();
		allusertextField.setColumns(10);
		allusertextField.setBounds(22, 156, 285, 245);
		panel.add(allusertextField);
		
		JButton btnNewButton4 = new JButton("이전");
		btnNewButton4.setBounds(319, 138, 152, 23);
		panel.add(btnNewButton4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CARsignGUI.class.getResource("/com/korea/view/노트북이모티콘.png")));
		lblNewLabel_1.setBounds(323, 188, 149, 201);
		panel.add(lblNewLabel_1);
		frame.setBounds(100, 200, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
