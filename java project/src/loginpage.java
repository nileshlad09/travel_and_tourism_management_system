import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368,768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		
		textField = new JTextField();
		textField.setBounds(412, 281, 243, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl1 =new JLabel("User ID:-");
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(290, 279, 92, 35);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lbl1);
		

		JLabel lbl2 =new JLabel("Password:-");
		lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(290, 359, 92, 35);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lbl2);
		
		JButton btn1 = new JButton("SignIn");
		btn1.setForeground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					String Username=textField.getText();
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
					Statement stmt=con.createStatement();
					String sql="Select * from createaccount where username='"+Username+"' and password='"+passwordField.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
				
						setVisible(false);
						new homepage(Username).setVisible(true);
						
					}else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btn1.setBounds(412, 442, 243, 34);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBackground(Color.cyan);
		contentPane.add(btn1);
		

		lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(454, 171, 134, 63);
		contentPane.add(lblNewLabel_1);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(412, 361, 243, 35);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Create New Account");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		       	
				setVisible(false);
				new createaccount().setVisible(true);
		        }
		        
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.cyan);
		btnNewButton.setBounds(412, 493, 243, 34);
		contentPane.add(btnNewButton);
	
		
		
	
		
		
		//background
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\loginpage.jpg"));
		lblNewLabel.setBounds(0,0,getWidth(),getHeight());
		contentPane.add(lblNewLabel);
		
		
		
	}
}
