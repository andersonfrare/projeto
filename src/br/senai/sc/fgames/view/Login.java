package br.senai.sc.fgames.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/icone.png")));
		setTitle("Login - FGames");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 355);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		txtLogin.setBounds(149, 140, 221, 26);
		txtLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 175, 221, 26);
		passwordField.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/images/botao.png")));
		label.setBounds(217, 212, 108, 34);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/logo.png")));
		lblNewLabel.setBounds(112, 11, 279, 99);
		contentPane.add(lblNewLabel);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/images/login.png")));
		label_1.setBounds(99, 132, 40, 34);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/images/senha.png")));
		label_2.setBounds(99, 164, 40, 51);
		contentPane.add(label_2);
	}
}
