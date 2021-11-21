import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class View_package extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					View_package frame = new View_package();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 * @param person 
	 * @param hotel 
	 * @param mobileNo 
	 * @param totalprice 
	 */
	public View_package(String Username, String totalprice, String mobileNo, String Package, String person) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 850, 500);
		setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIEW PACKAGE DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(77, 38, 260, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(54, 129, 108, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Package:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(54, 175, 96, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No.of persons:-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(54, 228, 108, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number:-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(54, 272, 132, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total Price:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(60, 315, 102, 21);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(229, 380, 108, 36);
		contentPane.add(btnNewButton);
		
		JLabel UserName = new JLabel("");
		UserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UserName.setBounds(276, 134, 137, 21);
		contentPane.add(UserName);
		
		JLabel Packages_ = new JLabel("");
		Packages_.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Packages_.setBounds(276, 180, 137, 21);
		contentPane.add(Packages_);
		
		JLabel no_persons = new JLabel("");
		no_persons.setFont(new Font("Tahoma", Font.PLAIN, 15));
		no_persons.setBounds(276, 233, 142, 21);
		contentPane.add(no_persons);
		
		JLabel mo_number = new JLabel("");
		mo_number.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mo_number.setBounds(276, 277, 137, 21);
		contentPane.add(mo_number);
		
		JLabel Total_pr = new JLabel("");
		Total_pr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Total_pr.setBounds(276, 320, 137, 21);
		contentPane.add(Total_pr);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\pakage1.jpg"));
		lblNewLabel_6.setBounds(445, 60, 379, 375);
		contentPane.add(lblNewLabel_6);
		
	
		UserName.setText(Username);
		mo_number.setText(mobileNo);
		Packages_.setText(Package);
		no_persons.setText(person);
		Total_pr.setText(totalprice);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				packagePayment j=new packagePayment(Username,totalprice,Package);
				j.setVisible(true);
			}
		});
		btnPay.setForeground(Color.WHITE);
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPay.setBackground(Color.BLACK);
		btnPay.setBounds(54, 380, 108, 36);
		contentPane.add(btnPay);
		
	}
}
