import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setBounds(300, 120,500, 550);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JLabel L1 = new JLabel("Travel and Tourism Management System");
		L1.setBounds(50, 10, 400, 80);
		L1.setForeground(Color.RED);
		L1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		String s = "About Projects\r\n"
			+ "\r\n"
			+ "The objective of the Travel and Tourism Management System Project is to develop a system that automates the processes and activities of a travel and the purpose is to design a system using which one can perform all operations related to travelling.\r\n"
			+ "\r\n"
			+ "This application will help in accessing the information related to the travel to the particular destination with great ease. The users can track the information related to their tours with great ease through this application.\r\n"
			+ "\r\n"
			+ "Advantages of Project:\r\n"
			+ "-Gives accurate information\r\n"
			+ "-Simplifies the manual work\r\n"
			+ "-It minimizes teh documentation related work\r\n"
			+ "-Provides up to date information\r\n"
			+ "-Friendly environment by providing warning messages \r\n"
			+ "-Travellers details can be provided\r\n"
			+ "-Booking Confirmation notification";
		contentPane.setLayout(null);
				
		
		TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
		t1.setFont(new Font("Dialog", Font.PLAIN, 16));
		t1.setEditable(false);
		t1.setBounds(24, 96, 423, 300);
		getContentPane().add(t1);
		
		JLabel lblNewLabel = new JLabel("Travel & Tourism  Mangemant System.");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(65, 21, 358, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(167, 442, 123, 29);
		contentPane.add(btnNewButton);
		
		
		
		

	}
}
