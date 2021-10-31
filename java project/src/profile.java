import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile frame = new profile();
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
	public profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 750, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROFILE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(291, 33, 125, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(79, 120, 93, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(79, 170, 109, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("User_name:-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(421, 129, 93, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email-ID:-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(444, 177, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Number:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(51, 224, 115, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("State:-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(466, 224, 48, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("City:-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(110, 272, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gender:-");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(444, 272, 70, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton Update_Profile = new JButton("UPDATE PROFILE");
		Update_Profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Update_detail j=new Update_detail();
				j.setVisible(true);
			}
		});
		Update_Profile.setForeground(Color.BLUE);
		Update_Profile.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		Update_Profile.setBackground(Color.ORANGE);
		Update_Profile.setBounds(151, 351, 165, 38);
		contentPane.add(Update_Profile);
		
		JButton Update_Profile_1 = new JButton("BACK");
		Update_Profile_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Update_Profile_1.setForeground(Color.BLUE);
		Update_Profile_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		Update_Profile_1.setBackground(Color.ORANGE);
		Update_Profile_1.setBounds(367, 351, 147, 38);
		contentPane.add(Update_Profile_1);
		
		JLabel first_name = new JLabel();
		first_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first_name.setBounds(194, 129, 86, 14);
		contentPane.add(first_name);
		
		JLabel last_name = new JLabel("New label");
		last_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		last_name.setBounds(194, 179, 86, 14);
		contentPane.add(last_name);
		
		JLabel mobile_no = new JLabel("New label");
		mobile_no.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mobile_no.setBounds(194, 226, 86, 14);
		contentPane.add(mobile_no);
		
		JLabel city = new JLabel("New label");
		city.setFont(new Font("Tahoma", Font.PLAIN, 14));
		city.setBounds(194, 274, 86, 14);
		contentPane.add(city);
		
		JLabel User_name = new JLabel("New label");
		User_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		User_name.setBounds(557, 129, 86, 14);
		contentPane.add(User_name);
		
		JLabel Email_id = new JLabel("New label");
		Email_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Email_id.setBounds(557, 179, 86, 14);
		contentPane.add(Email_id);
		
		JLabel state = new JLabel("New label");
		state.setFont(new Font("Tahoma", Font.PLAIN, 14));
		state.setBounds(557, 226, 86, 14);
		contentPane.add(state);
		
		JLabel gender = new JLabel("New label");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gender.setBounds(557, 274, 86, 14);
		contentPane.add(gender);
	
	     
				
			
			
	}
}
