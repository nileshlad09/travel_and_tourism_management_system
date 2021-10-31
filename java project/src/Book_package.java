import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Book_package extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_package frame = new Book_package();
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
	public Book_package() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 850, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK PACKAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(100, 34, 213, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\Book package1.JPG"));
		lblNewLabel_1.setBounds(369, 63, 436, 370);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User_name:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(26, 140, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_selectpackage = new JComboBox();
		comboBox_selectpackage.setBackground(Color.WHITE);
		comboBox_selectpackage.setModel(new DefaultComboBoxModel(new String[] {"Gold Package","Silver Package","Bronze Package"}));
		comboBox_selectpackage.setForeground(Color.BLACK);
		comboBox_selectpackage.setBounds(190, 187, 123, 22);
		contentPane.add(comboBox_selectpackage);
		
		JLabel lblNewLabel_3 = new JLabel("Select Package:-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(26, 187, 123, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Persons:-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(26, 241, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(192, 238, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Number:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(26, 293, 123, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total Price:-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(26, 342, 123, 22);
		contentPane.add(lblNewLabel_6);
		
		JButton Checkprice_btn = new JButton("Check Price");
		Checkprice_btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Checkprice_btn.setForeground(Color.WHITE);
		Checkprice_btn.setBackground(new Color(0, 0, 0));
		Checkprice_btn.setBounds(26, 397, 105, 23);
		contentPane.add(Checkprice_btn);
		
		JButton Book_btn = new JButton("Book");
		Book_btn.setBackground(Color.BLACK);
		Book_btn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Book_btn.setForeground(Color.WHITE);
		Book_btn.setBounds(141, 398, 105, 23);
		contentPane.add(Book_btn);
		
		JButton Back_btn = new JButton("Back");
		Back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Back_btn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Back_btn.setForeground(Color.WHITE);
		Back_btn.setBackground(Color.BLACK);
		Back_btn.setBounds(256, 398, 105, 23);
		contentPane.add(Back_btn);
	}
}
