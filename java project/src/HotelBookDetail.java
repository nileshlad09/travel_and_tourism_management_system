import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Choice;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HotelBookDetail extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
//				try {
//					String Username=null;
//					HotelBookDetail frame = new HotelBookDetail(Username);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});
	}

	public HotelBookDetail(String Username, String mobileNumber, String hotel, String price, String ac, String food2, String person, String days) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 850, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel_2 = new JLabel("Username:-");
		lblNewLabel_2.setBounds(28, 182, 123, 23);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 18));
		
		JLabel lblNewLabel_3 = new JLabel("Selected Hotel:-");
		lblNewLabel_3.setBounds(28, 235, 147, 29);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Number Of Persons:-");
		lblNewLabel_4.setBounds(28, 289, 196, 29);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 18));
		
		JLabel lblNewLabel_4_1 = new JLabel("AC/Non AC:-");
		lblNewLabel_4_1.setBounds(456, 289, 121, 29);
		contentPane.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Cambria", Font.BOLD, 18));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Food Included(Yes/No):-");
		lblNewLabel_4_1_1.setBounds(456, 235, 225, 29);
		contentPane.add(lblNewLabel_4_1_1);
		lblNewLabel_4_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		
		
		JLabel lblNewLabel_6 = new JLabel("Cost:-");
		lblNewLabel_6.setBounds(28, 347, 123, 29);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Cambria", Font.BOLD, 20));
		
		
		JLabel lblNewLabel = new JLabel("VIEW BOOKED HOTEL:-");
		lblNewLabel.setBounds(273, 76, 283, 47);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		
		JLabel lblNewLabel_5_1 = new JLabel("Mobile Number:-");
		lblNewLabel_5_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(457, 178, 147, 22);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel User_name = new JLabel("Username");
		User_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		User_name.setBounds(243, 182,147, 24);
		contentPane.add(User_name);
		
		JLabel HotelName = new JLabel("Hotelname");
	    HotelName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HotelName.setBounds(246, 238, 147, 24);
		contentPane.add(HotelName);
		
		JLabel NoPerson = new JLabel("persons");
		NoPerson.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NoPerson.setBounds(246, 292, 156, 24);
		contentPane.add(NoPerson);
		
		JLabel MobileNo = new JLabel("MobileNo");
		MobileNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MobileNo.setBounds(696, 176, 128, 24);
		contentPane.add(MobileNo);
		
		JLabel Food = new JLabel("Food");
		Food.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Food.setBounds(710, 238, 114, 24);
		contentPane.add(Food);
		
		JLabel AcN = new JLabel("AcN");
	    AcN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AcN.setBounds(701, 292, 96, 24);
		contentPane.add(AcN);

		JLabel cost = new JLabel("cost");
		cost.setForeground(Color.RED);
		cost.setFont(new Font("Tahoma", Font.ITALIC, 16));
		cost.setBounds(246, 350, 156, 24);
		contentPane.add(cost);
		
		JButton Pay_btn = new JButton("PAY");
		Pay_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			
				hotelPayment j= new hotelPayment(Username,price,hotel,ac,food2,person,days);
				j.setVisible(true);		
				}
		});
		Pay_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Pay_btn.setBackground(Color.BLACK);
		Pay_btn.setForeground(Color.WHITE);
		Pay_btn.setBounds(254, 397, 114, 37);
		contentPane.add(Pay_btn);
		
		JButton Back_btn = new JButton("BACK");
		Back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Back_btn.setForeground(Color.WHITE);
		Back_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Back_btn.setBackground(Color.BLACK);
		Back_btn.setBounds(456, 397, 114, 37);
		contentPane.add(Back_btn);
		
		JLabel lblNewLabel_4_2 = new JLabel("Number Of Days:-");
		lblNewLabel_4_2.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(451, 347, 196, 29);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel NoDays = new JLabel("<dynamic>");
		NoDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NoDays.setBounds(701, 352, 156, 24);
		contentPane.add(NoDays);
		
		
		User_name.setText(Username);
		MobileNo.setText(mobileNumber);
		NoPerson.setText(person);
		HotelName.setText(hotel);
		Food.setText(food2);
		AcN.setText(ac);
		cost.setText(price);
		NoDays.setText(days);
		
	}
}
