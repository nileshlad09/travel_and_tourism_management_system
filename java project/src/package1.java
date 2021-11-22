import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class package1 extends JFrame {

	private JPanel contentPane;
	private JLabel textField;
	private JLabel textField_1;
	private JLabel textField_2;
	private JLabel textField_3;
	private JLabel textField_4;
	private JLabel textField_5;
	private JLabel textField_6;
	private JLabel lblNewLabel_1;
	private JButton package01btn;
	private JButton package02btn;
	private JButton package03btn;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username=null;
					package1 frame = new package1(Username);
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
	public package1(String Username) {
		setBackground(Color.WHITE);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 750, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton Book_now = new JButton("BOOK NOW");
		Book_now.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Book_package j=new Book_package(Username);
				j.setVisible(true);
			}
		});
		Book_now.setBackground(Color.ORANGE);
		Book_now.setForeground(Color.BLUE);
		Book_now.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		Book_now.setBounds(63, 350, 124, 38);
		contentPane.add(Book_now);
		
		textField = new JLabel();
		textField.setText("GOLD  PACKAGE");
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(297, 38, 199, 38);
		contentPane.add(textField);
		
		textField_1 = new JLabel();
		textField_1.setText("6 Days And 7 Nights");
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_1.setBounds(48, 88, 238, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JLabel();
		textField_2.setText("Airport Assistance At Airport");
		textField_2.setForeground(Color.BLUE);
		textField_2.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_2.setBounds(48, 114, 353, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JLabel();
		textField_3.setText("Half Day City Tour");
		textField_3.setForeground(Color.RED);
		textField_3.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_3.setBounds(45, 159, 238, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JLabel();
		textField_4.setText("Welcome Drinks On Arrival");
		textField_4.setForeground(Color.BLUE);
		textField_4.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_4.setBounds(47, 198, 310, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JLabel();
		textField_5.setText("Daily Buffet");
		textField_5.setForeground(Color.RED);
		textField_5.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		textField_5.setBounds(45, 239, 238, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JLabel();
		textField_6.setText("Full Day 3 Island Arrival");
		textField_6.setForeground(Color.BLUE);
		textField_6.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		textField_6.setBounds(45, 278, 266, 34);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("Summer Special");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(63, 399, 197, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 12,000 only");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(488, 399, 136, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\package_1.jpg"));
		lblNewLabel_1.setBounds(356, 102, 347, 244);
		contentPane.add(lblNewLabel_1);
		
		package01btn = new JButton("Package-1");
		package01btn.setForeground(Color.WHITE);
		package01btn.setBackground(Color.DARK_GRAY);
		package01btn.setBounds(0, 0, 100, 25);
		contentPane.add(package01btn);
		
		
		package02btn = new JButton("Package-2");
		package02btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				package2 j=new package2(Username);
				j.setVisible(true);
			}
		});
		package02btn.setForeground(Color.WHITE);
		package02btn.setBackground(Color.DARK_GRAY);
		package02btn.setBounds(101, 0, 100, 25);
		contentPane.add(package02btn);
		
		package03btn = new JButton("Package-3");
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
	}
}
