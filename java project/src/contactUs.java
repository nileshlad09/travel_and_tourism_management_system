
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class contactUs extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username=null;
					contactUs frame = new contactUs(Username);
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
	public contactUs(String Username) {
		setBounds(300, 150, 388, 344);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setToolTipText(" ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTACT US");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 11, 298, 29);
		contentPane.add(lblNewLabel);
		
		JLabel username = new JLabel("nileshlad09");
		username.setFont(new Font("Tahoma", Font.PLAIN, 13));
		username.setBounds(172, 92, 131, 14);
		contentPane.add(username);
		
		JLabel lblNewLabel_2 = new JLabel("Have Some Questions ?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(30, 51, 273, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username:-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(77, 92, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" Email :-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(64, 117, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Your Questions:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(64, 142, 123, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(77, 167, 224, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Thank you for getting in touch!\r\n"
						+ "\r\n"
						+ "We appreciate you contacting us.\r\n"
						+ "  One of our colleagues will\r\n"
						+ "get back in touch with you soon!\r\n"
						+ "     Have a great day!\r\n");
			}
		});
		btnSendMessage.setForeground(Color.WHITE);
		btnSendMessage.setBackground(Color.BLACK);
		btnSendMessage.setBounds(112, 230, 147, 23);
		contentPane.add(btnSendMessage);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setBackground(Color.BLACK);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(112, 264, 147, 23);
		contentPane.add(btnBack);
		
		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Email.setBounds(172, 118, 190, 14);
		contentPane.add(Email);
		
		
		
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
			Statement stmt=con.createStatement();
			String sql="Select * from createaccount where username= '"+Username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {

				username.setText(rs.getString("username"));
				Email.setText(rs.getString("Email_ID"));	
		}
			} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
