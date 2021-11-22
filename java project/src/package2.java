import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class package2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username=null;
					package2 frame = new package2(Username);
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
	public package2(String Username) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 750, 500);
		setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton package01btn = new JButton("Package-1");
		package01btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				package1 j=new package1(Username);
				j.setVisible(true);
			}
		});
		package01btn.setForeground(Color.WHITE);
		package01btn.setBackground(Color.DARK_GRAY);
		package01btn.setBounds(0, 0, 100, 25);
		contentPane.add(package01btn);
		
		JButton package02btn = new JButton("Package-2");
		package02btn.setForeground(Color.WHITE);
		package02btn.setBackground(Color.DARK_GRAY);
		package02btn.setBounds(101, 0, 100, 25);
		contentPane.add(package02btn);
		
		JButton package03btn = new JButton("Package-3");
		package03btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				package3 j=new package3(Username);
				j.setVisible(true);
			}
		});
		package03btn.setForeground(Color.WHITE);
		package03btn.setBackground(Color.DARK_GRAY);
		package03btn.setBounds(202, 0, 100, 25);
		contentPane.add(package03btn);
		
		JLabel textField = new JLabel();
		textField.setText("SILVER  PACKAGE");
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(283, 61, 199, 38);
		contentPane.add(textField);
		
		JLabel textField_1 = new JLabel();
		textField_1.setText("4 Days And 3 Nights");
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_1.setBounds(39, 121, 238, 28);
		contentPane.add(textField_1);
		
		JLabel textField_2 = new JLabel();
		textField_2.setText("Toll and Entrance Free Tickets ");
		textField_2.setForeground(Color.BLUE);
		textField_2.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_2.setBounds(33, 148, 353, 38);
		contentPane.add(textField_2);
		
		JLabel textField_3 = new JLabel();
		textField_3.setText("Meet and Greet at Airport");
		textField_3.setForeground(Color.RED);
		textField_3.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_3.setBounds(39, 190, 310, 28);
		contentPane.add(textField_3);
		
		JLabel textField_4 = new JLabel();
		textField_4.setText("Night safari");
		textField_4.setForeground(Color.BLUE);
		textField_4.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_4.setBounds(39, 218, 310, 31);
		contentPane.add(textField_4);
		
		JLabel textField_5 = new JLabel();
		textField_5.setText("Full Day 3 Island Cruise");
		textField_5.setForeground(Color.RED);
		textField_5.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_5.setBounds(39, 256, 282, 28);
		contentPane.add(textField_5);
		
		JLabel textField_6 = new JLabel();
		textField_6.setText("Cruise with Dinner");
		textField_6.setForeground(Color.BLUE);
		textField_6.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_6.setBounds(39, 287, 266, 34);
		contentPane.add(textField_6);
		
		JButton Book_now = new JButton("BOOK NOW");
		Book_now.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Book_package j=new Book_package(Username);
				j.setVisible(true);
			}
		});
		Book_now.setForeground(Color.BLUE);
		Book_now.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		Book_now.setBackground(Color.ORANGE);
		Book_now.setBounds(84, 348, 124, 38);
		contentPane.add(Book_now);
		
		JLabel lblNewLabel = new JLabel("Winter Special");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 397, 197, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 25,000 only");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(533, 413, 136, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\package_2.png"));
		lblNewLabel_1.setBounds(346, 127, 366, 259);
		contentPane.add(lblNewLabel_1);
	}
}
