import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
////					homepage frame = new homepage(String Username);
////					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public homepage(String Username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366,768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ViewBook_btn = new JButton("View Booked Hotel");
		ViewBook_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ViewBook_btn.setBackground(new Color(255, 127, 80));
		ViewBook_btn.setBounds(0, 408, 201, 56);
		contentPane.add(ViewBook_btn);
		
		JButton Viewpackage_btn = new JButton("View Package");
		Viewpackage_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				View_package j=new View_package(Username);
				j.setVisible(true);
			}
		});
		Viewpackage_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Viewpackage_btn.setBackground(new Color(255, 127, 80));
		Viewpackage_btn.setBounds(0, 237, 201, 56);
		contentPane.add(Viewpackage_btn);
		
		JLabel welcome = new JLabel("");
		welcome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		welcome.setBounds(1085, 11, 239, 39);
		welcome.setText("Welcome  "+Username);
		contentPane.add(welcome);
		
		JLabel lblNewLabel_2 = new JLabel(" NP Travel & Tourism.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(32, 11, 370, 44);
		contentPane.add(lblNewLabel_2);
		
		JButton Hotelbook_btn = new JButton("Book Hotel");
		Hotelbook_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Hotelbook_btn.setBackground(new Color(255, 127, 80));
		Hotelbook_btn.setBounds(0, 351, 201, 56);
		contentPane.add(Hotelbook_btn);
		
		JButton Payment_btn = new JButton("Payment");
		Payment_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Payment_btn.setBackground(new Color(255, 127, 80));
		Payment_btn.setBounds(0, 465, 201, 56);
		contentPane.add(Payment_btn);
		
		JButton Contact_btn = new JButton("Contact");
		Contact_btn.setBackground(new Color(255, 127, 80));
		Contact_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Contact_btn.setBounds(0, 522, 201, 56);
		contentPane.add(Contact_btn);
		
		JButton profile_btn = new JButton("Profile");
		profile_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				profile j=new profile(Username);
				j.setVisible(true);
			}
		});
		profile_btn.setBackground(new Color(255, 127, 80));
		profile_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		profile_btn.setBounds(0, 66, 201, 56);
		contentPane.add(profile_btn);
		
		JButton Update_btn = new JButton("Update Detail");
		Update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				Update_detail j=new Update_detail(Username);
				j.setVisible(true);
			}
		});
		Update_btn.setBackground(new Color(255, 127, 80));
		Update_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Update_btn.setBounds(0, 123, 201, 56);
		contentPane.add(Update_btn);
		
		JButton Package_btn = new JButton("Cheack Packages");
		Package_btn.setBackground(new Color(255, 127, 80));
		Package_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				package1 j = new package1(Username);
				j.setVisible(true);
			}
		});
		Package_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Package_btn.setBounds(0, 180, 201, 56);
		contentPane.add(Package_btn);
		
		JButton Hotel_btn = new JButton("Hotel Details");
		Hotel_btn.setBackground(new Color(255, 127, 80));
		Hotel_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Hotel_btn.setBounds(0, 294, 201, 56);
		contentPane.add(Hotel_btn);
		
		JButton About = new JButton("About");
		About.setBackground(new Color(255, 127, 80));
		About.setFont(new Font("Tahoma", Font.PLAIN, 18));
		About.setBounds(0, 579, 201, 56);
		contentPane.add(About);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\Home.jpg"));
		lblNewLabel.setBounds(0, 66, 1469, 663);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\orange.png"));	
		lblNewLabel_1.setBackground(new Color(255, 200, 0));
		lblNewLabel_1.setBounds(0, 0, 1350, 67);
		contentPane.add(lblNewLabel_1);
	}
}
